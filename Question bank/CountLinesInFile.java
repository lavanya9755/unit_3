import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesInFile{

    public static void main(String[] args) {
        

        //String fileName = args[0];
        int countIntegers = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("demo.txt1"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    // Attempt to parse the line as an integer
                   
                    countIntegers++;
                } catch (NumberFormatException e) {
                    // Line is not a valid integer, continue to the next line
                    //System.out.println("not int");
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        System.out.println("Number of lines representing integers in the file: " + countIntegers);
    }
}
