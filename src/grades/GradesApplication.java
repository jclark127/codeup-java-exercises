package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student>students = new HashMap<>();
        Student s1 = new Student("Jon");
        Student s2 = new Student("Bill");
        Student s3 = new Student("Laura");
        Student s4 = new Student("Jeron");
        for (int i = 0; i <4; i++){
            s1.addGrade(rng());
            s2.addGrade(rng());
            s3.addGrade(rng());
            s4.addGrade(rng());
        }

    }

    public static int rng (){
        return (int)(Math.random() * (100-59) + 1) + 59;
    }
}
