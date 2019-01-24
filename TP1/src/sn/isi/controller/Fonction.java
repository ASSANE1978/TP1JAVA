package sn.isi.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Fonction {
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private double note;
    private int coef;
public void calculNote()
{
    Scanner scan = new Scanner(System.in);
    String rep = null;
    String  rep1 = null;

    double moyenne = 0.0;
    double somme = 0.0;
    int somme2 = 0;

    do {

        System.out.println("Entre le nom ");
        nom = scan.nextLine();
        System.out.println("Entre le prenom ");
        prenom = scan.nextLine();
        System.out.println("Entre la date de naissance:dd/M/yyyy ");
        String dnais = scan.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/YYYY");

        try {

            dateNaissance = sdf.parse(dnais);

        }catch (Exception ex) {
            ex.printStackTrace();
        }


        //Saisie des notes.
        do {

            System.out.println("Entre les notes ");
            note = Double.parseDouble(scan.nextLine());
            System.out.println("Entre le coefitient ");
            coef = Integer.parseInt(scan.nextLine());
            somme = somme + (note * coef);
            somme2 = somme2 + coef;

            System.out.println("voulez vous continuer? oui/non ");
            rep1 = scan.nextLine();
        }while((rep1.equalsIgnoreCase("oui")));

        //Calcul de la Moyenne.
        moyenne = somme/somme2;
      //Affichage de l'etudiant.
        System.out.println("nom: " + nom);
        System.out.println("prenom: " + prenom);
        System.out.println("dateNaiss: " + dateNaissance);
        System.out.println("L'etudiant a comme moyenne: " + moyenne);

        System.out.println("voulez vous continuer? oui/non ");

        rep = scan.nextLine();
    }while((rep.equalsIgnoreCase("oui")));



}
}
