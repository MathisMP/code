// Classe abstraite
abstract class Animal {
//méthode abstraire (n'a pas de corps)
public abstract void son();
// méthode standard
public void sleep() {
    System.out.println("Zzz");
}
}

// sous classe (hérite de animal)
/**
 * cochon
 */
class Cochon extends Animal {
    public void son() {
        // le corps de son() est fourni ici
        System.out.println ("Le cochon dit: wee wee");
    }
    
}

public class MyMainClass {
    public static void main (String[] args) {
        Cochon monCochon = new Cochon(); //crée un objet Cochon
        monCochon.son();
        monCochon.sleep();
    }
    
}
