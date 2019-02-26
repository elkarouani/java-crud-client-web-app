package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import model.Client;

public class ClientDAO {
	@PersistenceContext(unitName = "GestionCommandes")
	EntityManager em;
	public int addClient(Client cl) {
//		Créer une instance em et la stocker dans la session
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionCommandes");
		em = emf.createEntityManager();
//		Persister cl
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(cl);
		t.commit();
//		Actualiser
		return 1;
	}
	
}
