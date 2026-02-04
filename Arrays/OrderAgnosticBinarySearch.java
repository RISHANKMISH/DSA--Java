public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {

        int[] arr = {98, 95, 54, 32, 12, 9};
        int kkey = 9;

        int result = DifferentOrderBinarySearch(arr, kkey);
        System.out.println(result);
    }

    static int DifferentOrderBinarySearch(int[] arr, int kkey) {

        int start = 0;
        int end = arr.length - 1;

        boolean Asc = arr[start] < arr[end];

        while (start <= end) {

            int middle = start + (end - start) / 2;

            if (arr[middle] == kkey) {
                return middle;
            }

            if (Asc) {
                if (kkey < arr[middle]) {

                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (kkey > arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
