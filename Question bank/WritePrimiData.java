import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

// public class WritePrimiData {
//     public static void main(String[] args) {
//         try(FileWriter w1 = new FileWriter("demo.txt1")){
//            
//            
//             char [] hehe = {'e','g','k','o'};
//             w1.write(hehe,0,2);

//         }catch(Exception e){
//             e.getMessage();
//         }
//     }
// }

public class WritePrimiData{
    public static void main(String[] args) {
        try(FileOutputStream o1 =new FileOutputStream("demo.txt")){
            String hello = "hello world";
            byte[] b1 = hello.getBytes();
            o1.write(b1);
        }catch(Exception e){
            e.getMessage();
        }
    }
}