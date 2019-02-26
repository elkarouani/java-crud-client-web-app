package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the commande database table.
 * 
 */
@Entity
@NamedQuery(name="Commande.findAll", query="SELECT c FROM Commande c")
public class Commande implements Serializable {
	private static final long serialVersionUID = 1L;

	private String dateCmd;

	private String idClient;
	
	@Id
	private int nbc;

	public Commande() {
	}

	public String getDateCmd() {
		return this.dateCmd;
	}

	public void setDateCmd(String dateCmd) {
		this.dateCmd = dateCmd;
	}

	public String getIdClient() {
		return this.idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public int getNbc() {
		return this.nbc;
	}

	public void setNbc(int nbc) {
		this.nbc = nbc;
	}

}