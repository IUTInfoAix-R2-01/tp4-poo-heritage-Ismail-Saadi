package YAIP4;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Rex");

        System.out.println(cat);
        System.out.println(dog1);
        
        cat.greets();
        dog1.greets();
        dog1.greets(dog2);
    }
}

