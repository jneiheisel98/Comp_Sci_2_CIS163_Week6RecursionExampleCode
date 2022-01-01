package week6recursion;

public class ExampleRecursion {

    public static void main (String[] args) {
        ExampleRecursion example = new ExampleRecursion();

      //  System.out.println(example.fact(4));
        System.out.println(example.fib(4));
    }

    public int fact (int n) {
//        int prod = 1;
//        for (int i = 1; i <=n; i++)
//            prod *= i;
//        return prod;

        if (n == 0)    // Stopping pt.
            return 1;
        else
            return n * fact(n-1);  // Rec
    }
    public int fib (int n) {
         if (n == 1 || n == 2)
             return  1;
         else
             return fib(n -1) + fib(n - 2);
    }

    public int mult (int a, int b) {
        if (b == 0)
            return 0;

        if (b > 0)
            return a + mult(a, b -1);
        else
            return -a + mult(a, b + 1);
    }


    public double power (int x, int y) {
        if (x == 0 && y == 0)
            throw new RuntimeException();

        if (y < 0)
            return 1.0 / power(x,y);

        if (y == 0)
            return 1;
        else
            return x * power (x, y - 1);
    }

    public int div (int a, int b) {   // a/b   5/2 => 2
        if (b < a)
            return 0;
        else
            return 1 + div(a, b -a);

    }

}
