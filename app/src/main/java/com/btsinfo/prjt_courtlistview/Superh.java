
package com.btsinfo.prjt_courtlistview;

public class Superh {
    int idM;
    int idE;
    String nomM;

    public int getIdM() {
        return idM;
    }

    public void setIdM(int idM) {
        this.idM = idM;
    }

    public int getIdE() {
        return idE;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }

    public String getNomM() {
        return nomM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public String getDescM() {
        return descM;
    }

    public void setDescM(String descM) {
        this.descM = descM;
    }

    public String getImgM() {
        return imgM;
    }

    public void setImgM(String imgM) {
        this.imgM = imgM;
    }

    String descM;
    String imgM;

    public Superh(int idM, int idE, String nomM, String descM, String imgM) {
        this.idM = idM;
        this.idE = idE;
        this.nomM = nomM;
        this.descM = descM;
        this.imgM = imgM;
    }

}