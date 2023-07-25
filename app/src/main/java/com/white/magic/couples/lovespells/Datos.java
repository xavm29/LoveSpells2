package com.white.magic.couples.lovespells;

public class Datos {
    private String Title;
    private String Materiales;
    private String Description;

    public Datos() {

    }

    public Datos(String title, String materiales, String description) {
        Title = title;
        Materiales = materiales;
        Description = description;

    }


    public String getTitle() {
        return Title;
    }



    public String getDescription() {
        return Description;
    }

    public String getMateriales() {
        return Materiales;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setMateriales(String materiales) {
        Materiales = materiales;
    }

    public void setDescription(String description) {
        Description = description;
    }


}
