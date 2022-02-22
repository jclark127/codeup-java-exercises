
import util.Input;

import java.util.Arrays;

public class ArrayExercises {

    public static void main(String[] args) {
        Person p1 = new Person("Jon");
        Person p2 = new Person("Bill");
        Person p3 = new Person("Laura");
        Person[] people = {p1, p2, p3};
        Person p4 = new Person("Jeron");
        System.out.println("First Array: ");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
        System.out.println();
        System.out.println("Second array:");
        people = addPerson(people,p4);
        for (int i = 0; i   < people.length; i++){
            System.out.println(people[i].getName());
        }
    }

    public static Person[] addPerson (Person[] people, Person person){
        Person[] otherPeople = new Person[people.length +1];
        for(int i=0; i <people.length; i++){
            otherPeople[i] = people[i];
        }
        otherPeople[otherPeople.length-1] = person;
        return otherPeople;
    }
}
