package grades;

import util.Input;

import java.util.*;

public class GradesApplication {
    public static Input sc = new Input();

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student s1 = new Student("Jon");
        Student s2 = new Student("Bill");
        Student s3 = new Student("Laura");
        Student s4 = new Student("Jeron");
        s1.attendance.put("2022-2-26", "P");
        s2.attendance.put("2022-2-26", "P");
        s3.attendance.put("2022-2-26", "P");
        s4.attendance.put("2022-2-26", "A");
        for (int i = 0; i < 4; i++) {
            s1.addGrade(rng());
            s2.addGrade(rng());
            s3.addGrade(rng());
            s4.addGrade(rng());
        }
        students.put("jclark127", s1);
        students.put("billGuy123", s2);
        students.put("SuitcaseCoder", s3);
        students.put("RoddyTackle", s4);
        runProgram(students);
    }

    public static int rng() {
        return (int) (Math.random() * (100 - 59) + 1) + 59;
    }

    public static void runProgram(HashMap<String, Student> students) {
        boolean keepGoing = true;
        while (keepGoing) {
            mainMenu();
            String entry = sc.getString("Please make a selection").toLowerCase();
            switch (entry) {
                case "1":
                    viewSingleStudent(students);
                    break;
                case "2":
                    viewAllStudents(students);
                    break;
                case "3":
                    viewClassAverage(students);
                    break;
                case "4":
                    getCsvFormat(students);
                    break;
                case "5":
                    recordAttendance(students);
                case "e":
                    System.out.println("Program Exited.");
                    keepGoing = false;
                default:
                    System.out.println("That is not one of the choices.");
                    System.out.println();
                    break;
            }
            System.out.println();
            keepGoing = sc.yesNo("Return to main menu? y/n");
        }
    }


    public static void mainMenu() {
        System.out.println("--------------- Main Menu ---------------");
        System.out.println("1. View Single Student Grades.");
        System.out.println("2. View all Grades for all Students.");
        System.out.println("3. View student class average.");
        System.out.println("4. Get printable CSV format.");
        System.out.println("5. Record attendance.");
        System.out.println("E. Exit.");
        System.out.println();
    }


    public static void viewSingleStudent(HashMap<String, Student> students) {
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Welcome!!");
            System.out.println();
            System.out.println("Here are the Github usernames for our students:");
            System.out.println();
            students.forEach((key, value) -> System.out.printf("|%s| ", key));
            System.out.println();
            System.out.println();
            String query = sc.getString("Which Student would you like to see more information on?");
            System.out.println();

            try {
                System.out.printf("Name: %s - Github username: %s%nCurrent average: %.2f%nAttendance Percentage: %.2f%%", students.get(query).getName(), query, students.get(query).getAverage(), students.get(query).calculatePercentage());
                System.out.println();
            } catch (Exception e) {
                System.out.println("Not Found.");
                System.out.println();
            }
            keepGoing = sc.yesNo("Would you like to see another student? y/n");
            System.out.println();
        }
    }

    public static void viewAllStudents(HashMap<String, Student> students) {
        students.forEach((key, value) -> {
            System.out.println(value.getName());
            System.out.print("Grades: ");
            value.grades.forEach((grade -> System.out.print(grade + " ")));
            System.out.println();
            System.out.println("Average: " + value.getAverage());
            System.out.println();
        });
    }

    public static void viewClassAverage(HashMap<String, Student> students) {
        double sum = 0;
        for (Student student : students.values()) {
            sum += student.getAverage();
        }
        System.out.println("Class average: " + sum / students.size());
    }

    public static void getCsvFormat(HashMap<String, Student> students) {
        System.out.println("name,github_username,average");
        students.forEach((key, value) -> System.out.printf("%s,%s,%.2f%n", value.name, key, value.getAverage()));
    }

    public static void recordAttendance(HashMap<String, Student> students) {
        boolean keepGoing = true;
        while (keepGoing) {
            students.forEach((key, value) -> System.out.printf("|%s| ", key));
            System.out.println();
            System.out.println();
            String query = sc.getString("Which Student would you like to add an attendance record for?");
            System.out.println();
            try {
                String key = sc.getString("Enter the date yyyy-mm-dd");
                String value = sc.getString("Enter \"A\" for absent and \"P\" for present");
                if (!value.equalsIgnoreCase("a") || value.equalsIgnoreCase("p")) {
                    System.out.println("Please enter a valid inout");
                } else {
                    students.get(query).attendance.put(key, value);
                }
            } catch (Exception e) {
                System.out.println("Not Found.");
                System.out.println();
            }
//            String date = sc.getString("Enter the date");
//            for(Student student : students.values()){
//                String aOrP = sc.getString("Enter attendance for " + student.getName() + " A/P");
//                if(!aOrP.equalsIgnoreCase("a") || aOrP.equalsIgnoreCase("p")){
//                    System.out.println("Please enter A or P.");
//                    keepGoing = false;
//                } else {
//                    student.attendance.put(date, aOrP);
//                    System.out.println(student.attendance.values());
//                }
//            }
            keepGoing = sc.yesNo("Would you like to continue? y/n");
        }
    }
}
