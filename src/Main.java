//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber(1231231);
        bankAccount.setCustomerName("James Brown");
        bankAccount.setEmail("jab@gmail.com");
        bankAccount.setPhoneNumber("911");
        bankAccount.depositFunds(100);
        bankAccount.withdrawFunds(100);
        bankAccount.depositFunds(100);
        bankAccount.depositFunds(200);

    }
}