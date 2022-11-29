package de.neuefische;

public class Main {
    public static void main (String[] args) {
        int a = 10;
        int b = 5;

        int c = doubleTheNumber(a);
        int d = doubleTheNumber(b);

        System.out.println(c);
        System.out.println(d);

        helloWorld();
        helloWorld();

        String greeting1 = greet("Doreen");
        String greeting2 = greet("Christian");

        System.out.println(greeting1);
        System.out.println(greeting2);
    }

    public static int doubleTheNumber(int number) {
        int result = number * 2;
        return result;
    }

    public static String greet(String name) {
        return "Hello " + name;
    }

    public static int sumTheNumbers (int number1, int number2, int number3) {
        int result = number1 + number2 + number3;
        return result;
    }

    public static void greet2Persons (String name1, String name2) {
        System.out.println("Hello " + name1);
        System.out.println("Hello " + name2);
    }

    public static void helloWorld () {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }
}