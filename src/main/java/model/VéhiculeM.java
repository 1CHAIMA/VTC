package model;

public class VéhiculeM {
	private int id;
    private String marque = "";
    private String modele = "";
    private String couleur  = "";
    private String immatriculation = "";
    
    
	@Override
	public String toString() {
		return "VéhiculeM [id=" + id + ", marque=" + marque + ", modele=" + modele + ", couleur=" + couleur
				+ ", immatriculation=" + immatriculation + "]";
	}
	public VéhiculeM() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VéhiculeM(int id, String marque, String modele, String couleur, String immatriculation) {
		super();
		this.id = id;
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.immatriculation = immatriculation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
    
    
}
