package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int[] array = {5, 4, 6, 3, 2, 9, 7, 8, 1, 5, 7};
        int[] array1 = {323, 545, 676, 23 ,7687, 8, 3445, 67, 8, 32, 5656, 2132, 565, 6, 56, 76, 7, 1};
        //System.out.println("Max : " + getMaximum(array));
        //System.out.println("Min : " + getMinimum(array));
        getMaxAndMinInHalfComparisons(array1);
    }
    private static int getMaximum(int[] array) {
        /*
                TC : O(n)
                SC : O(1)
         */
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        return maxNum;
    }
    private static int getMinimum(int[] array) {
        /*
                TC : O(n)
                SC : O(1)
         */
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }
        return minNum;
    }
    private static void getMaxMinInSorted(int[] array) {
        /*
                For sorted array
                TC : O(N LogN)
                SC : O(1) (no other space than original array)
                   : O(LogN) (recursive stack space)
         */
        Arrays.sort(array);
        System.out.println("Max : " + array[0]);
        System.out.println("Min : " + array[array.length-1]);
    }
    private static void getMaxAndMinInHalfComparisons(int[] array) {
        /*
                half comparisons => n/2
                TC : O(n/2) => O(n)
                SC : O(1)
         */
        boolean flag = true;
        if (array.length % 2 != 0) {
            flag = false;
        }
        int  maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length-1; i = i+2) {
            int max = Math.max(array[i], array[i+1]);
            maxNum = Math.max(max, maxNum);
            int min = Math.min(array[i], array[i+1]);
            minNum = Math.min(min, minNum);
        }
        if (!flag) {
            minNum = Math.min(minNum, array[array.length-1]);
            maxNum = Math.max(maxNum, array[array.length-1]);
        }
        System.out.println("Max : " + maxNum);
        System.out.println("Min : " + minNum);
    }
}
