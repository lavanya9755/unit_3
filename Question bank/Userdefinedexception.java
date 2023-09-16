//Define an exception called “NoEqualException” that is thrown when a float value
//is not equal to 3.14. Write a program that uses the above user defined exception.
public class Userdefinedexception {
    
    public static void checkFloat(float value) throws NoEqualException{
        if(value != 3.14f){
            throw new NoEqualException("not equal");
        }
    }
    public static void main(String[] args) {
        float value = 234.34f;
        
        try{
            checkFloat(value);
        }catch(NoEqualException e){
        System.out.println(e);
    }
    }
    
}
class NoEqualException extends Exception{
    NoEqualException(String msg){
        super(msg);
        System.out.println("not value of pi");
    }

}
