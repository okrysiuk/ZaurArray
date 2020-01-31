package Lesson21;

import java.util.ArrayList;
import java.util.Collections;

public class L21DZ {
    public  static ArrayList <String> abc(String ... strings){
        ArrayList <String> list1 = new ArrayList<>();
        for(String s: strings){
            list1.add(s);
        }
        Collections.sort(list1);
        for(int i = 0; i < (list1.size() - 1); i++){
            String s1 = list1.get(i);
            String s2 = list1.get(i + 1);
            if(s1 == s2){
                list1.remove(i);
            }
        }
        return list1;
    }

    public static void main(String[] args) {
        ArrayList <String> res = new ArrayList<>();
        res = abc("Hello", "Hi", "Aloha", "Aloha", "Hi", "Hello");
        for (String s : res){
            System.out.print(s + " ");
        }
    }
}

