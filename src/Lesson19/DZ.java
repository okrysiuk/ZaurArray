package Lesson19;

public class DZ {
    public static String [] abc (String [] ... array){
        int l = 0;
        int i = 0;
        //Сначала узнаем длинну массива, который нужно создать
        for(String [] b: array){
            l += b.length;
//            for(String c : b){
//                System.out.print(c + " ");
//            }
        }

//        System.out.println();
        //Создаем массив известной длинны

        String [] s = new String[l];

        //Заполняем массив элементами
        for(String [] b: array){
            l += b.length;
            for(String c : b){
                s[i] = c;
                i += 1;
            }
        }
//
//        for(String st: s){
//            System.out.print(st + " ");
//        }
//        System.out.println();
        return s;

    }

    public static void some(String[] args) {
        String [] a1 = {"Hello", "Hi", "Aloha"};
        String [] a2 = {"Bye", "Hasta la vista", "Aloha"};
        String [] a3 = {"Something"};
        String [] sabc = abc(a1, a2, a3);
        for(int i = 0; i < args.length; i++){
            String in = args[i];
            for(int j = 0; j < sabc.length; j++){
                if(sabc[j].equals(in)){
                    sabc[j] = "null";
                }
            }
        }
        for(String s : sabc){
            System.out.print(s + " ");
        }

    }

    public static void main(String[] args) {
        some(new String[] {"Hello", "Aloha"});
    }
}
