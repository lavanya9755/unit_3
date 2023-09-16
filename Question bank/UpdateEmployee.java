import java.io.IOException;
import java.io.RandomAccessFile;

 public class UpdateEmployee {
    public static void main(String[] args) {
      //  String fileName = "demo.txt1";
  //      int recordSize = 100; // Assuming each employee record is 100 bytes

        try (RandomAccessFile randomAccessFile = new RandomAccessFile("demo.txt1", "rw")) {
           
           String updatedInfo = "John Doe, 30, Developer";
            byte[] updatedEmployeeInfo = updatedInfo.getBytes(); 
            randomAccessFile.seek(4);//for position , 5th character se chalu hoga
            randomAccessFile.write(updatedEmployeeInfo);

            System.out.println("Employee information updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}
