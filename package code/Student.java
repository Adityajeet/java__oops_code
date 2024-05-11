package P1;
import java.util.*;

public class Student
{//by SRAJAN
    String n;
    int r;
    public void get_data()
    {//by SRAJAN
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name & Roll number: ");
        n=sc.nextLine();
        r=sc.nextInt();
    }
    public void put_data()
    {
        System.out.println("Name: "+n);
        System.out.println("Roll No: "+r);
    }
}