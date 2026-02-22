import java.util.Scanner;
public class SumOfNaturalNumbers {

    // TODO: Create the method public static int NumberSum(int n)
    // It should calculate and return the sum of first n natural numbers
    public static int NumberSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            int result = NumberSum(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + result);
        }
        // Inside main method
        // TODO: Read N using Scanner
        // TODO: Call NumberSum(N)
        // TODO: Print the result
    
}
