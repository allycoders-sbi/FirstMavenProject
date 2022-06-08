package bank;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SavingsAccount {
	
	@Id
	private int accNo;
	private String accHolder;
	private double balance;
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
