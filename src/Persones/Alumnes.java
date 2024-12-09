public class Alumnes {
    private String alies; 
    private String correu; 
    private String titulacio; 
    private int anysETSE; 
    private boolean graduat; 

    public Alumnes(String alies, String correu, String titulacio, int anysETSE, boolean graduat) {
        this.alies = alies;
        this.correu = correu;
        this.titulacio = titulacio;
        this.anysETSE = anysETSE;
        this.graduat = graduat;
    }

    public String getAlies() {
        return alies;
    }

    public void setAlies(String alies) {
        this.alies = alies;
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

    public void setTitulacio(String titulacio) {
        this.titulacio = titulacio;
    }

    public int getAnysETSE() {
        return anysETSE;
    }

    public void setAnysETSE(int anysETSE) {
        this.anysETSE = anysETSE;
    }

    public boolean esGraduat() {
        return graduat;
    }

    public void setGraduat(boolean graduat) {
        this.graduat = graduat;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "alies='" + alies + '\'' +
                ", correu='" + correu + '\'' +
                ", titulacio='" + titulacio + '\'' +
                ", anysETSE=" + anysETSE +
                ", graduat=" + graduat +
                '}';
    }
    public boolean marcarGraduat(Alumnes alumne) {
        if (!alumne.esGraduat()) {
            alumne.setGraduat(true);
            return true;
        }
        return false;
    }

    public boolean afegirMembre(Alumnes alumne) {
        // Mirar si  ja va ser donat de baixa
        if (alumne.getDataBaixa() != null) {
            return false;
        }
        return true;
    }
    

}