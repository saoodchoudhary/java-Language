package Oops_concept;

class ABC {
    // Method A ---------
    public void A(int x, int y) {
        System.out.println("X value is : " + x);
        System.out.println("y value is : " + y);
    }

    // Method A overloading----
    public void A(int x, int y, int z) {
        System.out.println("x value is : " + x);
        System.out.println("y value is : " + y);
        System.out.println("z value is : " + z);
    }

    // Method A overloading
    public void A(float x, int y) {
        System.out.println("x value is : " + x);
        System.out.println("y value is : " + y);
    }

}

public class overLoading {
    public static void main(String[] args) {
        ABC f = new ABC(); // create Object

        f.A(22, 44); // call method A(int x, int y);

        System.out.println("-----------------------------");

        f.A(10, 20, 40); // call method A(int x, int y, int z);

        System.out.println("---------------------------------------");

        f.A(55.4f, 70); // call method A(float x, int y);

    }
}
