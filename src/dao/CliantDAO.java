package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Client;

public class CliantDAO {
	@PersistenceContext ()
	EntityManager em;
	public int addClient(Client cl) {
		return 1;
	}
	
}
