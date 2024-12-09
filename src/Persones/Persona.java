public class Persona {
    private String alies;
    private String correu;
    private Data dataAlta;
    private Data dataBaixa;
    private LlistaAssociacions associacions;

    public Persona(String alies, String correu) {
        this.alies = alies;
        this.correu = correu;
        this.associacions = new LlistaAssociacions();
      
    }

    public String getAlies() {
        return alies;
    }

    public String getCorreu() {
        return correu;
    }

    public Data getDataAlta() {
        return dataAlta;
    }

    public Data getDataBaixa() {
        return dataBaixa;
    }

    public LlistaAssociacions getAssociacions() {
        return associacions;
    }
}
