import java.io.FileOutputStream;

public class FileOutput {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("demo.txt1");
            String s = "hello world,im lavanya chawla \nhehehe";
            byte b[]= s.getBytes();
            fout.write(b);
            fout.close();
        System.out.println("done .....");        
        }catch(Exception e){
        System.out.println(e);
    }
    
}
}
