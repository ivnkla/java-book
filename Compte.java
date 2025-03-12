import java.util.Scanner;

public class Compte {
    String num;
    String type;
    double taux;
    double val;
    LigneComptable ligne;

    public void afficherCpte() 
    {
        System.out.print("Le compte n° : " + num + " est un compte");
        if (type.equals("C")) System.out.println(" courant ");
        else if (type.equals("J")) System.out.println(" joint ");
        else if (type.equals("E")) 
        {
            System.out.println(" epargne dont le taux est " + taux);
        }
        System.out.println("Valeur initiale : " + val);
        if (ligne != null) ligne.afficherLigne();
    }

    public void creerCpte(Scanner sc)
    {
        System.out.println("Numéro de compte : ? ");
        this.num = sc.nextLine();
        System.out.println("Type de compte (C/J/E) ? : ");
        this.type = sc.nextLine();
        if (type.equals("E")) 
        {
            System.out.println("Taux du compte E : ");
            this.taux = Double.parseDouble(sc.nextLine());
        }
        System.out.println("Montant du premier dépôt : ");
        this.val = Double.parseDouble(sc.nextLine());
    }

    public void creerLigne(Scanner sc)
    {
        ligne = new LigneComptable();
        ligne.creerLigneComptable(sc);
        this.val = this.val - ligne.getMontant();

    }

    public String getNum() {
        return this.num;
    }
}
