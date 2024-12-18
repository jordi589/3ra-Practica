import java.util.Date;

public abstract class Accions {
    private String codi;
    private String titol;
    private Associacions associacioResponsable;

    public Accio(String codi, String titol, Associacions associacioResponsable) {
        this.codi = codi;
        this.titol = titol;
        this.associacioResponsable = associacioResponsable;
    }

    public String getCodi() {
        return codi;
    }

    public String getTitol() {
        return titol;
    }

    public Associacions getAssociacioResponsable() {
        return associacioResponsable;
    }

    public abstract String tipusAccio();
}

class Demostracio extends Accio {
    private Date dataDisseny;
    private boolean activa;
    private int comptadorOferiments;
    private double ccostMaterial;

    public Demostracio(String codi, String titol, Associacions associacioResponsable, Date dataDisseny, boolean activa, double costMaterial) {
        super(codi, titol, associacioResponsable);
        this.dataDisseny = dataDisseny;
        this.activa = activa;
        this.costMaterial = costMaterial;
        this.comptadorOferiments = 0;
    }

    public void incrementarOferiments() {
        comptadorOferiments++;
    }

    public boolean isActiva() {
        return activa;
    }

    public double getCostMaterial() {
        return costMaterial;
    }

    @Override
    public String tipusAccio() {
        return "Demostració";
    }
}

class Xerrada extends Accio {
    private Date data;
    private String[] membresImpartidors;
    private int assistents;
    private List<Integer> valoracions;

    public Xerrada(String codi, String titol, Associacions associacioResponsable, Date data, String[] membresImpartidors, int assistents) {
        super(codi, titol, associacioResponsable);
        this.data = data;
        this.membresImpartidors = membresImpartidors;
        this.assistents = assistents;
        this.valoracions = new ArrayList<>();
    }

    public void afegirValoracio(int valoracio) {
        if (valoracio >= 0 && valoracio <= 10) {
            valoracions.add(valoracio);
        }
    }

    public double getMitjanaValoracions() {
        return valoracions.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public String tipusAccio() {
        return "Xerrada";
    }
}
