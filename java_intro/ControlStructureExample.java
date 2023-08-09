public class ControlStructureExample {
  public static void main(String[] args) {
    // if-else statement
    int num = 10;
    if (num > 0) {
      System.out.println("Number is positive.");
    } else if (num < 0) {
      System.out.println("Number is negative.");
    } else {
      System.out.println("Number is zero.");
    }

    // switch statement
    char grade = 'B';
    switch (grade) {
      case 'A':
        System.out.println("Excellent!");
        break;
      case 'B':
        System.out.println("Good!");
        break;
      case 'C':
        System.out.println("Fair!");
        break;
      default:
        System.out.println("Needs Improvement!");
        break;
    }

    // while loop
    int i = 1;
    while (i <= 5) {
      System.out.println("Iteration " + i);
      i++;
    }

    // for loop
    for (int j = 1; j <= 5; j++) {
      System.out.println("Iteration " + j);
    }

    // nested loops
    for (int row = 1; row <= 3; row++) {
      for (int col = 1; col <= 3; col++) {
        System.out.println("* ");
      }
      System.out.println();
    }
  }
}