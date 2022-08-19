package Practice_java_program;

public class fibonacci {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        fibonacci f = new fibonacci();
        System.out.println(f.fib(8));
    }

}