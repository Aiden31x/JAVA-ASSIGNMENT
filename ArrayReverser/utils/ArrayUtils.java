package ArrayReverser.utils;

public class ArrayUtils {
    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
}
