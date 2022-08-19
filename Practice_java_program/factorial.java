package Practice_java_program;

public class factorial {
    public int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        factorial f = new factorial();
        System.out.println(f.fact(5));

    }

}
