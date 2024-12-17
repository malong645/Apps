public class Test {
    public static void main(String[] args) {

        Personne personne = new Personne("Dodo", "nure");
        System.out.println("Personne: " + personne.getNom() + " " + personne.getPrenom());


        Employe employe = new Employe("Agent marketing", 70000);
        employe.setNom("mitho");
        employe.setPrenom("roune");
        System.out.println("Employé: " + employe.getNom() + " " + employe.getPrenom() + ", Fonction: " + employe.getFonction() + ", Salaire: " + employe.getSalaire());


        Etudiant etudiant = new Etudiant(3.75);
        etudiant.setNom("Brown");
        etudiant.setPrenom("Chris");
        etudiant.setMatricule(etudiant.generateMatricule());
        System.out.println("Étudiant: " + etudiant.getNom() + " " + etudiant.getPrenom() + ", Matricule: " + etudiant.getMatricule() + ", Moyenne: " + etudiant.getMoyenne());
    }
}
