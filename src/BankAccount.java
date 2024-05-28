public class BankAccount {
    // Account number, account balance, customer name, email, phone#
    // create getters and setters for each field
    // Create 2 additional methods: depositing, withdrawing (No negative)
    //

    private int accountNumber = 10011232;
    private int accountBalance = 0;
    private String customerName = "Haji Osman";
    private String email = "hajio@gmail.com";
    private String phoneNumber = "614-615-7605";


    public BankAccount() {
        this("Jamal", "gg@gmail.com", "616-596-5899", 10, 10004322);
        System.out.println("Account constructor with parameters");
    }
    public BankAccount(String customerName, String email, String phoneNumber, int accountBalance, int accountNumber) {
        System.out.println("Account constructor with parameters");
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println(
                "Account constructor with parameters:" +
                        "\nBalance " + accountBalance +
                        ", \nAccount number " + accountNumber +
                        ", \nName " + customerName +
                        "\n_____________ "
        );
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Create 2 additional methods: depositing, withdrawing (No negative)

    public void depositFunds(int dep) {
        this.accountBalance += dep;
        System.out.println("You've deposited $" + dep + ". Your account balance after deposit: $" +this.accountBalance);
    }

    public void withdrawFunds(int wit) {
        if ((this.accountBalance - wit) >= 0) {
            this.accountBalance -= wit;
            System.out.println("You've withdrew $" + wit + ". Your account balance after withdraw: $" + this.accountBalance);
        }else {
            String amount = String.valueOf(wit);
            System.out.println("Withdraw amount of " + amount +
                    " is too high. Please withdraw a lesser amount");
        }
    }
}
