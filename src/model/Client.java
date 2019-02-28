package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@Table(name="client")
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idCl;
	
	@Column(nullable=false, length=40)
	private String nom;

	//bi-directional many-to-one association to Commande
	@OneToMany(mappedBy="client")
	private Set<Commande> commandes;

	public Client() {
	}

	public String getIdCl() {
		return idCl;
	}

	public void setIdCl(String idCl) {
		this.idCl = idCl;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}

	

}