public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $ " + depositAmount +
                " made.New Balance is $ "+ balance);
    }

    public void withdrawlFunds(double withdrawlAmount){
        if(balance-withdrawlAmount<0){
            System.out.println("Insufficiant funds! you only have $" + balance +
                   "in your Account" );
        }else{
            balance-=withdrawlAmount;
            System.out.println("Withdrawl of $ "+ withdrawlAmount +
                    "processed, Remaining balance = $ "+ balance);
        }

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

}
