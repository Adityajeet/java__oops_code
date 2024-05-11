class ComputerProfessional {
    private String Ename;
    private double DutyHour;
    private String Prospect;

    ComputerProfessional(String en, double dh, String pro)
    {
        this.Ename=en;
        this.DutyHour=dh;
        this.Prospect=pro;
    }

    void display ()
    {
        System.out.println("Ename: "+Ename);
        System.out.println("Duty Hour: "+DutyHour);
        System.out.println("Prospect: "+Prospect);
    }
}

class Developer extends ComputerProfessional {
    private double StudyHour;

    Developer (String Ename,double DutyHour,String Prospect,double sh)
    {
        super(Ename,DutyHour,Prospect);
        this.StudyHour=sh;
    }

    void displaydata ()
    {
        super.display();
        System.out.println("StudyHour: "+StudyHour);
    }
}


class NetworkAdmin extends ComputerProfessional {
    private double PracticeHours;

    NetworkAdmin (String Ename,double DutyHour,String Prospect,double ph)
    {
        super(Ename,DutyHour,Prospect);
        this.PracticeHours=ph;
    }

    void displaydata ()
    {
        super.display();
        System.out.println("Practice Hours: "+PracticeHours);
    }
}


class DataOperator extends ComputerProfessional {
    private double TypingSpeed;

    DataOperator (String Ename,double DutyHour,String Prospect,double ts)
    {
        super(Ename,DutyHour,Prospect);
        this.TypingSpeed=ts;
    }

    void displaydata ()
    {
        super.display();
        System.out.println("Typing Speed: "+TypingSpeed);
    }
}


class JavaProfessional extends Developer {
    private String ProficiencyLevel;

    JavaProfessional(String Ename,double DutyHour,String Prospect,double StudyHour,String Pl)
    {
        super(Ename,DutyHour,Prospect,StudyHour);
        this.ProficiencyLevel=Pl;
    }

    void display2 ()
    {
        super.displaydata();
        System.out.println("Proficiency Level: "+ProficiencyLevel);
    }
}


class PythonProfessional extends Developer {
    private String ProficiencyLevel;

    PythonProfessional(String Ename,double DutyHour,String Prospect,double StudyHour,String Pl)
    {
        super(Ename,DutyHour,Prospect,StudyHour);
        this.ProficiencyLevel=Pl;
    }

    void display2 ()
    {
        super.displaydata();
        System.out.println("Proficiency Level: "+ProficiencyLevel);
    }
}



public class Computer_operation {
    public static void main(String args[])
    {
        JavaProfessional ob1=new JavaProfessional("Aditya",5.0,"Excellent",6.0,"Singh");
        ob1.display2();
        System.out.println();

    }
}
