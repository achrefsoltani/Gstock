package com.example.gstock;

public class composant {
    private String _nomc;
    private famille _famille;
    private int _quantite;
    private String _dateacquisition;
    private int _ImageRessourceId = -1;

    public composant(String _nomc, famille _famille, int _quantite, String _dateacquisition, int _ImageRessourceId) {
        this._nomc = _nomc;
        this._famille = _famille;
        this._quantite = _quantite;
        this._dateacquisition = _dateacquisition;
        this._ImageRessourceId = _ImageRessourceId;
    }

    public String get_nomc() {
        return _nomc;
    }

    public void set_nomc(String _nomc) {
        this._nomc = _nomc;
    }

    public famille get_famille() {
        return _famille;
    }

    public void set_famille(famille _famille) {
        this._famille = _famille;
    }

    public int get_quantite() {
        return _quantite;
    }

    public void set_quantite(int _quantite) {
        this._quantite = _quantite;
    }

    public String get_dateacquisition() {
        return _dateacquisition;
    }

    public void set_dateacquisition(String _dateacquisition) {
        this._dateacquisition = _dateacquisition;
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
