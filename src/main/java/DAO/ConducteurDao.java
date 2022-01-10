package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import model.ConducteurM;

public class ConducteurDao implements IDAO<ConducteurM> {
	Connection connect = Connect.getConnection();
    ResultSet rs = null;
	@Override
	public boolean create(ConducteurM object) {
		 boolean msg = false;
	        try {
	            PreparedStatement req = connect.prepareStatement("INSERT INTO conducteur (nom, prenom)"
	                    + "VALUES (?,?)");
	            req.setString(1, object.getNom());
	            req.setString(2, object.getPrenom());

	            System.out.println(req);

	            req.executeUpdate();

	            System.out.println(object.getPrenom() + " " + object.getNom() + " à bien été ajouté en BDD");
	            msg = true;

	        }catch (Exception e) {
	            System.out.println("Insertion KO");
	        }
	        return msg; boolean msg = false;
	        try {
	            PreparedStatement req = connect.prepareStatement("INSERT INTO conducteur (nom, prenom)"
	                    + "VALUES (?,?)");
	            req.setString(1, object.getNom());
	            req.setString(2, object.getPrenom());

	            System.out.println(req);

	            req.executeUpdate();

	            System.out.println(object.getPrenom() + " " + object.getNom() + " à bien été ajouté en BDD");
	            msg = true;

	        }catch (Exception e) {
	            System.out.println("Insertion KO");
	        }
	        return msg;
	}

	@Override
	public List<ConducteurM> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(ConducteurM object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ConducteurM findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ConducteurM> findByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
