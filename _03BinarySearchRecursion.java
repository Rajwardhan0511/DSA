public class _03BinarySearchRecursion {
    private static int BinarySearchRecursion(int[] arr, int target, int left, int right){
        
        if(left<=right){
            int mid = (left + right) / 2;

            if(arr[mid]==target){
                return mid;
            } else if (arr[mid] < target) {
                return BinarySearchRecursion(arr, target, mid+1, right);
            } else {
                return BinarySearchRecursion(arr, target, left, mid-1);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = { 3, 2, 6, 4, 7, 8, 3 };
        int target = 8;
        int left = 0;
        int right = arr.length-1;
        int result = BinarySearchRecursion(arr, target, left, right);
        if (result != -1) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}