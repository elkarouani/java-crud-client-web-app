package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Client;

public class ClientDAO {
	@PersistenceContext
	EntityManager em;
	public int addClient(Client cl) {
//		Persister cl
		em.persist(cl);
//		Actualiser
		em.flush();
		
		return 1;
	}
	
}
