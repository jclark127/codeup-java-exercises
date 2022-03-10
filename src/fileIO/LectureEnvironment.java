package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    }
}
