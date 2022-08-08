package Oops_concept;

class encapsu {
    private String employee_id;

    public void setter(String emp_id) {
        this.employee_id = emp_id;
    }

    public String getter() {
        return employee_id;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        encapsu e = new encapsu();
        e.setter("abdul@1234");
        System.out.println(e.getter());
    }
}
