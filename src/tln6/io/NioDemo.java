package tln6.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class NioDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\info\\Desktop\\java_sample.txt";
        writeTextToFile(filePath, Arrays.asList("Zdarova ", "World"));
        printFileText(filePath);

    }

    public static void writeTextToFile(String filePath, List<String>content) throws IOException {
        Path path = Paths.get(filePath);
        Files.write(path,content, StandardOpenOption.APPEND);
    }

    public static void printFileText(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        List<String> content = Files.readAllLines(path);

        for (String line:content) {
            System.out.println(line);
        }
    }
}
