import java.util.*;

class Factorial {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number:");
    int num = sc.nextInt();

    int tmp = num;
    long fact = 1;

    while (tmp > 0) {
      fact = fact * tmp;
      tmp--;
    }

    System.out.println("Factorial of " + num + " is: " + fact);
  }
}
