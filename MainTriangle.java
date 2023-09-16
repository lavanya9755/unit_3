class Triangle{
    double a,b,c,h;
    Triangle(double a,double b,double c,double h){
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;
    }
    public void isTriangle(){
        if((a+b)>c || (c+a)>b || (b+c)>a){
            System.out.println("its a trianlge");
        }else
        System.out.println("not a triangle");
    }

    public void area(){
        double area = (h*a)/2;
        System.out.println("the area is: "+ area);
    }
}
class InvalidTriangleException extends Exception{
    InvalidTriangleException(String s){
        super(s);
    }

}












public class MainTriangle {
    
}
