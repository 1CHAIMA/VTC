package model;

import model.ConducteurM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.Connect;

public class ConducteurM{
	  private int id;
	    private String nom = "";
	    private String prenom = "";

	    public ConducteurM(String nom, String prenom)
	    {
	        this.nom = nom;
	        this.prenom = prenom;
	    }
	    public ConducteurM(int id, String nom, String prenom)
	    {
	        this.id = id;
	        this.nom = nom;
	        this.prenom = prenom;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public String getPrenom() {
	        return prenom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public void setPrenom(String prenom) {
	        this.prenom = prenom;
	    }


   
}