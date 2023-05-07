public class bankMethod {
    public static int currentBal = 1000;
    public static void hai() {
        // method body
        System.out.println("hai everyone");
    }
    public void deposit(int amount) {
        currentBal=currentBal+amount;
        System.out.println("amount is deposited");
    }
    public static void withdraw(int amount) {
        currentBal=currentBal-amount;
        System.out.println("amount is withdraw");
    }
    public int getCurrentBal() {
        return currentBal;

    }
    public static void main(String[] args) {
        hai();
        bankMethod bank=new bankMethod();
        System.out.println("current balance is:"+bank.getCurrentBal());
        bank.deposit(500);
        System.out.println("current balance is:"+bank.getCurrentBal());
        withdraw(600);
        System.out.println("current balance is:"+bank.getCurrentBal());


    }
}
