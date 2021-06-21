package Algorithms.RecursiveBinarySearch;

public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] arr, int target) {
        return recursiveBinarySearch(arr, target, 0, (arr.length - 1) / 2, arr.length - 1);
    }

    // The helper method
    public static int recursiveBinarySearch(int[] arr, int target, int low, int mid, int high) {
        if (arr[mid] == target) return mid;
        if(high >= low) {
            if (arr[mid] < target) {
                return recursiveBinarySearch(arr, target, mid + 1, ((mid+1) + high) / 2, high);
            }
            else if (arr[mid] > target) {
                return recursiveBinarySearch(arr, target, low, ((mid-1) + low) / 2, mid - 1);
            }
        }
        return -1;
    }
}