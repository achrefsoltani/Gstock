package com.example.gstock;

public class emprunt {
    private composant _composant;
    private membre _membre;
    private int _quantite;
    private String _dateemprunt;
    private String _dateretour;
    private String _etat;

    public emprunt(composant _composant, membre _membre, int _quantite, String _dateemprunt, String _dateretour, String _etat) {
        this._composant = _composant;
        this._membre = _membre;
        this._quantite = _quantite;
        this._dateemprunt = _dateemprunt;
        this._dateretour = _dateretour;
        this._etat = _etat;
    }

    public composant get_composant() {
        return _composant;
    }

    public void set_composant(composant _composant) {
        this._composant = _composant;
    }

    public membre get_membre() {
        return _membre;
    }

    public void set_membre(membre _membre) {
        this._membre = _membre;
    }

    public int get_quantite() {
        return _quantite;
    }

    public void set_quantite(int _quantite) {
        this._quantite = _quantite;
    }

    public String get_dateemprunt() {
        return _dateemprunt;
    }

    public void set_dateemprunt(String _dateemprunt) {
        this._dateemprunt = _dateemprunt;
    }

    public String get_dateretour() {
        return _dateretour;
    }

    public void set_dateretour(String _dateretour) {
        this._dateretour = _dateretour;
    }

    public String get_etat() {
        return _etat;
    }

    public void set_etat(String _etat) {
        this._etat = _etat;
    }
}
