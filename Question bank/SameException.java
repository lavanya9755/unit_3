public class SameException {
public static void main(String[] args) {
    

    try{
        int b= 23/0;
    }catch(ArithmeticException e){
        System.out.println("Warning: ArithmeticException");
}catch(ArithmeticException e){
    System.out.println("Warning: ArithmeticException");
}
}
}