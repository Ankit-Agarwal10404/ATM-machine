import java.util.Scanner;

class ATM {
    int pin = 123;
    float balance;
    Scanner sc = new Scanner(System.in);

    public void checkPin() {
        System.out.println("Enter your pin");
        int pinEnter = sc.nextInt();
        if (pinEnter == pin) {
            menu();
        } else {
            System.out.println("invalid pin,Try Again");
            menu();
        }
    }

    public void menu() {
        System.out.println("*********************************");
        System.out.println("1.Check A/C Balance");
        System.out.println("2.Deposit Balance");
        System.out.println("3.Withdraw Balance");
        System.out.println("4.Exit");
        System.out.println("Choose the option :");

        int option = sc.nextInt();

        if (option == 1) {
            checkBalance();
        } else if (option == 2) {
            depositBalance();
        } else if (option == 3) {
            withdrawBalance();
        } else if (option == 4) {
            return;
        } else {
            System.out.println("invalid enter");
            menu();
        }

    }

    public void checkBalance() {
        System.out.println("Balance : " + balance);
        menu();
    }

    public void withdrawBalance() {
        System.out.println("Enter Withdraw Amount :");
        float withdrawAmount = sc.nextFloat();
        if (withdrawAmount > balance) {
            System.out.println("Insufficient Amount.");
            menu();
        } else {
            balance = balance - withdrawAmount;
            System.out.println("successfully withdraw " + withdrawAmount + " amount");
            menu();
        }
    }

    public void depositBalance() {
        System.out.println("Enter amount :");
        float depositAmount = sc.nextFloat();
        balance = depositAmount + balance;
        System.out.println("your amount " + depositAmount + " deposited Successfully");
        menu();
    }

}

public class ATMMachine {

    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();
    }
}