package com.btsinfo.prjt_courtlistview;

public class Equipe {
    int idE;
    String nomE;
    String descE;
    String imgE;

    public Equipe(int idE, String nomE, String descE, String imgE) {
        this.idE = idE;
        this.nomE = nomE;
        this.descE = descE;
        this.imgE = imgE;
    }

    public int getIdE() {
        return idE;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public String getDescE() {
        return descE;
    }

    public void setDescE(String descE) {
        this.descE = descE;
    }

    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
        this.imgE = imgE;
    }
}
