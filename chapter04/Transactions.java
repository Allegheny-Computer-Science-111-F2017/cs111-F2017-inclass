/**
 * Demonstrates the creation and use of multiple Accounts.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 */
public class Transactions {

  /** Creates some bank accounts and requests various services.
   *  Compile this program: javac Transactions.java
   *  Run this program: java Transactions
   */
  public static void main(String[] args) {
    Account acct1 = new Account("Ted Murphy", 72354, 102.56);
    Account acct2 = new Account("Jane Smith", 69713, 40.00);

    // perform deposits and withdraws on an account
    acct1.deposit(25.85);
    double smithBalance = acct2.deposit(500.00);
    System.out.println("Smith balance after deposit: " + smithBalance);
    System.out.println("Murphy balance after withdrawal: "
                        + acct2.withdraw(430.75, 1.50));

    Account acct3 = new Account("Edward Demsey", 93757, 759.32);

    // add interest to the accounts
    acct1.addInterest();
    acct2.addInterest();
    acct3.addInterest();

    // display the status of the accounts
    System.out.println();
    System.out.println(acct1);
    System.out.println(acct2);
    System.out.println(acct3);
  }
}
