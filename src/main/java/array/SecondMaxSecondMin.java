package array;

public class SecondMaxSecondMin {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {21, 22, 29, 28, 27, 23, 25, 24, 26, 29, 28, 27, 29, 12, 27, 28, 29},
                {5, 4, 3, 2, 1}
        };

        for (int i = 0; i < 3; i++) {
            getSecondMax(array[i]);
            getSecondMin(array[i]);
        }
    }

    private static void getSecondMax(int[] array) {
        /*
                if array element is greater than max
                UPDATE secondMax = max;
                UPDATE max = element;

                if all elements in descending order
                then check if : secondMax < element < max

         */
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            }
            if (array[i] < max && array[i] > secondMax) {
                secondMax = array[i];
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Second Max : " + secondMax);
    }

    private static void getSecondMin(int[] array) {
        /*

         */

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                secondMin = min;
                min = array[i];
            }
            if (array[i] > min && array[i] < secondMin) {
                secondMin = array[i];
            }
        }
        System.out.println("Min : " + min);
        System.out.println("Second Min : " + secondMin);
    }
}
