public class Test {
    public static void main(String[] args) {
        IProduit produitImpl = new ProduitImpl();


        Produit produit = produitImpl.saisie();


        produitImpl.affichage(produit);
    }
}
