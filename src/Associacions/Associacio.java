package Associacions;

public class Associacio {
    
    private String nom; 
    private String correu;
    private String titulacio; // Inicials de la titulacio
    private LlistaMembres membres; 
    private LlistaAccions accions; 

    public Associacio(String nom, String correuContacte) {
        this.nom = nom;
        this.correu = correu;
        this.titulacio =  titulacio;
        this.membres = new LlistaMembres();
        this.accions = new LlistaAccions();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }

    public String getTitulacio() {
        return titulacio;
    }

    public LlistaMembres getMembres() {
        return membres;
    }

    public LlistaAccions getAccions() {
        return accions;
    }

    public void afegirMembre(Membre membre) {
        membres.afegirMembre(membre);
        if (membre instanceof Alumne) {
            afegirTitulacio(((Alumne) membre).getTitulacio());
        }
    } // mho ha fet el chat 

    @Override
    public String toString() {
        return "Associacio{" +
                "nom='" + nom + '\'' +
                ", correuContacte='" + correuContacte + '\'' +
                ", titulacions=" + titulacions +
                ", membres=" + membres +
                ", accions=" + accions +
                '}';
    }
}
