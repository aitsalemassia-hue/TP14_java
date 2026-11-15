package ma.projet.entities;

import java.util.Date;

public class Machine implements Identifiable {
	private int id;
	private String ref;
	private Date dateAchat;
	private Salle salle;
	
	
	
	public Machine(int id, String ref, Date dateAchat, Salle salle) {
		super();
		this.id = id;
		this.ref = ref;
		this.dateAchat = dateAchat;
		this.salle = salle;
	}
	
	// redefinition des methodes 
	@Override
	public int getId() {
		return id;
	}
	@Override
	public void setId(int id) {
		this.id=id;
	}
	
	//getters et setters
	
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public Date getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	
	
	//to string 
	@Override
	public String toString() {
		return "Machine [id=" + id + ", ref=" + ref + ", dateAchat=" + dateAchat + ", salle=" + salle + "]";
	}
	
	
	
	
	
	
	

}
