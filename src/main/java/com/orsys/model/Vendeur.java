package com.orsys.model;

public class Vendeur {
	private String nom,categorie,type,adresse,telephone;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Vendeur(String nom, String categorie, String type, String adresse, String telephone) {
		super();
		this.nom = nom;
		this.categorie = categorie;
		this.type = type;
		this.adresse = adresse;
		this.telephone = telephone;
	}

	public Vendeur() {
		super();
	}
	
	
	
}
