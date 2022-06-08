package bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ORMTest {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		EntityManager em = emf.createEntityManager();
		
		SavingsAccount sa = new SavingsAccount() ;
		sa.setAccHolder("Jayant Sachdeva");
		sa.setAccNo(101);
		sa.setBalance(50000);
		
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		em.persist(sa);
		trans.commit();
		
		em.close();
		
	}
}
