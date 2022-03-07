package contactsManager;

import util.Input;

import java.util.ArrayList;

public class ContactsManager {
    public static ArrayList<String> names = new ArrayList<>();
    public static ArrayList<String> numbers = new ArrayList<>();
    public static Input sc = new Input();



    public static void main(String[] args) {


    }


    public static void readFiles(){}

    public static void runProgram(){
        boolean keepGoing = true;
        while (keepGoing){
            mainMenu();
            String entry = sc.getString("Please select one of the following.");
            switch (entry){
                case "1":
                    //viewContacts();
                    break;
                case "2":
                    //addEntry();
                    break;
                case "3":
                    //searchEntries();
                    break;
                case "4":
                    //deleteEntry();
                    break;
                case "5":
                    //keepgoing = false;
                    System.out.println("Program Exiting...");
                    break;
                default:
                    System.out.println("That is not one of the choices.");

            }
        }
    }

    public static void mainMenu(){
        System.out.println();
        System.out.println("--------------- Contacts Manager ---------------");
        System.out.println("1. View Contacts");
        System.out.println("2. Add a new Contact.");
        System.out.println("3. Search for a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit");
        System.out.println();
    }

    public static void viewContacts(){}

    public static void addEntry(){}

    public static void searchEntries(){}

    public static void deleteEntry(){}

    public static void writeFiles(){}
}
