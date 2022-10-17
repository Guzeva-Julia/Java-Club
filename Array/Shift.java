import java.util.Arrays;

public class Shift {

    public static void main(String[] args) {
        int[] array = {2, 4, 5, 7, 8, 6};
        System.out.println(Arrays.toString(array));
        shift(array);
        System.out.println(Arrays.toString(array));
    }

    public static void shift(int[] arr) {
        int ind = arr.length - 1;
        int tmp = arr[ind];
        System.arraycopy(arr, 0, arr, 1, ind);
        arr[0] = tmp;
    }
}