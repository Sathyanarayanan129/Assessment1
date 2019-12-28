package wallet.entity;

public class CustomerWallet {
	private String mobile;
	private String name;
	private double balance;

	public CustomerWallet() {
		
	}
	public CustomerWallet(String mobile,String name,double balance)
	{
		this.mobile=mobile;
		this.name=name;
		this.balance=balance;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void addAmount(double amount)
	{
		this.balance+=amount;
	}
	public void transferMoney(CustomerWallet c,double money)
	{
		this.balance-=money;
		c.addAmount(money);
	}
	@Override
	public String toString()
	{
		String s= new String();
		s="Num= " + this.mobile + " Name= "+this.name + " Balance= " + this.balance;
		return s;
	}
}
