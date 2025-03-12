import java.util.Scanner;

public class LigneComptable {
   Compte compte;
   Double montant;
   String date;
   String motif;
   String mode;


   public void creerLigneComptable(Scanner sc)
   {
        System.out.println("Somme à débiter (ou créditer) : ");
        this.montant = Double.parseDouble(sc.nextLine());
        System.out.println("Date de l'opération : ");
        this.date = sc.nextLine();
        System.out.println("Motif [Salire, Loyer, Alimentation, Divers] :");
        this.motif = sc.nextLine();
        System.out.println("Mode de paiement [CB, n° de Chèque, Virement] : ");
        this.mode = sc.nextLine();
   }
   
   public void afficherLigne()
   {
        System.out.println("Une opération de " + getMontant() +
                            " a été réalisée le " + getDate() +
                            " selon le motif " + getMotif() +
                            " par " + getMode());
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
