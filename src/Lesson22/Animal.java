package Lesson22;

public class Animal {
    Animal(int e){
        eyes = e;
        System.out.println("I am animal.");
    }
    public static int eyes;
    public static void eat(){
        System.out.println("Animal eats.");
    }
    public static void drink(){
        System.out.println("Animal drinks.");
    }
}
class Pet extends Animal {
    Pet(){
        super(2);
        System.out.println("I am pet.");
    }
    int tail = 1;
    int paw = 4;
    public static void run(){
        System.out.println("Pet runs.");
    }
    public static void jump(){
        System.out.println("Pet jumps.");
    }

}

class Dog extends Pet {
    String name;
    void showInfo() {
        System.out.println("I am dog and my name is " + name);
    }
    Dog(String n){
        name = n;
        showInfo();
    }
    public static void play() {
        System.out.println("Dog plays.");
    }
}


class Cat extends Pet {
    String name;
    void showInfo() {
        System.out.println("I am cat and my name is " + name);
    }
    Cat(String n){
        name = n;
        showInfo();
    }
    public static void sleep() {
        System.out.println("Cat sleeps.");
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Killer");
        Cat cat = new Cat("Puss");
        System.out.println(dog.paw);
        cat.sleep();
    }
}