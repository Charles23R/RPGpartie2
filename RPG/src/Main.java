import java.util.Scanner;

import personnages.*;

import sorts.*;

import armes.*;

public class Main {
    public static void main(String[] args) {

        //Variables
        boolean erreur=false;
        Personnage perso1=creerPerso();
        Personnage perso2=creerPerso();
        int tour=0;

        //Combat
        while (perso1.getPv()>0 && perso2.getPv()>0 && !erreur){
            tour++;

            if (tour%2==1){
                perso1.attaque(perso2);
            }
            else{
                perso2.attaque(perso1);
            }
            if (perso1 instanceof Magicien && perso2 instanceof Magicien){
                if (((Magicien) perso1).getPointMagie()<=2 || ((Magicien) perso2).getPointMagie()<=2){
                    erreur=true;
                }
            }
        }

        //Fin de la partie
        if (perso1.getPv()<=0){
            System.out.println("Le "+perso2.getNom()+" a gagné!");
        }
        else if (erreur){
            System.out.println("Match nul");
        }
        else{
            System.out.println("Le "+perso1.getNom()+" a gagné!");
        }
    }


    public static Personnage creerPerso() {

        boolean erreur = true;
        Scanner sc = new Scanner(System.in);
        int choix = 0;

        while (erreur) {
            System.out.println("Choisissez le type du premier combattant");
            System.out.println("1-Barbare");
            System.out.println("2-Paladin");
            System.out.println("3-Magicien Rouge");
            System.out.println("4-Magicien Noir");

            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    choix=0;
                    while (choix<1 || choix>4) {
                        System.out.println("Veuillez choisir une arme");
                        System.out.println("1-Masse");
                        System.out.println("2-Épée Lourde");
                        System.out.println("3-Sceptre");
                        System.out.println("4-Masamune");
                        choix=sc.nextInt();
                    }
                    switch (choix){
                        case 1:return new Barbare(new Masse());
                        case 2:return new Barbare(new EpeeLourde());
                        case 3:return new Barbare(new Sceptre());
                        case 4:return new Barbare(new Masamune());
                    }
                case 2:
                    choix=0;
                    while (choix<1 || choix>4) {
                        System.out.println("Veuillez choisir une arme");
                        System.out.println("1-Épée");
                        System.out.println("2-Épée lourde");
                        System.out.println("3-Épée magique");
                        System.out.println("4-Masamune");
                        choix=sc.nextInt();
                    }
                    switch (choix){
                        case 1: return new Paladin(new Epee());
                        case 2: return new Paladin(new EpeeLourde());
                        case 3: return new Paladin(new EpeeMagique());
                        case 4: return new Paladin(new Masamune());
                    }

                case 3:
                    choix=0;
                    while (choix<1 || choix>4) {
                        System.out.println("Veuillez choisir une arme");
                        System.out.println("1-Baguette");
                        System.out.println("2-Épée magique");
                        System.out.println("3-Sceptre");
                        System.out.println("4-Masamune");
                        choix=sc.nextInt();
                    }
                    switch (choix){
                        case 1: return new MagicienRouge(new Baguette());
                        case 2: return new MagicienRouge(new EpeeMagique());
                        case 3: return new MagicienRouge(new Sceptre());
                        case 4: return new MagicienRouge(new Masamune());
                    }

                case 4:
                    choix=0;
                    while (choix<1 || choix>4) {
                        System.out.println("Veuillez choisir une arme");
                        System.out.println("1-Baguette");
                        System.out.println("2-Épée magique");
                        System.out.println("3-Sceptre");
                        System.out.println("4-Masamune");
                        choix=sc.nextInt();
                    }
                    switch (choix){
                        case 1:return new MagicienNoir(new Baguette());
                        case 2:return new MagicienNoir(new EpeeMagique());
                        case 3:return new MagicienNoir(new Sceptre());
                        case 4:return new MagicienNoir(new Masamune());
                    }

                default:
                    System.out.println("Entrez un nombre valide");


            }

        }
        return null;
    }
}


