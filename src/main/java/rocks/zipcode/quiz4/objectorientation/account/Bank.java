package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    ArrayList<BankAccount> bankAccountArrayList;
    public Bank(){
        bankAccountArrayList = new ArrayList<>();
    }


    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        return bankAccountArrayList.remove((int) indexNumber);
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccountArrayList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return bankAccountArrayList.contains(bankAccount);
    }

    public ArrayList<BankAccount> getBankAccountArrayList() {
        return bankAccountArrayList;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankAccountArrayList=" + bankAccountArrayList +
                '}';
    }
}
