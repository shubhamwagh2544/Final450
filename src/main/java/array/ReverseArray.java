package array;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
    }

    private static void reverseArray(int[] array) {
        /*
            using ArrayUtils.reverse() method : commons.lang3
         */
        ArrayUtils.reverse(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverseArray2(int[] array) {
        int start = 0;
        int end = array.length-1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(array));
    }

}
