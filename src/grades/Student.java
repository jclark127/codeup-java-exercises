package grades;

import java.util.ArrayList;

public class Student {
    public String name;
    public ArrayList<Integer> grades;
    public String gitHubUser;

    public Student (String name, String gitHubUser) {
        this.name = name;
        grades = new ArrayList<>();
        this.gitHubUser = gitHubUser;
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
