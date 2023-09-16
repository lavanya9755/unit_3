import java.io.File;

public class FilneName {
    public static void main(String[] args) {
        
        File f1 = null;
        File f2 = null;
        boolean bool = false;
        f2 = new File("C:\\Users\\LENOVO\\Desktop\\file");

        if(f2.isDirectory()){
            System.out.println("Parent Directory of "+ f2.getParent());
            File s[] = f2.listFiles();
            for(int i = 0; i<s.length;i++){
                String filename = "demo.txt"+i;
                f1= new File(filename);
                bool = s[i].renameTo(f1);
                //System.out.println(s[i]);
                //System.out.println(f1);
                System.out.println(bool);
            }
        }

    }
}
