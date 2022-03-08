package contactsManager;

import util.Input;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ContactsManager {
    public static String headerRow;
    public static ArrayList<String> names = new ArrayList<>();
    public static ArrayList<String> numbers = new ArrayList<>();
    public static Input sc = new Input();


    public static void main(String[] args) {
        try {
            readFiles();
            runProgram();
            writeFiles();
        } catch (Exception e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
    }


    public static void readFiles() throws ArrayIndexOutOfBoundsException {
        Path file = Paths.get("src/contactsManager/contacts.txt");
        Charset charset = StandardCharsets.US_ASCII;
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line;
            headerRow = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                names.add(values[0]);
                numbers.add(values[1]);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Warning!!! File you are trying to access has no content.");
        }
    }

    public static void runProgram() {
        boolean keepGoing = true;
        while (keepGoing) {
            mainMenu();
            String entry = sc.getString("Please select one of the following.");
            switch (entry) {
                case "1":
                    viewContacts();
                    break;
                case "2":
                    addEntry();
                    break;
                case "3":
                    searchEntries();
                    break;
                case "4":
                    deleteEntry();
                    break;
                case "5":
                    keepGoing = false;
                    System.out.println("Program Exiting...");
                    break;
                default:
                    System.out.println("That is not one of the choices.");

            }
        }
    }

    public static void mainMenu() {
        System.out.println();
        System.out.println("--------------- Contacts Manager ---------------");
        System.out.println("1. View Contacts");
        System.out.println("2. Add a new Contact.");
        System.out.println("3. Search for a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit");
        System.out.println();
    }

    public static void viewContacts() throws IndexOutOfBoundsException {
        try {
            System.out.println();
            System.out.printf("Name     \t | \t\tPhone number%n");
            System.out.println("--------------------------------");
            for (int i = 0; i < names.size(); i++) {

                System.out.printf("%s     \t | \t\t%s %n", names.get(i), numbers.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There are no contacts to display.");
        }
    }

    public static void addEntry() {
        String name;
        String number;
        name = sc.getString("Enter entry name.");
        if (names.contains(name.toLowerCase())) {
            boolean overwrite = sc.yesNo("There is already an entry for " + name + ", would you like to overwrite entry? y/n?");
            if (overwrite) {
                number = sc.getString("Enter phone number for " + name + ".");
                int i = names.indexOf(name.toLowerCase());
                numbers.remove(i);
                numbers.add(i, phoneNumberFormatter(number));
                System.out.println("Contact updated.");
            } else {
                addEntry();
            }
        } else {
            number = sc.getString("Enter entry phone number.");
            names.add(name);
            numbers.add(phoneNumberFormatter(number));
        }
    }

    public static void searchEntries() {
        System.out.println();
        String query = sc.getString("Enter the name you would like to look for.").toLowerCase();
        int i = names.indexOf(query.toLowerCase());
        System.out.println();
        if (i != -1) {
            System.out.println();
            System.out.println(names.get(i) + " -- " + numbers.get(i));
            System.out.println();
        } else {
            System.out.println("Contact not found.");
            System.out.println();
        }
    }

    public static void deleteEntry() throws IndexOutOfBoundsException {
        System.out.println();
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        String query = sc.getString("Enter the name of the entry you would like to delete.");
        try {
            int i = names.indexOf(query);
            names.remove(i);
            numbers.remove(i);
            System.out.println(query + " has been removed from your contacts.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There are no contacts to modify.");
        }
    }

    public static void writeFiles() {
        Path file = Paths.get("src/contactsManager/contacts.txt");
        Charset charset = StandardCharsets.US_ASCII;
        String line;
        try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
            writer.write(headerRow + "\n");
            for (int i = 0; i < names.size(); i++) {
                line = String.format("%s,%s%n", names.get(i), numbers.get(i));
                writer.write(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

    public static String phoneNumberFormatter(String number) {
        if (number.length() == 7) {
            number = number.replaceFirst("((\\d{3})(\\d+))", "$2-$3");
        } else if (number.length() == 10) {
            number = number.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3");
        }
        return number;
    }
}
