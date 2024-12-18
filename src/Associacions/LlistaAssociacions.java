public class LlistaAssociacions {
    private Associacions [] llista;
    private int numAssociacions;             //*afegir el to string pel case 1 */

    public LlistaAssociacions() {
        llista = new Associacions[1000]; // Capacitat inicial
        numAssociacions = 0;
    }

    public int getNumAssociacions(){
        return numAssociacions;
    }

    public void setNumAssociacions(int numAssociacions){
        this.numAssociacions = numAssociacions;
    }

    public void afegirAssociacio(Associacions associacio){
        if (numAssociacions >= llista.length) {
            System.out.println("Error: No es poden afegir més associacions. Capacitat màxima assolida.");
        }
        else{
            llista[numAssociacions] = associacio;
            numAssociacions++;
        }
    }
    public Associacions obtenirAssociacio(int posicio) {
        if (posicio >= 0 && posicio < numAssociacions) {
            Associacions associacio = llista[posicio];
            return associacio;
        } else {
            System.out.println("Error: Índex fora de rang.");
            return null;
        }
    }

}

