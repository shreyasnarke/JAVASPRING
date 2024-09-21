import java.util.Scanner;
public class fibbofact {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; //0=0 0=1 1=1
        }
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b; 
            a = b;   
            b = sum;
        }
        return b; //return n
    }
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i; //this no(current no)
        }
        return result; //return n
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); 
        System.out.println("Fibonacci number at position " + number + " is: " + fibonacci(number));
        System.out.println("Factorial of " + number + " is: " + factorial(number));
        scanner.close(); 
    }
}
