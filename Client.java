package org.ldv.sio;

public class Client {
  private String nom;
  private String prenom;
  private String AdresseDomicile;
  private String AdresseLivraison;


  public Client (String nom, String prenom, String AdresseDomicile) {
    this.nom = nom;
    this.prenom = prenom;
    this.prenom = AdresseDomicile;
    this.prenom = AdresseLivraison;
  }

  public Client(String nom, String prenom, String AdresseDomicile, String AdresseLivraison) {
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getAddressD() {
    return AdresseDomicile;
  }

  public void setAddressDomicile(String addressD) {
    this.AdresseDomicile = addressD;
  }

  public String getAddressLivraison() {
    return AdresseLivraison;
  }

  public void setAddressL(String addressL) {
    this.AdresseLivraison = addressL;
  }

  @Override
  public String toString() {
    return "Client {" +
            "nom='" + nom + '\'' +
            ", prenom='" + prenom + '\'' +
            ", adresseD='" + AdresseDomicile+ '\'' +
            ", adresseL='" + AdresseLivraison + '\'' +
            '}';
  }

  public String getLivraison() {
    return "Client{, adresseL='" + AdresseLivraison + '\'' +"";}


  public void Domicile() {
    }
}
