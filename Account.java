import java.util.Scanner;

public class Account {
    String type;
    Boolean savings;
    Integer id;
    Integer first_dep;
    Integer rate;

    //Create an account
    public void create_account(){
        Scanner scanner = new Scanner(System.in);
        //type
        System.out.println("Type du compte [Types possibles : courant, joint, épargne] :");
        String type = scanner.nextLine();
        this.savings = false;
        switch(type) {
            case "courant" :
                this.type = "courant";
                break;
            case "joint" :
                this.type = "joint";
                break;
            case "épargne" :
                this.type = "épargne";
                this.savings = true;
                break;
            default :
                System.err.println("Choississez un type de compte figurant dans la liste.");
                break;
        }
        //account number 
        System.out.println("Numéro du compte : ");
        Integer id = scanner.nextInt();
        this.id = id;

        //first deposit
        System.out.println("Première valeur créditée : ");
        Integer depos = scanner.nextInt();
        this.first_dep = depos;

        //savings rate
        if (this.savings) {
            System.out.println("Taux de placement (compte épargne) : ");
            Integer rate = scanner.nextInt();
            this.rate = rate;
        }
        
    }

    //Show data
    public void show_account(){
        System.out.println("Type du compte : " + this.type);
        System.out.println("Valeur courante : ");
        System.out.println("Taux de placement si compte épargne :");

    }
    public static void main (String [] args) {

        


        //Menu
        System.out.println("1. Créer un compte");
        System.err.println("2. Afficher un compte");
        System.err.println("3. Créer une ligne comptable");
        System.err.println("4. Sortir");
        System.err.println("5. De l'aide");
        
        Scanner scanner = new Scanner(System.in);
        Integer lu = scanner.nextInt();
        
        switch (lu) {
            case 1:
                Account.create_account();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            default:
                break;
        }
    }
}