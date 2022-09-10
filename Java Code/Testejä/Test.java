import java.util.Scanner;

class BaseClass {

    public BaseClass() {
        System.out.println("Hello from BaseClass");
    }

    public void printMe() {
        System.out.println("Bye now from BaseClass!");
    }
}

class DerivedClass1 extends BaseClass {

    public DerivedClass1() {
        System.out.println("Hello from DerivedClass1");
    }

    public void printMe() {
        System.out.println("Bye now from DerivedClass1!");
    }
}

class DerivedClass2 extends DerivedClass1 {

    public DerivedClass2() {
        System.out.println("Hello from DerivedClass2");
    }

    public void printMe() {
        System.out.println("Bye now from DerivedClass2!");
    }
}

/*
 * public class TestBase {
 * public static void main(String[] args) {
 * DerivedClass1 myDerived = new DerivedClass2();
 * myDerived.printMe();
 * }
 * }
 */