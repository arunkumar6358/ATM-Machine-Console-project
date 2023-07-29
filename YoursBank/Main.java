/*All rights reserved by Arunkumar.k
* use only educational perpose*/
package YoursBank;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("......WELCOME TO YOURS BANK......");
        System.out.println("Do you have pin press 1 to continue:");//@
        System.out.println("Generate pin press 2 to continue:");//@
        System.out.println("Card less deposit press 3 to continue:");
        System.out.println("Balance check press 4 to continue:");

        switch (input.nextInt()) {
            case 1 -> {
                System.out.println("Withdrawal amount press 1 to continue:");
                System.out.println("Deposit amount press 2 to continue:");
                int atmpindetails = input.nextInt(); //variable declaration for geting input from user
                if (atmpindetails == 2) {//Deposit part
                    System.out.println("Welcome to deposit page:");
                    System.out.println("Please enter your personal pin:");
                    int Userenteredpin = input.nextInt();
                    if (Userenteredpin == Userinfo.pin1()) {
                        System.out.println("system checking your pin is valid or not...............................");
                        System.out.println("Your pin is verified:");
                        System.out.println("Please insert amount in ATM:");
                        int amount = input.nextInt();
                        if (amount >= 500) {
                            System.out.println("Transaction processing please wait..................................");
                            System.out.println("Your deposit amount is: " + amount +" RS");
                            System.out.println("deposit successfully done:");
                            System.out.print("Your current balance is: " + (Userinfo.balance() + amount) +" RS");
                        } else System.out.println("Please enter more than 500 RS:");
                    }
                }
                else if (atmpindetails == 1) { //withdrawals part
                    System.out.println("Welcome to Withdrawal page:");
                    System.out.println("Please enter your personal pin:");
                    int Userenteredpin = input.nextInt();
                    if (Userenteredpin == Userinfo.pin1()) {
                        System.out.println("system checking your pin is valid or not...............................");
                        System.out.println("Your pin is verified:");
                        System.out.println("Please enter the amount you want to withdrawal:");
                        int amount = input.nextInt();
                        if ((amount < Userinfo.balance()) && (amount <= 49000)) {//49000 <= 49000
                            System.out.println("Transaction processing please wait..................................");
                            System.out.println("Your withdrawal amount is: " + amount +" RS");
                            System.out.println("withdrawal successfully done:");
                            System.out.print("Your current balance is: " + (Userinfo.balance() - amount) +" RS");
                        } else System.out.println("Your entered amount is greater than balance amount:");

                    } else System.out.println("Your personal pin is invalid:");
                } else System.out.println("Invalid Input please enter correct input 1 Or 2:");
            }
            case 2 -> {
                System.out.println("Please enter your account number:");
                long accountno = input.nextLong();
                System.out.println("Reenter account number:");
                input.nextLong();
                if(accountno == Userinfo.account_number1()) {
                    System.out.println("Please wait ................");
                    System.out.println("Your account number is verified:");
                    System.out.println("Your account number is: " + Userinfo.account_number1());
                    System.out.println("Your name is: " + Userinfo.name1());
                    System.out.println("Please enter your new personal pin:");
                    int newpin = input.nextInt();
                    if(newpin >= 999 && newpin <= 9999){
                        System.out.println("Your pin is updated successfully:");
                    }else
                        System.out.println("Please enter correct pin length (eg:1234): ");
                }
                else
                    System.out.println("please enter correct AC number:");
            }
            case 3 -> {
                System.out.println("Please enter your account number:");
                long accountno = input.nextLong();
                System.out.println("Reenter account number:");
                input.nextLong();
                if(accountno == Userinfo.account_number1()) {
                    System.out.println("Your account number is verified:");
                    System.out.println("Your account number is: " + Userinfo.account_number1());
                    System.out.println("Your name is: " + Userinfo.name1());
                    System.out.println("Insert your amount in ATM:");
                    int cardlessdeposite = input.nextInt();
                    if (cardlessdeposite >= 500) {
                        System.out.println("Transaction processing please wait..................................");
                        System.out.println("Your deposit amount is: " + cardlessdeposite + " RS");
                        System.out.println("Cardless deposit successfully done:");
                        System.out.print("Your current balance is: " + (Userinfo.balance() + cardlessdeposite) + " RS");
                    } else System.out.println("Please enter more than 500 RS:");
                }
            }
            case 4 -> {
                System.out.println("Enter your personal pin to check:");
                int newpin = input.nextInt();
                if((newpin == Userinfo.pin1()) && (newpin >= 999 && newpin <= 9999)){
                    System.out.println("Your current balance is: " + Userinfo.balance());
                }else System.out.println("invalid pin please enter the correct pin");
            }
            default -> System.out.println("Invalid input please enter mentioned input 1 to 4");
        }
    }
}