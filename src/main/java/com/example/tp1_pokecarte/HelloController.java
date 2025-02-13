package com.example.tp1_pokecarte;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private Label lblName;
    @FXML
    private Label lblCardType;
    @FXML
    private Label lblMove1;
    @FXML
    private Label lblPokemonType;
    @FXML
    private Label lblMove2;

    @FXML
    private Label lblIsEvolution;
    @FXML
    private ImageView imgCard;
    Carte fightEnergy;
    Carte psyEnergy;
    Carte aquaEnergy;
    Carte sandshrew;
    Carte koffing;
    Carte magikarp;
    Carte pokeBall;
    Carte pokegear;
    Carte chen;

    Carte cardCourante;
    @FXML
    private Label lblLblSort2;
    @FXML
    private Label lblLblSort1;
    public Carte c;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fightEnergy = new Carte("FIGHT ENERGY", "Energy",  0, 0, false, "Null", "1-120.png");

        aquaEnergy = new Carte("AQUA ENERGY", "Energy",  0, 0, false, "Null", "1-117.png");

        psyEnergy = new Carte("PSY ENERGY", "Energy",  0, 0, false, "Null", "1-119.png");

        pokeBall = new Carte("Poke Ball", "Trainer",  0, 0, false, "Null", "1-95.png");

        pokegear = new Carte("Pokegear 3.0", "Trainer",  0, 0, false, "Null", "1-96.png");

        chen = new Carte("Prof Chen", "Trainer",  0, 0, false, "Null", "1-101.png");

        sandshrew = new Carte("Sandshrew", "Pokemon",  0, 10, false, "Fight", "1-29.png");

        koffing = new Carte("Koffing", "Pokemon",  10, 20, false, "Psy", "1-70.png");

        magikarp = new Carte("Magikarp", "Pokemon",  10, 0, false, "Aqua", "1-72.png");

    }

    public void aff(Carte c)
    {
        /*
            FACILE (/2)
            aff(Carte c) est une fonction qui ne va rien retourner. Son unique objectif est d'afficher les informations relatives aux cartes :
            - nom dans lblName
            - carteType dans lblCardType
            - Sort1 dans lblMove1
            - Sort2 dans lblMove2
            - estUneEvolution dans lblIsEvolution
            - typePokemon dans lblPokemonType*/

            /*lblName.setText(c.getNom());
            lblCardType.setText(c.getCarteType());
            lblMove1.setText(String.valueOf(c.getSort1()));
            lblMove2.setText(String.valueOf(c.getSort2()));
            lblIsEvolution.setText(String.valueOf(c.isEstUneEvolution()));
            lblPokemonType.setText(c.getTypePokemon());*/



            /*MOYEN (/2)
            Utiliser la méthode lblAttribution pour vous aider à réaliser cette tâche, méthode mise à votre disposition en bas de ce fichier*/

            lblAttribution(lblName,c.getNom());
            lblAttribution(lblCardType,c.getCarteType());
            lblAttribution(lblMove1,c.getSort1());
            lblAttribution(lblMove2,c.getSort2());
            lblAttribution(lblIsEvolution, String.valueOf(c.isEstUneEvolution()));
            lblAttribution(lblPokemonType,c.getTypePokemon());

            /*MOYEN (/3)
            Utiliser la méthode changeImageViewImg pour afficher la carte correspondant à l'objet. Cette fonction prend
            uniquement en paramètre l'ImageView imgCard ainsi que l'URL de l'objet (imageUrl qui est un attribut de la classe Carte)*/

            changeImageViewImg(imgCard,c.getImageUrl());


            /*MOYEN-DIFFICILE (/4)
            Si la carte sélectionnée n'est pas un Pokemon, alors cacher les lignes "Sort 1 :" et "Sort 2:" identifiées respectivement par
            les Label lblLblSort1 et lblLblSort2.
         */

            if (c.getCarteType() != "Pokemon"){
                changeImageViewImg(imgCard,c.getImageUrl());
                lblAttribution(lblIsEvolution, String.valueOf(c.isEstUneEvolution()));
                lblAttribution(lblPokemonType,c.getTypePokemon());
                lblAttribution(lblName,c.getNom());
                lblAttribution(lblCardType,c.getCarteType());
                lblMove1.setText("Impossible");
                lblMove2.setText("Impossible");
            }



    }
    @FXML
    public void clickChen(MouseEvent mouseEvent) {
        /*
           FACILE (/2)
           Cette méthode se lance lorsque nous cliquons sur la carte "Chen", la carte se trouvant en bas à droite.
           Il faudra alors afficher les informations relatives à la carte "Chen" dans l'espace prévu à cet effet.
         */
        aff(chen);
    }

    public void clickModification(MouseEvent kart) {
        /*
            DIFFICILE (/5)
            Cette fonction devra également s'accompagner de changement dans la vue (SceneBuilder). Vous serez libres de faire comme vous le souhaitez.
            En cliquant sur le bouton modification, vous appliquerez les modifications que vous souhaitez vis-à-vis d'une carte.

         */
        Carte kart ;
        kart.setNom("");
        lblName.setText(kart.getNom());




    }


    @FXML
    public void clickPokedex(MouseEvent mouseEvent) {
        aff(pokegear);
    }

    @FXML
    public void clickPokeBall(MouseEvent mouseEvent) {
        aff(pokeBall);
    }

    @FXML
    public void clickEnergyWater(MouseEvent mouseEvent) {
        aff(aquaEnergy);
    }

    @FXML
    public void clickEnergyPsy(MouseEvent mouseEvent) {
        aff(psyEnergy);
    }

    @FXML
    public void clickEnergyFight(MouseEvent mouseEvent) {
        aff(fightEnergy);
    }

    @FXML
    public void clickMagikarp(MouseEvent mouseEvent) {
        aff(magikarp);
    }

    @FXML
    public void clickKoffing(MouseEvent mouseEvent) {
        aff(koffing);
    }

    @FXML
    public void clickSandslash(MouseEvent mouseEvent) {
        aff(sandshrew);
    }



    public void changeImageViewImg(ImageView imgView, String linkImage){
        imgView.setImage(
                new Image(
                        getClass().getResource(
                                "/images/"+linkImage
                        ).toExternalForm()
                )
        );
    }
    public void lblAttribution(Label l, String s)
    {

        l.setText(s);
    }
    public void lblAttribution(Label l, int i)
    {
        l.setText(String.valueOf(i));
    }


}