package DAO;
import model.ConducteurM;
import model.VéhiculeM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VehiculeDao implements  IDAO<VéhiculeM>{

    Connection connect = Connect.getConnection();
    ResultSet rs = null;
	@Override
	public boolean create(VéhiculeM object) {
		 boolean msg = false;
	        try {
	            PreparedStatement req = connect.prepareStatement("INSERT INTO vehicule (marque, modele, couleur, immatriculation)"
	                    + "VALUES (?,?,?,?)");
	            req.setString(1, object.getMarque());
	            req.setString(2, object.getModele());
	            req.setString(3, object.getCouleur());
	            req.setString(4, object.getImmatriculation());

	            System.out.println(req);

	            req.executeUpdate();

	            System.out.println(object.getMarque() + " " + object.getModele() + " à bien été ajouté en BDD");
	            msg = true;

	        }catch (Exception e) {
	            System.out.println("Insertion KO");
	        }
	        return msg;
	}
	@Override
	public List<VéhiculeM> read() {
		List<VéhiculeM> liste = new ArrayList<>();
        try {
            PreparedStatement req = connect.prepareStatement("SELECT * FROM vehicule");

            rs = req.executeQuery();

            while(rs.next()) {
                VéhiculeM vehicule = new VéhiculeM(rs.getInt("id_vehicule"),
                        rs.getString("marque"), rs.getString("modele"),
                        rs.getString("couleur"), rs.getString("immatriculation"));
                liste.add(vehicule);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return liste;
	}
	@Override
	public void update(VéhiculeM object) {
		 try {
	            PreparedStatement req = connect.prepareStatement("UPDATE vehicule SET marque=?, modele=?, couleur=?, immatriculation=? WHERE id_vehicule=?");
	            req.setString(1, object.getMarque());
	            req.setString(2, object.getModele());
	            req.setString(3, object.getCouleur());
	            req.setString(4, object.getImmatriculation());
	            req.setInt(5, object.getId());

	            req.executeUpdate();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}
	@Override
	public void delete(int id) {
		 try {
	            PreparedStatement req = connect.prepareStatement("DELETE FROM vehicule WHERE id_vehicule=?");
	            req.setInt(1, id);
	            //System.out.println(req);
	            req.executeUpdate();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		
	}
	@Override
	public VéhiculeM findById(int id) {

        VéhiculeM vehiById = null;

        try {
            PreparedStatement req = connect.prepareStatement("SELECT * FROM vehicule WHERE id_vehicule=?");
            req.setInt(1, id);
            rs = req.executeQuery();
            while(rs.next()) {
                vehiById = new VéhiculeM(rs.getInt("id_vehicule"),rs.getString("marque"), rs.getString("modele"),
                        rs.getString("couleur"), rs.getString("immatriculation"));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return vehiById;
	}
	@Override
	public List<VéhiculeM> findByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}
	}
