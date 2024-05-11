interface CCAScore {
    int getCcaCredit();

    void showCcaCred();
}

class Student {
    String name;
    int rollNo;

    Student(String n, int roll) {
        name = n;
        rollNo = roll;
    }

    public void putData() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class TestMarks {
    int marks1;
    int marks2;

    public TestMarks(int marks1, int marks2) {
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    public void getData() {
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
    }
}

class SemResult extends TestMarks implements CCAScore {
    int ccaCredit;

    public SemResult(String name, int rollNo, int marks1, int marks2, int ccaCredit) {
        super(marks1, marks2);
        this.name = name;
        this.rollNo = rollNo;
        this.ccaCredit = ccaCredit;
    }

    @Override
    public int getCcaCredit() {
        return ccaCredit;
    }

    @Override
    public void showCcaCred() {
        System.out.println("CCA Credit: " + ccaCredit);
    }

    public void displayAllDetails() {
        putData();
        getData();
        showCcaCred();
    }
}

public class interface_ass
{
    public static void main(String[] args) {
        SemResult student1 = new SemResult("Student 1", 101, 90, 85, 5);
        SemResult student2 = new SemResult("Student 2", 102, 88, 92, 4);

        System.out.println("Details of Student 1:");
        student1.displayAllDetails();

        System.out.println("\nDetails of Student 2:");
        student2.displayAllDetails();
    }
}
