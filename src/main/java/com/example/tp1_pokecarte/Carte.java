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
}
