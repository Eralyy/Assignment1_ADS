public class Task7_Reverse {

    public static void reversePrint(int[] arr, int n) {
        if (n == 0) return;
        System.out.print(arr[n - 1] + " ");
        reversePrint(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,4,6,2};
        reversePrint(arr, arr.length);
    }
}