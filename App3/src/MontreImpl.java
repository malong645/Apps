import java.util.Scanner;

public class MontreImpl implements IMontre {
    private Scanner scanner = new Scanner(System.in);


    public Montre saisie() {
        System.out.print("Entrez l'ID : ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Entrez le libellé : ");
        String lib = scanner.nextLine();

        System.out.print("Entrez la nature : ");
        String nature = scanner.nextLine();

        return new Montre(id, lib, nature);
    }


    public void affichage(Montre m) {
        System.out.println("ID : " + m.getId());
        System.out.println("Libellé : " + m.getLib());
        System.out.println("Nature : " + m.getNature());
    }
}
