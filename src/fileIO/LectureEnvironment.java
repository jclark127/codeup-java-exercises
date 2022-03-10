package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LectureEnvironment {

    public static void printPoem(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);
        for (int i = 0; i < fileContents.size(); i++){
            System.out.printf("%d: %s\n", i+1, fileContents.get(i));
        }
    }

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/fileIO/textFile.txt");
        System.out.println(Files.exists(path));
        printPoem(path);


        String directory = "./src/fileIO/data";
        String fileName = "groceryList.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataAndFile = Paths.get(directory,fileName);
        System.out.println();
        System.out.println("dataDirectory = " + dataDirectory);
        System.out.println("dataAndFile = " + dataAndFile);

//        if (Files.notExists(dataDirectory)){
//            Files.createDirectories(dataDirectory);
//        }

        if (Files.notExists(dataAndFile)){
            Files.createDirectories(dataDirectory);
            Files.createFile(dataAndFile);
        }

        System.out.println();
        System.out.println("dataAndFile = " + dataAndFile);


        List<String> groceries = Arrays.asList("coffee", "whiskey", "steak", "potatoes","candy");
        System.out.println("groceries = " + groceries);

        Files.write(dataAndFile,groceries);

        List<String> forgot = Arrays.asList("cheese","otherCheese","thirdCheese");
        Files.write(dataAndFile,forgot, StandardOpenOption.APPEND);

        List<String> printList = Files.readAllLines(dataAndFile);
        System.out.println("printList = " + printList);
        System.out.println();
        for(int i = 0; i < printList.size(); i++){
            System.out.printf("%d. %s%n", i+1,printList.get(i));
        }

        List<String> printList2 = Files.readAllLines(dataAndFile);
        List<String> newList = new ArrayList<>();
        for(String line : printList2){
            if(line.equalsIgnoreCase("cheese")){
                newList.add("vegan cheese");
                continue;
            }
            newList.add(line);
        }
        System.out.println("newList = " + newList);

        Files.write(dataAndFile,newList);

    }
}
