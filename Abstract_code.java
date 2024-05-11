
abstract class Bird {
    public String name;
    public String color;

    Bird(String n,String c)
    {
        name=n;
        color=c;
    }

    abstract  void fly ();
}

class FlyingBird extends Bird {
    FlyingBird (String n,String c)
    {
        super(n,c);
    }
    public void fly()
    {
        System.out.println("Flying Bird "+name+" "+color);
    }
}

class NonFlying_Bird extends Bird {
    NonFlying_Bird(String n,String c)
    {
        super(n,c);
    }
    public void fly()
    {
        System.out.println("Non Flying Bird "+name+" "+color);
    }
}

public class Abstract_code {
    public static void main (String args[])
    {
        FlyingBird o2 = new FlyingBird("Crow","Black");
        o2.fly();

        System.out.println();

        NonFlying_Bird o3 = new NonFlying_Bird("Sparrow","Yellow");
        o3.fly();
    }
}
