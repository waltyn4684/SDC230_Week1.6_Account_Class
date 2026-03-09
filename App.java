/*******************************************************************
* Name: Wallace Tyner
* Date: 03/09/2026
* Assignment SDC230 Week 1 GP – Account Class
*
* Main application class.
* Demonstrates creating Account objects and modifying balances.
*******************************************************************/

import java.util.Scanner;

public class App {

public static void main(String[] args) {

System.out.println();
System.out.println("Wallace Tyner - Week 1 GP Account Class");

//Create account objects
Account acct1 = new Account("Jane Green", 50.00);
Account acct2 = new Account("John Blue", -7.53);

//Display starting balances
System.out.printf("%n%s balance: $%.2f%n",
acct1.getName(), acct1.getBalance());

System.out.printf("%s balance: $%.2f%n",
acct2.getName(), acct2.getBalance());

Scanner input = new Scanner(System.in);

System.out.println();
System.out.print("Enter deposit amount for Jane's account: $");

double deposit = input.nextDouble();

System.out.printf("%nAdding $%.2f to Jane's account%n%n", deposit);

acct1.deposit(deposit);

System.out.print("Enter deposit amount for John's account: $");

deposit = input.nextDouble();

System.out.printf("%nAdding $%.2f to John's account%n%n", deposit);

acct2.deposit(deposit);

//Display balances
System.out.printf("%s balance: $%.2f%n",
acct1.getName(), acct1.getBalance());

System.out.printf("%s balance: $%.2f%n",
acct2.getName(), acct2.getBalance());

}

}