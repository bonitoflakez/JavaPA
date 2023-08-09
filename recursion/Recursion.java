public class Recursion {
  public static void main(String[] args) {
    int n = 5;
    int factorial = computeFactorial(n);
    System.out.println("Factorial of " + n + " is: " + factorial);
  }

  static int computeFactorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }

    return (n * computeFactorial(n - 1));
  }
}