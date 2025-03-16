public class Main6{
    public static void main(String[] args) {
        BankAccount account=new BankAccount(1000000,"Maxim Chakanov");
        account.deposit(5000);
        account.withdraw(30000);
        account.withdraw(30000000);
        System.out.println("Итоговый баланс :" + account.getBalance()+" руб.");
    }
    
}
