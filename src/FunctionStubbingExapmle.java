import util.Input;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FunctionStubbingExapmle {

        public static String headerRow;
        public static ArrayList<String> names = new ArrayList<>();
        public static ArrayList<String> numbers = new ArrayList<>();
        public static Input sc = new Input();


        public static void main(String[] args) { // main
            try {
                readFiles();
                runProgram();
                writeFiles();
            } catch (Exception e) {
                System.out.println("Something went wrong.");
                e.printStackTrace();
            }
        }


        public static void readFiles() throws ArrayIndexOutOfBoundsException { //reads data (if any) from text file and populates list

        }

        public static void runProgram() { //gets user entry for main menu prompt and executes corresponding function

        }

        public static void mainMenu() {  //prompt for main menu

        }

        public static void viewContacts() throws IndexOutOfBoundsException { //lists all contacts in phonebook

        }

        public static void addEntry() { // adds an entry in the phone book

        }

        public static void searchEntries() { // searches entries in phonebook by name

        }

        public static void deleteEntry() throws IndexOutOfBoundsException { //removes entries by name

        }

        public static void writeFiles() { // saves entries in phonebook to .txt file

        }

        public static String phoneNumberFormatter(String number) { // adds a dash to phone number
            return "";
        }


}
