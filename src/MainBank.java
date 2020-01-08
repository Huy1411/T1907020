import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        double balance, rate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance:");
        balance =input.nextDouble();
        System.out.println("Enter rate:");
        rate =input.nextDouble();
        Bank obj = new Bank(balance, rate);
        obj.calculateInterest();
        System.out.println("Interest is: "+obj.calculateInterest());
    }

}

