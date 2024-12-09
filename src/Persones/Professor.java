package Persones;

public class Professor {
    private String alies; 
    private String correu; 
    private String departament; 
    private int numDespatx; 

    public Professor(String alies, String correu, String departament, int numDespatx) {
        this.alies = alies;
        this.correu = correu;
        this.departament = departament;
        this.numDespatx = numDespatx;
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

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public int getNumDespatx() {
        return numDespatx;
    }

    public void setNumDespatx(int numDespatx) {
        this.numDespatx = numDespatx;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "alies='" + alies + '\'' +
                ", correu='" + correu + '\'' +
                ", departament='" + departament + '\'' +
                ", numDespatx=" + numDespatx +
                '}';
    }
}
