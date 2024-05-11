import java.lang.Math;
import java.util.Scanner;

class Math_operations{
    double area, perimeter;
    
    void calc_area(double radius){
        area=Math.PI*radius*radius;
        System.out.println("Area of circle "+area); 
    }
    void cal_perimeter(double radius){
        perimeter=2*Math.PI*radius;
        System.out.println("Perimeter of circle "+perimeter);   
    }
}
public class Math_pack{
    public static void main(String[] args) {
        double radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        radius = sc.nextDouble();
        Math_operations ob=new Math_operations();
        ob.calc_area(radius);
        ob.cal_perimeter(radius);
    } 
}