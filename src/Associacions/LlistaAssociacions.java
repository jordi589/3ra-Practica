public class LlistaAssociacions {
    private String[] elements;
    private int mida;

    public LlistaAssociacions() {
        this.elements = new String[3]; // Màxim es pot apuntar a 3 associacions
        this.mida = 0;
    }

    public boolean afegir(String element) {
        if (mida < elements.length && !trobat(element)) {
            elements[mida++] = element;
            return true;
        }
        return false;
    }
    public boolean trobat(String element) {
        for (int i = 0; i < mida; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int mida() {
        return mida;
    }
}

