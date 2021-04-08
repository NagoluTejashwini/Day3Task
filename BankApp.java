package day3.task1;

public class BankApp {

	public static void main(String[] args) {
		BankAccount user1 = new BankAccount();
		user1.setAccountHolderName("Ramesh");
		user1.setBalance(20000);
		user1.doDeposit(1000);
		user1.doWithdrawal(5000);
		if(user1.isStatus()) {
			System.out.println(user1.getAccountHolderName()+" account is Active and "+"balance is "+user1.getBalance());
		}
		else {
			System.out.println(user1.getAccountHolderName()+" account is Inactive and "+"balance is "+user1.getBalance());
		}
		
		BankAccount user2 = new BankAccount();
		user2.setAccountHolderName("Suresh");
		user2.setBalance(2000);
		user2.doDeposit(1000);
		user2.doWithdrawal(5000);
		if(user2.isStatus()) {
			System.out.println(user2.getAccountHolderName()+" account is Active and "+"balance is "+user2.getBalance());
		}
		else {
			System.out.println(user2.getAccountHolderName()+" account is Inactive and "+"balance is "+user2.getBalance());
		}
		
		
	}

}
