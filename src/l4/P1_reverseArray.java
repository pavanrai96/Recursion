package l4;

public class P1_reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int left = 0;
        int right = arr.length - 1;
        int i = 0;
         normalReverse(arr);
       //  recursionReverse(arr,left,right);
        //single parameter
       // recursionReverse2(arr, i);
        for (int x : arr)
            System.out.println(x);
    }

    private static void recursionReverse2(int[] arr, int i) {
        if (i >= arr.length / 2)
            return;
        swap(arr, i, arr.length - i - 1);
        recursionReverse2(arr, i + 1);
    }

    private static void recursionReverse(int[] arr, int left, int right) {
        if (left >= right)
            return;
        swap(arr, left, right);
        recursionReverse(arr, left + 1, right - 1);

    }

    private static void normalReverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
