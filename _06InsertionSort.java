public class _06InsertionSort {
    private static int[] insertionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[] = { 3, 2, 6, 4, 7, 8, 1 };
        System.out.println("Before Sorting:");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        int result[] = insertionSort(arr);

        System.out.println("\nAfter Sorting:");
        for (int a : result) {
            System.out.print(a + " ");
        }
    }
}
