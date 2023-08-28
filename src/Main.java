public class Main {
	
	public static void main(String[] args) {
    
    StandartAtm atm = new StandartAtm();
    
    Account account = new Account("227654", "Mahmut Yılmaz", 5000 );
    
    atm.apply(account);
    
    System.out.println("Sayfadan ayriliyorsunuz!!!");
	}
}
