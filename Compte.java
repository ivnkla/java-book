import java.util.Scanner;

public class Compte {
    private String num;
    private String type;
    private double taux;
    private double val;
    private LigneComptable ligne;

    public void afficherCpte() 
    {
        System.out.print("Le compte n° : " + getNum() + " est un compte");
        if (getType().equals("Courant")) System.out.println(" courant ");
        else if (getType().equals("Joint")) System.out.println(" joint ");
        else if (getType().equals("Epargne")) 
        {
            System.out.println(" epargne dont le taux est " + getTaux());
        }
        System.out.println("Valeur initiale : " + getVal());
        if (ligne != null) ligne.afficherLigne();
    }

    public void creerCpte()
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Numéro de compte : ? ");
        this.num = sc.nextLine();
        this.type = controleType();
        if (getType().equals("E")) 
        {
            System.out.println("Taux du compte E : ");
            this.taux = Double.parseDouble(sc.nextLine());
        }
        this.val = controleValinit();
    }

    public void creerLigne()
    {
        ligne = new LigneComptable();
        ligne.creerLigneComptable();
        this.val = this.val - ligne.getMontant();

    }

    private String controleType()
    {
        char tmpc;
        String tmpS = "Courant";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Type du compte [ C(ourant), J(oint), E(pargne) ] : ");
            tmpc = sc.next().charAt(0);
        } while (tmpc!='C' && tmpc!='J' && tmpc!='E');
        switch(tmpc)
        {
            case 'C':
                tmpS = "Courant";
                break;
            case 'J':
                tmpS = "Joint";
                break;
            case 'E':
                tmpS = "Epargne";
                break;
        }
        return tmpS;
    }

    private Double controleValinit()
    {
        Scanner sc = new Scanner(System.in);
        Double tmpm;
        do 
        {
            System.out.println("Montant (positif) du dépôt : ");
            tmpm = sc.nextDouble();
        } while (tmpm < 0);
        return tmpm;
    }

    public String getNum() {
        return this.num;
    }
    
    public String getType()
    {
        return this.type;
    }

    public Double getTaux()
    {
        return this.taux;
    }

    public Double getVal()
    {
        return this.val;
    }


}
