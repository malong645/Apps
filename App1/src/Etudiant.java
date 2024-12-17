public class Etudiant extends Personne {
    private String matricule;
    private double moyenne;


    public Etudiant() {}

    public Etudiant(double moyenne) {
        this.moyenne = moyenne;
    }


    public String getMatricule() {
        return matricule;
    }

    public double getMoyenne() {
        return moyenne;
    }


    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }


    public String generateMatricule() {

        return "MATRICULE123";
    }
}
