import java.io.*;

public class FileStreamDemo{
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("demo.txt1");
            int i=0;
            while((i= fin.read())!=-1){
            System.out.println((char)i);
        }
            fin.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
