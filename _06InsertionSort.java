import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element at index "+i+": ");
            arr[i] = sc.nextInt();
        }

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
