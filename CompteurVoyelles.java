import java.util.Scanner;

public class CompteurVoyelles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String mot = scanner.nextLine().toLowerCase();

        int nombreVoyelles = 0;
        for (int i = 0; i < mot.length(); i++) {
            char lettre = mot.charAt(i);
            if (lettre == 'a' || lettre == 'e' || lettre == 'i' || lettre == 'o' || lettre == 'u' || lettre == 'y') {
                nombreVoyelles++;
            }
        }

        System.out.println("Nombre de voyelles dans le mot : " + nombreVoyelles);
        scanner.close();
    }
}
