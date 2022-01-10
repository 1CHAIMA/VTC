package model;

public class AssociationM {
	private int id;
    private int id_conducteur;
    private int id_vehicule;
    private String nomConducteur;
    private String prenomConducteur;
    private String marqueVehicule;
    private String modeleVehicule;
    
    
    
	@Override
	public String toString() {
		return "AssociationM [id=" + id + ", id_conducteur=" + id_conducteur + ", id_vehicule=" + id_vehicule
				+ ", nomConducteur=" + nomConducteur + ", prenomConducteur=" + prenomConducteur + ", marqueVehicule="
				+ marqueVehicule + ", modeleVehicule=" + modeleVehicule + "]";
	}
	public AssociationM() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AssociationM(int id, int id_conducteur, int id_vehicule, String nomConducteur, String prenomConducteur,
			String marqueVehicule, String modeleVehicule) {
		super();
		this.id = id;
		this.id_conducteur = id_conducteur;
		this.id_vehicule = id_vehicule;
		this.nomConducteur = nomConducteur;
		this.prenomConducteur = prenomConducteur;
		this.marqueVehicule = marqueVehicule;
		this.modeleVehicule = modeleVehicule;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_conducteur() {
		return id_conducteur;
	}
	public void setId_conducteur(int id_conducteur) {
		this.id_conducteur = id_conducteur;
	}
	public int getId_vehicule() {
		return id_vehicule;
	}
	public void setId_vehicule(int id_vehicule) {
		this.id_vehicule = id_vehicule;
	}
	public String getNomConducteur() {
		return nomConducteur;
	}
	public void setNomConducteur(String nomConducteur) {
		this.nomConducteur = nomConducteur;
	}
	public String getPrenomConducteur() {
		return prenomConducteur;
	}
	public void setPrenomConducteur(String prenomConducteur) {
		this.prenomConducteur = prenomConducteur;
	}
	public String getMarqueVehicule() {
		return marqueVehicule;
	}
	public void setMarqueVehicule(String marqueVehicule) {
		this.marqueVehicule = marqueVehicule;
	}
	public String getModeleVehicule() {
		return modeleVehicule;
	}
	public void setModeleVehicule(String modeleVehicule) {
		this.modeleVehicule = modeleVehicule;
	}
    
}
