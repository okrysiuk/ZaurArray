package Lesson18;

public class DZ_Sorting {

    public static int[] sorting(int [] array){
        for(int i = 0; i < array.length; i++){
            int min = array[i]; //Предполагаем что первый элемент массива наименший
            int min_i = i;      //Индекс минимального элемента
            //Исчем минимальный элемент и его индекс
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < min){
                    min = array[j];
                    min_i = j;
                }
            }
            /*Если индекс найдено элемента не совпадает с текущим
            меняем элементы массива местами*/
            if(i != min_i){
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
        return (array);
    }

    public static void main(String[] args) {
        int [] array = {144, 45, 88, 1000, 1, -89};
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sorting(array);
        System.out.println();
        for(int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
        }

    }

}
