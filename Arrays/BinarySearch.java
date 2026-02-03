import java.util.*;

public class BinarySearch {
        

    static int BinarySearchAlgo(int[] arr, int target) {

        int start = 0;

        int end = arr.length - 1;

        

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 11, 22, 43, 55, 66, 67};

        int target = 67;

        int result = BinarySearchAlgo(arr, target);

        if (result == -1) {
            System.out.println("Key not found");
        }

        else {
            System.out.println("Element found at" + result);
        }

    }
        

        
}
