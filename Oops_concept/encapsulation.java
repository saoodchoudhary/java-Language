package Oops_concept;

class encapsu {
    private String employee_id; // this variable hide in other class
    private String pass;

    public void setter(String emp_id) {
        this.employee_id = emp_id;
    }

    public String getter() {
        return employee_id;
    }

    public void setpass(String password) {
        this.pass = password;
    }

    public String getpass() {
        return pass;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        encapsu e = new encapsu();
        e.setter("abdul@1234");
        System.out.println(e.getter());
        e.setpass("12345abdul");
        System.out.println(e.getpass());
    }
}
