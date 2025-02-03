package ArraySumFinder.utils;

public class ArrayUtils {
    public static int findSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
