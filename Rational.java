import java.util.Scanner;

public class Rational
    {
    private int numerator;
    private int denominator;
    private double real;
    private double imaginary;

    Rational(int n, int d)
    {
        this.numerator = n;
        this.denominator = d;
    }
    Rational (double r,double i)
    {
        this.real = r;
        this.imaginary = i;
    }

    Rational addition (Rational add)
    {
        Rational ob = new Rational(0,0);
        ob.numerator = numerator * add.denominator + denominator*add.numerator;
        ob.denominator = denominator * add.denominator;
        return ob;
    }

    Rational additionC (Rational add)
    {
        Rational ob = new Rational(0.0,0.0);
        ob.real = real + add.real;
        ob.imaginary = imaginary + add.imaginary;
        return ob;
    }

    Rational subtraction (Rational sub)
    {
        Rational ob = new Rational(0,0);
        ob.numerator = numerator * sub.denominator - denominator*sub.numerator;
        ob.denominator = denominator * sub.denominator;
        return ob;
    }

    Rational subtractionC (Rational sub)
    {
        Rational ob = new Rational(0.0,0.0);
        ob.real = real - sub.real;
        ob.imaginary = imaginary - sub.imaginary;
        return ob;
    }

    Rational multiplication (Rational mul)
    {
        Rational ob = new Rational(0,0);
        ob.numerator = numerator * mul.numerator;
        ob.denominator = denominator * mul.denominator;
        return ob;
    }

    Rational multiplicationC (Rational mul)
    {
        Rational ob = new Rational(0.0,0.0);
        ob.real = real*mul.real - imaginary*mul.imaginary;
        ob.imaginary = real*mul.imaginary + imaginary*mul.real;
        return ob;
    }

    Rational division (Rational div)
    {
        Rational ob = new Rational(0,0);
        ob.numerator = numerator * div.denominator;
        ob.denominator = denominator * div.numerator;
        return ob;
    }

    Rational divisionC (Rational div)
    {
        Rational ob = new Rational(0.0,0.0);
        ob.real = (real * div.real + imaginary*div.imaginary) / (div.real*div.real + div.imaginary*div.imaginary);
        ob.imaginary = (imaginary * div.real - real * div.imaginary ) / (div.real*div.real + div.imaginary*div.imaginary);
        return ob;
    }

    void display ()

    {

        System.out.println("("+numerator+","+denominator+")");

    }

    void displayC ()

        {System.out.println( "(" + real +" , "+ imaginary + "i" + ")");

        }

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first numerator and denominator:");
        int num1=sc.nextInt();
        int dnum1=sc.nextInt();
        Rational ob1= new Rational(num1,dnum1);

        System.out.println("Enter second numerator and denominator:");
        int num2=sc.nextInt();
        int dnum2=sc.nextInt();
        Rational ob2= new Rational(num2,dnum2);

        System.out.println("Addition:(x,y):");
        Rational ob3=ob1.addition(ob2);
        ob3.display();

        System.out.println("Subtraction:(x,y):");
        Rational ob4=ob1.subtraction(ob2);
        ob4.display();

        System.out.println("Multiplication:(x,y):");
        Rational ob5=ob1.multiplication(ob2);
        ob5.display();

        System.out.println("Division:(x,y):");
        Rational ob6=ob1.division(ob2);
        ob6.display();


        //Input for complex numbers
        System.out.println("Enter first real part and imaginary part:");
        double real1=sc.nextDouble();
        double imag1=sc.nextDouble();
        Rational o1= new Rational(real1,imag1);

        System.out.println("Enter second real part and imaginary part:");
        double real2=sc.nextDouble();
        double imag2=sc.nextDouble();
        Rational o2= new Rational(real2,imag2);

        System.out.println("Addition of complex:");
        Rational o3 = o1.additionC(o2);
        o3.displayC();

        System.out.println("Subtraction of complex:");
        Rational o4 = o1.subtractionC(o2);
        o4.displayC();

        System.out.println("Multiplication of complex:");
        Rational o5 = o1.multiplicationC(o2);
        o5.displayC();

        System.out.println("Division of complex:");
        Rational o6 = o1.divisionC(o2);
        o6.displayC();
    }
}




