import java.util.*;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + name + ".");
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jon");
        Person p2 = new Person("Jon");

        System.out.println(p1.getName().equals(p2.getName())); // checks if values are the same
        System.out.println(p1 == p2); // checks if object is the same

        Person p3 = new Person("Jon"); // new person object
        Person p4 = p3; // will always return the same value p3
        System.out.println(p3 == p4); // returns true

        System.out.println(p3.getName()); // returns jon
        System.out.println(p4.getName()); // returns jon
        p4.setName("Bill"); //changes value of both p3 and p4
        System.out.println(p3.getName()); // returns bill
        System.out.println(p4.getName()); // returns bill
    }
}
