package Lesson18;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int [] array1 = {45, 38, 4, -7, 6, 100};
        int [] array2;
        array2 = new int[]{1, 2, 3, 5, 4, 6, 7};
        int [] array3;
        array3 = new int[]{1, 2};

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        Arrays.sort(array1);

        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
