package com.example.tp1_pokecarte;

public class Carte {
    private String nom;
    private String carteType;
    private int sort1;
    private int sort2;
    private boolean estUneEvolution;
    private String typePokemon;
    private String imageUrl;

    public Carte(String nom, String carteType,  int sort1, int sort2, boolean estUneEvolution, String typePokemon, String url) {
        /*
            FACILE (/2)
            Ecrire le constructeur permettant de donner une valeur à chacun des attributs en fonction de la saisie
            de l'utilisateur.
            Si le carteType est différent de "Pokemon", alors attribuer :
            - aux attributs sort1, sort2 la valeur 0
            - à l'attribut "estUneEvolution" la valeur False
            - à l'attribut typePokemon la valeur "Null"
         */
        this.nom = nom;
        this.carteType = carteType;
        this.sort1 = sort1;
        this.sort2 = sort2;
        this.estUneEvolution = estUneEvolution;
        this.typePokemon = typePokemon;
        this.imageUrl = url;
        if (carteType != "Pokemon"){
            this.sort1 = 0;
            this.sort2 = 0;
            this.estUneEvolution = false;
            this.typePokemon = "Null";

        }


    }

    public String getNom() {
        return nom;
    }

    public String getCarteType() {
        return carteType;
    }



    public int getSort1() {
        return sort1;
    }

    public int getSort2() {
        return sort2;
    }

    public boolean isEstUneEvolution() {
        return estUneEvolution;
    }

    public String getTypePokemon() {
        return typePokemon;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCarteType(String carteType) {
        this.carteType = carteType;
    }

    public void setSort1(int sort1) {
        this.sort1 = sort1;
    }

    public void setSort2(int sort2) {
        this.sort2 = sort2;
    }

    public void setEstUneEvolution(boolean estUneEvolution) {
        this.estUneEvolution = estUneEvolution;
    }

    public void setTypePokemon(String typePokemon) {
        this.typePokemon = typePokemon;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
