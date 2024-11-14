public class _02BinarySearch {
    private static int BinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 6, 4, 7, 8, 1 };
        int target = 8;
        int result = BinarySearch(arr, target);
        if (result != -1) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}
