import java.util.Scanner;

public class ChemiseImpl implements IChemise {
    private Scanner scanner = new Scanner(System.in);


    public Chemise saisie() {
        System.out.print("Entrez l'ID : ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Entrez le libellé : ");
        String lib = scanner.nextLine();

        System.out.print("Entrez la couture : ");
        String couture = scanner.nextLine();

        return new Chemise(id, lib, couture);
    }


    public void affichage(Chemise c) {
        System.out.println("ID : " + c.getId());
        System.out.println("Libellé : " + c.getLib());
        System.out.println("Couture : " + c.getCouture());
    }
}
