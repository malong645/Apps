import java.util.Scanner;

public class ProduitImpl implements IProduit {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Produit saisie() {
        System.out.print("Entrez la référence : ");
        String ref = scanner.nextLine();

        System.out.print("Entrez le libellé : ");
        String libelle = scanner.nextLine();

        System.out.print("Entrez la quantité : ");
        double quantite = scanner.nextDouble();

        System.out.print("Entrez le prix : ");
        int prix = scanner.nextInt();

        return new Produit(ref, libelle, quantite, prix);
    }

    @Override
    public void affichage(Produit produit) {
        System.out.println("Référence : " + produit.getRef());
        System.out.println("Libellé : " + produit.getLibelle());
        System.out.println("Quantité : " + produit.getQuantite());
        System.out.println("Prix : " + produit.getPrix());
    }
}
