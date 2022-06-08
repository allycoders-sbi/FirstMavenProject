import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import bank.SavingsAccount;

public class SavingsAccountTesting {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
	EntityManager em = emf.createEntityManager();
	
	@Test
	public void creationOfSavingsAccountTest() {
		System.out.println("Begin Testing...");
		System.out.println("Testing...");
	
		
		SavingsAccount sa = new SavingsAccount() ;
		sa.setAccHolder("Yash Paaji");
		sa.setAccNo(102);
		sa.setBalance(50000);
		
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		em.persist(sa);
		trans.commit();
		
		em.close();
		System.out.println("End Testing...");
	}
	
	@Test
	public void extractionOfSavingsAccount() {
		Assertions.assertTrue(emf!=null);
		Assertions.assertTrue(em!=null);
		SavingsAccount sa = em.find(SavingsAccount.class,102);
		Assertions.assertTrue(sa!=null);
		System.out.println("Naam:"+sa.getAccHolder()+" Ac No:"+sa.getAccNo()+" Balancewa:"+sa.getBalance());
	}

}
