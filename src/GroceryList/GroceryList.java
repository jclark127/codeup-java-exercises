package GroceryList;

import util.Input;

import java.util.HashMap;

public class GroceryList {
    public static Input sc = new Input();
    public static String[] categories = {"Produce", "Dairy", "Frozen", "Meat", "Other"};
    public static HashMap<ListItem, Integer> groceryList = new HashMap<>();

    public static void main(String[] args) {
        groceryList.put(createListItem(), sc.getInt("Enter quantity."));
        viewList();
    }

    public static void mainMenuPrompt() {
        System.out.println();
        System.out.println("-----------Grocery List App ---------------");
        System.out.println("1. Create new list item.");
        System.out.println("2. View finalized list.");
        System.out.println("3. Modify list item.");
        System.out.println("4. Exit the program.");
        System.out.println();
    }

    public static void modifySubMenu() {
        System.out.println();
        System.out.println("1. Change Item Quantity.");
        System.out.println("2. Change Name of item.");
        System.out.println("3. Change Item Category.");
        System.out.println("4. Remove Item.");
        System.out.println("5. Return to main menu.");
        System.out.println();
    }

    public static void runProgram() {
        boolean keepGoing = true;
        String entry = "";
        while (keepGoing) {
            mainMenuPrompt();
            entry = sc.getString("Please make a selection.");
            switch (entry) {
                case "1":
                    boolean goOn = true;
                    while (goOn) {
                        createListItem();
                        goOn = sc.yesNo("Add another item?");
                    }
                    break;
                case "2":
                    viewList();
                    break;
                case "3":
                    //modifyListItem();
                    break;
                case "4":
                    keepGoing = false;
                    break;
                default:
                    System.out.println("That is not one of the choices.");
                    break;
            }
        }
    }

    public static ListItem createListItem() {
        String item = "";
        String category = getCategory();
//        String category = "";
//        for (int i = 0; i < categories.length; i++) {
//            System.out.print(i + 1 + ". " + categories[i] + " ");
//        }
//        System.out.println();
//        System.out.println();
//        String entry = sc.getString("Select a category.");
//        switch (entry) {
//            case "1":
//                category = categories[0];
//                break;
//            case "2":
//                category = categories[1];
//                break;
//            case "3":
//                category = categories[2];
//                break;
//            case "4":
//                category = categories[3];
//                break;
//            case "5":
//                category = categories[4];
//                break;
//            default:
//                System.out.println("That is not one of the choices.");
//                break;
//        }
        item = sc.getString("Enter the name of the item you are adding.");
        return new ListItem(item, category);
    }

    public static void viewList() {
        groceryList.forEach(((listItem, integer) -> System.out.println(listItem.item + " " + listItem.category + " " + integer)));
    }

    public static void modifyListItem() {

    }

    public static String getCategory(){
        String category = "";
        for (int i = 0; i < categories.length; i++) {
            System.out.print(i + 1 + ". " + categories[i] + " ");
        }
        System.out.println();
        System.out.println();
        String entry = sc.getString("Select a category.");
        switch (entry) {
            case "1":
                category = categories[0];
                break;
            case "2":
                category = categories[1];
                break;
            case "3":
                category = categories[2];
                break;
            case "4":
                category = categories[3];
                break;
            case "5":
                category = categories[4];
                break;
            default:
                System.out.println("That is not one of the choices.");
                break;
        }
        return category;
    }

}
