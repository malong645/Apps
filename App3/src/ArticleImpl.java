import java.util.Scanner;

public class ArticleImpl implements IArticle {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Article saisie() {
        System.out.print("Entrez l'ID : ");
        int id = scanner.nextInt();

        scanner.nextLine(); // Consommer le reste de la ligne

        System.out.print("Entrez le libellé : ");
        String lib = scanner.nextLine();

        return new Article(id, lib);
    }

    @Override
    public void affichage(Article a) {
        System.out.println("ID : " + a.getId());
        System.out.println("Libellé : " + a.getLib());
    }
}
