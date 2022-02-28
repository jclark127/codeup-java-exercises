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


}
