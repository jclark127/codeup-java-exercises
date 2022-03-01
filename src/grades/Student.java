package grades;

import javax.swing.text.html.HTMLWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    public String name;
    public ArrayList<Integer> grades;
    public HashMap<String, String> attendance;


    public Student (String name) {
        this.name = name;
        grades = new ArrayList<>();
        attendance = new HashMap<>();
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
