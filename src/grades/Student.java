package grades;

import java.util.ArrayList;

public class Student {
    public String name;
    public ArrayList<Integer> grades;

    public Student (String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName (){
        return name;
    }

    public void addGrade (int grade){
        grades.add(grade);
    }

    public double getAverage (){
        double avg = 0.0;
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        avg = (double) sum / grades.size();
        return avg;
    }

    public static void main(String[] args) {
        Student student = new Student("Jon");
        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(99);
        System.out.printf("student.getAverage() = %.2f%n", student.getAverage());
        student.addGrade(98);
        System.out.printf("student.getAverage() = %.2f%n", student.getAverage());
    }
}
