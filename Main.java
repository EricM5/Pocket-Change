import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Let's find the total amount of money you have.\n");
    Scanner in = new Scanner(System.in);
    System.out.print("How many quarters do you have? ");
    int quarters = in.nextInt();
    System.out.print("How many dimes do you have? ");
    int dimes = in.nextInt();
    System.out.print("How many nickels do you have? ");
    int nickels = in.nextInt();
    System.out.print("How many pennies do you have? ");
    int pennies = in.nextInt();

    //totals
    double quartertot = quarters * .25;
    double dimestot = dimes * .10;
    double nickelstot = nickels * .05;
    double penniestot = pennies * .01;

    double total = quartertot + dimestot + nickelstot + penniestot;
    
    System.out.print("\nYou have a total of $");
    System.out.printf("%.2f", total);
    System.out.println();
  }
}