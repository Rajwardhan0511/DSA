import java.util.Scanner;

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

        int result[] = selectionSort(arr);

        System.out.println("\nAfter Sorting:");
        for (int a : result) {
            System.out.print(a + " ");
        }

        sc.close();
    }
}
