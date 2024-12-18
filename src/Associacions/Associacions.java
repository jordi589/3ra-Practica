import Persones.Persona;

public class Associacions {
    
    private String nom; 
    private String correu;
    private String titulacio; // Inicials de la titulacio
    private int numMembres;
    private LlistaPersones persones; 
    private LlistaAccions accions; 
    private Alumnes president;
    private Alumnes secretari;
    private Alumnes tresorer;

    public Associacions(String nom, String correu, String titulacio) {
        this.nom = nom;
        this.correu = correu;
        this.titulacio =  titulacio;
        this.persones = new LlistaPersones();
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

    public LlistaPersones getPersones() {
        return persones;
    }

    public LlistaAccions getAccions() {
        return accions;
    }


public void assignarCarrec(String tipus, Alumne alumne) { //*ficar condicio si alumne està activo */
    if (tipus  == "president") {
        president = alumne; 
        System.out.println("President assignat correctament.");
    } else if (tipus  == "secretari") {
        secretari = alumne; 
        System.out.println("Secretari assignat correctament.");
    } else if (tipus  == "tresorer") {
        tresorer = alumne;
        System.out.println("Tresorer assignat correctament.");
    } else {
        System.out.println("Error: Els càrrecs només poden ser president, secretari o tresorer.");
    }
}

    @Override
    public String toString() {
        return "Associacio{" +
                "nom='" + nom + '\'' +
                ", correuContacte='" + correuContacte + '\'' +
                ", titulacions=" + titulacions +
                ", membres=" + numMembres +
                ", accions=" + accions +
                '}';
    }
}
