import Persones.Persona;

public class Associacio {
    
    private String nom; 
    private String correu;
    private String titulacio; // Inicials de la titulacio
    private LlistaPersones persones; 
    private LlistaAccions accions; 

    public Associacio(String nom, String correuContacte) {
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

    public void afegirPersona(Persona persona) {
        this.persones.afegirPersona(persona); 
        if (persona instanceof Alumne) {
            Alumne alumne = (Alumne) persona;
            titulacions.add(alumne.getTitulacio());
        }
    }

    public void assignarCarrec(String tipus, Alumne alumne) {
        if (tipus.equalsIgnoreCase("president") || tipus.equalsIgnoreCase("secretari") || tipus.equalsIgnoreCase("tresorer")) {
            carrecs.put(tipus.toLowerCase(), alumne);
        } else {
            throw new IllegalArgumentException("El càrrec només pot ser president, secretari o tresorer.");
        }
    }

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
