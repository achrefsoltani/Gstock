package com.example.gstock;

public class famille {
    private String _nomf;
    private int _ImageRessourceId = -1;

    public famille(String _nomf, int _ImageRessourceId) {
        this._nomf = _nomf;
        this._ImageRessourceId = _ImageRessourceId;
    }

    public String get_nomf() {
        return _nomf;
    }

    public void set_nomf(String _nomf) {
        this._nomf = _nomf;
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
