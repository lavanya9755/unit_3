class WrongFileNameException extends Exception{
    WrongFileNameException(String errorMessage){
        super(errorMessage);
    }
}
public class Main{
    public static void main(String[] args) {
        int age =15;
        try{
            if(age<18)
            throw new WrongFileNameException("message hehehe");
        }catch(WrongFileNameException w){
                w.getMessage();
        }
    }
}