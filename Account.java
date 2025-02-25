import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Account {
    Integer id;
    String type;
    Boolean savings;
    Integer first_dep;
    Integer rate;

    private void create(Scanner scanner){
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

    private void display() {
        System.out.println("id : " + this.id);
        System.out.println("type : " + this.type);
        if (this.savings == true) {
            System.out.println("taux : " + this.rate);
        }
        System.out.println("premier dépoôt : " + this.first_dep);
    }

    public static void main (String [] args) {

        Map<Integer, Account> accounts = new HashMap<>();

        
        Scanner scanner = new Scanner(System.in);
        Integer lu;
        
        //Menu
        while(true) {
            System.out.println("1. Créer un compte");
            System.err.println("2. Afficher un compte");
            System.err.println("3. Créer une ligne comptable");
            System.err.println("4. Sortir");
            System.err.println("5. De l'aide");

            lu = scanner.nextInt();
            scanner.nextLine();

            switch (lu) {
                case 1:
                    Account account = new Account();
                    account.create(scanner);
                    accounts.put(account.id, account);
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Saisissez un numéro de compte");
                    Integer id = scanner.nextInt();
                    if (accounts.containsKey(id)){
                        accounts.get(id).display();
                    } else {
                        System.out.println("Numéro de compte invalide");
                    }
                    break;
                case 3:

                    break;
                case 4:
                    return;
                case 5:

                    break;
                default:
                    System.out.println("Veuillez choisir une option valide");
                    break;
            }
        }
    }
}
