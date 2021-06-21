package Algorithms.BinarySearch;

class BinarySearch {
    
    public static int binarySearch(int[] arr, int target) {
        int high = arr.length - 1;
        int low = 0;
        int key = 0;

        while(high >= low) {
            key = (high + low) / 2;
            // System.out.println(key);
            if(arr[key] == target) return key;

            else if(arr[key] > target) {
                high = key - 1;
            }

            else if(arr[key] < target) {
                low = key + 1;
            }
        }
        return -1;
    }
}