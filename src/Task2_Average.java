public class Task2_Average {

    public static int sum(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,1};
        int s = sum(arr, arr.length);
        System.out.println((double)s / arr.length);
    }
}