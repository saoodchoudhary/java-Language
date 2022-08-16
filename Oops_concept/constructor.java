package Oops_concept;

// parametrized constructor
class Triangle {
    public double radius;
    double area;

    Triangle(double r) {
        this.radius = r;
    }

    public void display() {
        area = 3.14 * radius * radius;
        System.out.println(area);
    }

}

// copy constructor
class ABCD {
    String fname;
    int fsalary;

    public ABCD(String name, int salary) {
        this.fname = name;
        this.fsalary = salary;
    }

    ABCD(ABCD abc) {
        System.out.println("invoke copy constructor");
        fname = abc.fname;
        fsalary = abc.fsalary;
    }

    String getname() {
        return fname;
    }

    int getsalary() {
        return fsalary;
    }

}

public class constructor {
    public static void main(String[] args) {

        // parametrized constructor--
        System.out.println("parametrized constructor");
        Triangle t = new Triangle(33.2);
        t.display();
        // COPY consturctor
        System.out.println("copy constructor");
        ABCD ab1 = new ABCD("saood", 23444);
        System.out.println("first name is : " + ab1.getname());
        System.out.println("first salary is : " + ab1.getsalary());
        // copy constructor invoke--
        ABCD ab2 = new ABCD(ab1);
        System.out.println("second name is : " + ab2.getname());
        System.out.println("second name is : " + ab2.getsalary());
    }

}
