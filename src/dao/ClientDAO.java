package dao;

import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpSession;

import model.Client;

public class ClientDAO {
	@PersistenceContext(unitName = "GestionCommandes")
	EntityManager em;
	public int addClient(Client cl) {
//		Chercher em dans la session
		em = (EntityManager) ((HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true)).getAttribute("entitymanager");
		
//		Créer une instance em et la stocker dans la session
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionCommandes");
//		em = emf.createEntityManager();
		
//		Persister cl
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(cl);
		t.commit();
//		Actualiser
		return 1;
	}
	
}
