import java.util.Scanner;

public class Complex {
    private int real;
    private int imaginary;

    Complex (int r,int i)
    {
        this.real = r;
        this.imaginary = i;
    }

    Complex_cal additionC (Complex_cal add)
    {
        Complex_cal ob = new Complex_cal(0,0);
        ob.real = real + add.real;
        ob.imaginary = imaginary + add.imaginary;
        return ob;
    }

    Complex_cal subtractionC (Complex_cal sub)
    {
        Complex_cal ob = new Complex_cal(0,0);
        ob.real = real - sub.real;
        ob.imaginary = imaginary - sub.imaginary;
        return ob;
    }

    //Complex multiplicationC (Complex mul)
    //{
      //  Complex ob = new Complex(0.0,0.0);
       // ob.real = real*mul.real - imaginary*mul.imaginary;
        //ob.imaginary = real*mul.imaginary + imaginary*mul.real;
        //return ob;
    //}

   // Complex divisionC (Complex div)
    //{
      //  Complex ob = new Complex(0,0);
       // ob.real = (real * div.real + imaginary*div.imaginary) / (div.real*div.real + div.imaginary*div.imaginary);
        //ob.imaginary = (imaginary * div.real - real * div.imaginary ) / (div.real*div.real + div.imaginary*div.imaginary);
        //return ob;
    //}

    void displayC ()

    {System.out.println( "(" + real +" + "+ imaginary + "i" + ")");

    }

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Input for complex numbers
        System.out.println("Enter first real part and imaginary part:");
        int real1=sc.nextInt();
        int imag1=sc.nextInt();
        Complex_cal o1= new Complex_cal(real1,imag1);

        System.out.println("Enter second real part and imaginary part:");
        int real2=sc.nextInt();
        int imag2=sc.nextInt();
        Complex_cal o2= new Complex_cal(real2,imag2);

        System.out.println("Addition of complex:");
        Complex_cal o3 = o1.additionC(o2);
        o3.displayC();

        System.out.println("Subtraction of complex:");
        Complex_cal o4 = o1.subtractionC(o2);
        o4.displayC();

        //System.out.println("Multiplication of complex:");
        //Complex o5 = o1.multiplicationC(o2);
        //o5.displayC();

        //System.out.println("Division of complex:");
        //Complex o6 = o1.divisionC(o2);
        //o6.displayC();
    }
}
