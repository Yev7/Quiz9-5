package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Transactable, Worker{
    private BankAccount bankAccount;
    private Double hoursWorked;
    private Double hourlyWage;
    private Double moneyEarned;


    public Employee() {
        this.bankAccount = new BankAccount();
        this.hoursWorked = 0.0;
        this.hourlyWage = 35.0;
        this.moneyEarned = 0.0;
    }

    public Employee(BankAccount bankAccount, Double hoursWorked, Double hourlyWage, Double moneyEarned) {
        this.bankAccount = bankAccount;
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
        this.moneyEarned = moneyEarned;
    }


    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.hoursWorked = 0.0;
        this.hourlyWage = 35.0;
        this.moneyEarned = 0.0;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        bankAccount.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.hoursWorked += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return this.moneyEarned;
    }
}
