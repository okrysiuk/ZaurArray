package Lesson18;

public class MinMax {

    public  static void maxMin(double [] array) {
        double max = array[0];
        double min  = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min  = array[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }

    public static void main(String[] args) {
        double [] array = {1.2, 0.1, 45.9, 12.0};
        maxMin(array);
    }
}
