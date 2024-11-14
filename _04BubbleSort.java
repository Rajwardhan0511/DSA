public class _04BubbleSort {
    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 6, 4, 7, 8, 1 };
        System.out.println("Before Sorting:");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        int result[] = bubbleSort(arr);

        System.out.println("\nAfter Sorting:");
        for (int a : result) {
            System.out.print(a + " ");
        }
    }
}
