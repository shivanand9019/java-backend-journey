class Calculator {
    // Compile Time Polymorphism -> Method Overloding
    public int add(int a, int b) {
        return a + b;
    }

    public double add(int a, int b, int c) {
        return a + b + c;

    }

}

class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

//method overriding

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 7));
        System.out.println(calc.add(9, 8, 7));

        Animal a1 = new Cat();
        a1.sound();

    }

}
