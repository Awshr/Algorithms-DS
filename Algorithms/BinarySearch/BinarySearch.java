package Algorithms.BinarySearch;
class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        int n = 22;
       System.out.println("For index number " + n + "\n is : " + binarySearch(arr, n));
    }

 
    public static int binarySearch(int[] arr, int target) {
        return binarySearch(arr, target, 0, (arr.length - 1) / 2, arr.length - 1);
    }

    public static int binarySearch(int[] arr, int target, int low, int mid, int high) {
        if (arr[mid] == target) return mid;
        if(high >= low) {
            if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, ((mid+1) + high) / 2, high);
            }
            else if (arr[mid] > target) {
                return binarySearch(arr, target, low, ((mid-1) + low) / 2, mid - 1);
            }
        }
        return -1;
    }
    
    // public static int binarySearch(int[] arr, int target) {
    //     int high = arr.length - 1;
    //     int low = 0;
    //     int key = 0;

    //     while(high >= low) {
    //         key = (high + low) / 2;
    //         // System.out.println(key);
    //         if(arr[key] == target) return key;

    //         else if(arr[key] > target) {
    //             high = key - 1;
    //         }

    //         else if(arr[key] < target) {
    //             low = key + 1;
    //         }
    //     }
    //     return -1;
    // }

    public static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == target)
                return i;
        return -1;
    }
}