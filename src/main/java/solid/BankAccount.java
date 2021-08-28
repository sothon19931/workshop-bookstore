package solid;

class  Main {
    public  static  void  main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.transferMonney(new BankAccount(), 100);
    }
}
public class BankAccount {
    void  transferMonney(BankAccount targetAccount, int amount) {
        // TODO => Tranfer money process
        System.out.println("Transfer money in Thailand");
    }
}
