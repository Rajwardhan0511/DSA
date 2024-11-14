public class _05SelectionSort {
    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 6, 4, 7, 8, 1 };
        System.out.println("Before Sorting:");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        int result[] = selectionSort(arr);

        System.out.println("\nAfter Sorting:");
        for (int a : result) {
            System.out.print(a + " ");
        }
    }
}
