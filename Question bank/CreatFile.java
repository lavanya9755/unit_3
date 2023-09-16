import java.io.File;
import java.io.IOException;

public class CreatFile {
    public static void main(String[] args) {
        File f1 = new File("demo.txt");
        try{
            
            if(f1.exists()){
                System.out.println("exists");
            }
            boolean created = f1.createNewFile();
            if(created){
                System.out.println("created");
            }
        }catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
