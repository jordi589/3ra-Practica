public class Data {
    private int dia, mes, any;

    public Data (int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + any;
    }
}

