//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        int ccBalance = 5000;
        double interestRate = 0.17;

        double interest = ccBalance * interestRate;
        double firstMonth = ccBalance + interest;
        double secondMonth = firstMonth + interest;

        System.out.println("Your first month account balance is: " + firstMonth);
        System.out.println("Your second month account balance is: " + secondMonth);
    }
}