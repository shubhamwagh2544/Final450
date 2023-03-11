package array;

import com.google.common.collect.Collections2;
import com.google.common.primitives.Ints;
import org.apache.commons.lang3.ArrayUtils;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        //reverseArray(array);
        //reverseArray1(array);
        //reverseArray2(array);
        reverseArray3(array);
    }

    private static void reverseArray(int[] array) {
        /*
            using ArrayUtils.reverse() method : commons.lang3
            TC : O(n)
            SC : O(1)
         */
        ArrayUtils.reverse(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverseArray1(int[] array) {
        /*
            swapping
            TC : O(n)
            SC : O(1)
         */
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

    private static void reverseArray2(int[] array) {
        /*
                conversion int to Integer to list
                TC : O(n)
                SC : O(1)
         */
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.reverse(list);
    }

    private static void reverseArray3(int[] array) {
        /*
                naive timepass : use String methods
                TC : o(n) + O(n) => O(n)
                SC : O(n) + O(n) => O(n)
         */
        StringBuilder str = new StringBuilder();
        for (int i = array.length-1; i >= 0; i--) {
            str.append(i).append(" ");
        }
        String[] split = str.toString().split(" ");

        Integer[] arr = new Integer[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

}
