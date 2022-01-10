package DAO;
import model.AssociationM;
import model.ConducteurM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AssociationDao implements  IDAO<AssociationM>{
    Connection connect = Connect.getConnection();
    ResultSet rs = null;
	@Override
	public boolean create(AssociationM object) {
		 boolean msg = false;
	        try {
	            PreparedStatement req = connect.prepareStatement("INSERT INTO association (conducteur, vehicule)"
	                    + "VALUES (?,?)");
	            req.setInt(1, object.getId_conducteur());
	            req.setInt(2, object.getId_vehicule());

	            System.out.println(req);

	            req.executeUpdate();

	            System.out.println(object.getId_conducteur() + " " + object.getId_vehicule() + " � bien �t� ajout� en BDD");
	            msg = true;

	        }catch (Exception e) {
	            System.out.println("Insertion KO");
	        }
	        return msg;
	}
	@Override
	public List<AssociationM> read() {
		List<AssociationM> liste = new ArrayList<>();
        try {
            PreparedStatement req = connect.prepareStatement("SELECT * FROM association INNER JOIN conducteur ON association.conducteur = conducteur.id_conducteur INNER JOIN vehicule ON association.vehicule = vehicule.id_vehicule");

            rs = req.executeQuery();

            while(rs.next()) {
                AssociationM association = new AssociationM(rs.getInt("id_association"), rs.getInt("conducteur"),
                        rs.getInt("vehicule"), rs.getString("nom"), rs.getString("prenom"), rs.getString("marque"), rs.getString("modele"));
                liste.add(association);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return liste;
	}
	@Override
	public void update(AssociationM object) {
		 try {
	            PreparedStatement req = connect.prepareStatement("UPDATE association SET conducteur=?, vehicule=? WHERE id_association=?");
	            req.setInt(1, object.getId_conducteur());
	            req.setInt(2, object.getId_vehicule());
	            req.setInt(3, object.getId());

	            req.executeUpdate();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		
	}
	@Override
	public void delete(int id) {
		 try {
	            PreparedStatement req = connect.prepareStatement("DELETE FROM association WHERE id_association=?");
	            req.setInt(1, id);
	            //System.out.println(req);
	            req.executeUpdate();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}
	@Override
	public AssociationM findById(int id) {

        AssociationM assoById = null;

        try {
            PreparedStatement req = connect.prepareStatement("SELECT * FROM association INNER JOIN conducteur ON association.conducteur = conducteur.id_conducteur INNER JOIN vehicule ON association.vehicule = vehicule.id_vehicule WHERE id_association=?");
            req.setInt(1, id);
            rs = req.executeQuery();
            while(rs.next()) {
                assoById = new AssociationM(rs.getInt("id_association"),rs.getInt("conducteur"),
                        rs.getInt("vehicule"), rs.getString("nom"), rs.getString("prenom"),
                        rs.getString("marque"), rs.getString("modele"));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return assoById;
	}
	@Override
	public List<AssociationM> findByName(String nom) {
		
		return null;
	}

   
}