package com.example.tp6exo1;

public class Module {

    private String module;
    private String horaire;
    private String coefficient;
    private String description;

    public Module(String module, String horaire, String coefficient, String description) {
        this.module = module;
        this.horaire = horaire;
        this.coefficient = coefficient;
        this.description = description;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public String getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(String coefficient) {
        this.coefficient = coefficient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
