class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {
        Animal a;   // reference of parent class

        a = new Dog();  // object of Dog
        a.sound();

        a = new Cat();  // object of Cat
        a.sound();
    }
}