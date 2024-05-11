interface Area {
    float pi=3.14f;
    float cal_area(float dim1,float dim2);
}
class Circle implements Area{

    public float cal_area(float dim1,float dim2)
    {
        return pi*dim1*dim1;
    }
}
class Rectangle implements Area {
    public float cal_area(float dim1,float dim2)
    {
        return dim1*dim2;
    }
}
public class InterFace_program {
    public static void main (String args[])
    {
        Area o1=new Circle();
        System.out.println("Area of Circle: " + o1.cal_area(2.0f,3.0f));
        Rectangle o2=new Rectangle();
        System.out.println("Area of Rectangle: " + o2.cal_area(2,3));
    }
}
