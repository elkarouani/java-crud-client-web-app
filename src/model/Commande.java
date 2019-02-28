package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the commande database table.
 * 
 */
@Entity
@Table(name="commande")
@NamedQuery(name="Commande.findAll", query="SELECT c FROM Commande c")
public class Commande implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false, length=10)
	private String dateCmd;

	@Column(nullable=false)
	private int nbc;
	
	@Id
	@Column(nullable=false)
	private String idClient;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="idClient", referencedColumnName="idCl", nullable=false)
	private Client client;

	public Commande() {
	}

	public String getDateCmd() {
		return dateCmd;
	}

	public void setDateCmd(String dateCmd) {
		this.dateCmd = dateCmd;
	}

	public int getNbc() {
		return nbc;
	}

	public void setNbc(int nbc) {
		this.nbc = nbc;
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}
	

}