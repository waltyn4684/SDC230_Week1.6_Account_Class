/*******************************************************************
* Name: Wallace Tyner
* Date: 03/09/2026
* Assignment SDC230 Week 1 GP – Account Class
*
* Account class.
* This class represents an account, such as a bank account, with an
* individual's name and the balance associated with the account. A
* getter and setter are provided for the name property; a getter is
* provided for the balance along with a deposit method to add an
* amount to the balance.
*
* Error checking ensures balances and deposits are greater than 0.
* The balance cannot be directly modified outside the constructor
* and deposit method.
*******************************************************************/

public class Account {

private String Name;
private double Balance;

//constructor
public Account(String name, double balance) {
Name = name;

if (balance > 0.0) {
Balance = balance;
}
}

//getter for name
public String getName() {
return Name;
}

//setter for name
public void setName(String name) {
Name = name;
}

//getter for balance
public double getBalance() {
return Balance;
}

//deposit method
public void deposit(double amount) {
if (amount > 0.0) {
Balance = Balance + amount;
}
}

}