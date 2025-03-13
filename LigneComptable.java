import java.util.Scanner;

public class LigneComptable {
   private Double montant;
   private String date;
   private String motif;
   private String mode;


   public void creerLigneComptable()
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Somme à débiter (ou créditer) : ");
     this.montant = Double.parseDouble(sc.nextLine());
     System.out.println("Date de l'opération : ");
     this.date = sc.nextLine();
     System.out.println("Motif [Salire, Loyer, Alimentation, Divers] :");
     this.motif = sc.nextLine();
     this.mode = controleMode();
   }
   
   public void afficherLigne()
   {
        System.out.println("Une opération de " + getMontant() +
                            " a été réalisée le " + getDate() +
                            " selon le motif " + getMotif() +
                            " par " + getMode());
   }

   private String controleMode()
     {
     char tmpm;
     String tmpS = "Carte bancaire";
     Scanner sc = new Scanner(System.in);
     do {
          System.out.println("Mode de paiement [C(arte bancaire), N(° de chèque), V(irement)] : ");
          tmpm = sc.next().charAt(0);
     } while (tmpm!='C' && tmpm!='J' && tmpm!='E');
     switch(tmpm)
     {
          case 'C':
               tmpS = "Carte bancaire";
               break;
          case 'N':
               String tmpN;
               do 
               {
                    System.out.println("Saisissez le n° de chèque : ");
                    tmpN = sc.nextLine();
               } while (!(Integer.parseInt(tmpS) instanceof Integer));
               tmpS = tmpN;
               break;
          case 'V':
               tmpS = "Virement";
               break;
     }
     return tmpS;
     }

   public Double getMontant()
   {
        return this.montant;
   }

   public String getDate()
   {
        return this.date;
   }

   public String getMotif()
   {
    return this.motif;
   }

   public String getMode()
   {
        return this.mode;
   }
}
