public class Test {
    public static void main(String[] args) {

        IArticle articleImpl = new ArticleImpl();
        Article article = articleImpl.saisie();
        articleImpl.affichage(article);


        IChemise chemiseImpl = new ChemiseImpl();
        Chemise chemise = chemiseImpl.saisie();
        chemiseImpl.affichage(chemise);


        IMontre montreImpl = new MontreImpl();
        Montre montre = montreImpl.saisie();
        montreImpl.affichage(montre);
    }
}
