package casamepp.com.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import casamepp.com.bean.Pessoa;


public class PessoaDAO {
	
	protected static EntityManager entityManager;
	
	public PessoaDAO() {
	        entityManager = getEntityManager();
	}
	
	private EntityManager getEntityManager() {
	        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPU");
	        if (entityManager == null) {
	                 entityManager = factory.createEntityManager();
	        }
	
	        return entityManager;
	}

	 public void persist(Pessoa pessoa) {
         try {
                  entityManager.getTransaction().begin();
                  entityManager.persist(pessoa);
                  entityManager.getTransaction().commit();
         } catch (Exception ex) {
                  ex.printStackTrace();
                  entityManager.getTransaction().rollback();
         }
        
	 }
	 
	 public void merge(Pessoa pessoa) {
         try {
                  entityManager.getTransaction().begin();
                  entityManager.merge(pessoa);
                  entityManager.getTransaction().commit();
         } catch (Exception ex) {
                  ex.printStackTrace();
                  entityManager.getTransaction().rollback();
         }
}
}
