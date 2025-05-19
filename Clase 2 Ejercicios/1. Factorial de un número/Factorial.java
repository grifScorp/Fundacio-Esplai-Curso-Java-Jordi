import java.util.Scanner;

public class Factorial {

    // factorial (n) = n * (n-1) * (n-2) * ... * 1
    // factorial (n) = n * factorial (n-1)

    private static int recursiveFactorial(int n){
        // base case
        if(n <= 1) {
            return 1;
        }
        // recursive case
        return n * recursiveFactorial(n-1);
    }

    private static int iterativeFactorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    private static int factorial(int n){
        return iterativeFactorial(n);
    }

    private static boolean assertEquals(int expected, int actual){
        return expected == actual;
    }

    private static void testFactorial(){
        if(!assertEquals(factorial(5), 120)){
            System.out.println("Bad test - factorial: " + factorial(5));
            return;
        }
        if(!assertEquals(factorial(0), 1)){
            System.out.println("Bad test - factorial: " + factorial(0));
            return;
        }
        if(!assertEquals(factorial(1), 1)){
            System.out.println("Bad test - factorial: " + factorial(1));
            return;
        }
        if(!assertEquals(factorial(10), 3628800)){
            System.out.println("Bad test - factorial: " + factorial(10));
            return;
        }
        System.out.println("All test passed");
    }

    private static void manualTestFactorial(){
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
        scanner.close();
    }
    public static void main(String[] args) {
        testFactorial();
    }
}