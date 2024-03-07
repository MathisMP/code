//Importation du scanner pour la lecture des entrées utilisateurs

import java.util.Scanner;

public class SommeImpairs {
    public static void main (String[] args){
        //Création d'un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner (System.in);

        //Affichage d'une invite à l'utilisateur
        System.out.println("Entrez un nombre: ");

        //Lecture de l'entrée utilisateur
        int nombre = scanner.nextInt();

        //Appel de la fonction calculerSommeImpairs et stockage du résultat dans une variable
        int somme = calculerSommeImpairs(nombre);

        //Affichage du résultat
        System.out.println("La somme des nombres impairs jusqu'à" +nombre + "est" +somme);

        //Fermeture du scanner
        scanner.close(); 
    }

public static int calculerSommeImpairs(int max) {
    int somme = 0;

    //Boucle pour parcourir tous les nombres de 1 à max
    for (int i= 1; i <= max; i++) {
        System.out.println("i= " + i)
        //Vérification si le nombre est impair
        if(i % 2!= 0) {
            //Ajout du nombre impair à la somme
            somme += i;
            System.out.println("somme=" +somme);
        }
    }

    //Retourne la somme calculée
    return somme;
    }
}