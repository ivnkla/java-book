//import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

public class Projet {
    public static Integer menuPrincipal(Scanner sc)
    {
        System.out.println("Quelle action désirez vous effectuer ? (5 pour obtenir l'aide)");
        Integer lu = sc.nextInt();
        sc.nextLine();
        return lu;
    }

    public static void sortir()
    {
        System.out.println("Au revoir !");
        System.exit(0);
    }

    public static void alAide()
    {
        System.out.println("1. Créer un compte");
        System.err.println("2. Afficher un compte");
        System.err.println("3. Créer une ligne comptable");
        System.err.println("4. Sortir");
        System.err.println("5. De l'aide");
        System.out.println();
    }
    public static void main (String [] args) {
        //Map<Integer, Projet> accounts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Compte c = new Compte();

        while(true) {
            Integer option = Projet.menuPrincipal(scanner);
            switch (option) {
                case 1:
                    c.creerCpte(scanner);
                    break;
                case 2:
                    c.afficherCpte();
                    break;
                case 3:
                    c.creerLigne(scanner);
                    break;
                case 4:
                    sortir();
                    break;
                case 5:
                    alAide();
                    break;
                default:
                    System.out.println("Veuillez choisir une option valide");
                    break;
            }
        }
    }
}
