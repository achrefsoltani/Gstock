package com.example.gstock;

public class membre {
    private String nom;
    private String prenom;
    private String email;
    private int tel;
    private int _ImageRessourceId = -1;

    public membre(String nom, String prenom, String email, int tel, int _ImageRessourceId) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this._ImageRessourceId = _ImageRessourceId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int get_ImageRessourceId() {
        return _ImageRessourceId;
    }

    public void set_ImageRessourceId(int _ImageRessourceId) {
        this._ImageRessourceId = _ImageRessourceId;
    }

    public Boolean AuneImage(){
        return _ImageRessourceId != -1;
    }
}
