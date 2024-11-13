public class _01LinerSearch {
    private static int linerSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 6, 4, 7, 8, 3 };
        int target = 8;
        int result = linerSearch(arr, target);
        if (result != -1) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}