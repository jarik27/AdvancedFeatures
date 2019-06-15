package tln6.io;

import java.io.*;

public class IODemo {                         // **Input and Output IO**
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\info\\Desktop\\java_sample.txt";
        writeTextToFile(fileName,"\nHello text"); //     \n prints from new line
        printFileText(fileName);



    }

    public static void printFileText(String fileName){
        File file = new File(fileName);
        System.out.println(file.exists());

        try (FileReader fileReader = new FileReader(file)) {
            int i;
            do {
                i = fileReader.read();
                if (i != -1) {
                    char ch = (char) i;
                    System.out.print(ch);
                }
            }
            while (i != -1);

        } catch (FileNotFoundException e) {
            System.out.println("The specified file does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeTextToFile(String fileName, String text) throws IOException {
        File file = new File(fileName);

        FileWriter fileWriter = new FileWriter(file,true);
        fileWriter.write(text);

        fileWriter.close();
    }
}
