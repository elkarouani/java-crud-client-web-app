package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String idCl;

	private String nom;

	public Client() {
	}

	public String getIdCl() {
		return this.idCl;
	}

	public void setIdCl(String idCl) {
		this.idCl = idCl;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}