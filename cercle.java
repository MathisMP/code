import java.util.Scanner;

public class Cercle {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Veuillez entrer le rayon du cercle :");
            int rayon = scanner.nextInt();

            dessinerCercle(rayon);
        }
    }

    public static void dessinerCercle(int rayon) {
        for (int i = -rayon; i <= rayon; i++) {
            for (int j = -rayon; j <= rayon; j++) {
                if (i * i + j * j <= rayon * rayon) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
    }
}
