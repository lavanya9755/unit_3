import java.io.BufferedReader;
import java.io.FileReader;

public class CountCharWords {
   static int countchar;
    static int wordscount;
    public static void main(String[] args) {
        //String filename="demo.txt";
        try(BufferedReader f1 = new BufferedReader(new FileReader("demo.txt"))){
            String line;
            while((line=f1.readLine())!=null){
                    countchar +=line.length();
                    wordscount += countWords(line);
            }
            System.out.println(countchar);
            System.out.println(wordscount);
        }catch(Exception e){
            e.getMessage();
        }
    }
    public static int countWords(String line){
        String[] words = line.split(" ");
        return words.length;
    }
}
