public class Employe extends Personne {
    private String fonction;
    private int salaire;


    public Employe() {}

    public Employe(String fonction, int salaire) {
        this.fonction = fonction;
        this.salaire = salaire;
    }


    public String getFonction() {
        return fonction;
    }

    public int getSalaire() {
        return salaire;
    }


    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}
