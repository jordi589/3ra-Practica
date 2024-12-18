public class Main {
    public static void main(String[] args) throws Exception {
        





        int opcio;
        do {
            System.out.println("\nMenú d'opcions:");
            System.out.println("1. Mostrar les dades de la llista d’associacions");
            System.out.println("2. Mostrar les dades de la llista de membres que formen part d’una associació, afegint filtre per a professors, alumnes o ambdós.");
            System.out.println("3. Mostrar les dades de la llista de membres actius, que formen part de qualsevol associació, afegint filtre per a professors, alumnes o ambdós.");
            System.out.println("4. Mostrar les dades de la llista d’accions, afegint filtre o no per tipus d’acció.");
            System.out.println("5. Obtenir i mostrar la llista d’accions que ofereix una associació concreta.");
            System.out.println("6. Medaller d'un país");
            System.out.println("7. Afegir una nova associació.");
            System.out.println("8. Alta d’un membre a una associació. Es pot donar el cas que el membre sigui nou, i s’haurà d’introduir tota la informació del membre, o que el membre ja participi en una altra associació i en aquest cas serà afegir la relació corresponent.");
            System.out.println("9. Afegir una nova xerrada");
            System.out.println("10. Afegir una nova demostració.");
            System.out.println("11. Consultar i mostrar les dades de les demostracions que es consideren no actives. Calcular el cost econòmic total que va suposar preparar totes aquestes demostracions.");
            System.out.println("12. Calcular la persona més activa, és a dir, la que participa en més associacions. En cas d’empat es considera la que e té més antiguitat (en qualsevol associació). Si encara hi ha empat, s’escull de les persones que compleixen els requisits.");
            System.out.println("13. Consultar i mostrar les dades de les xerrades que ha tingut més d’un cert nombre indicat d’assistents.");
            System.out.println("14. Valorar una xerrada per part d’un assistent.");
            System.out.println("15. Consultar i mostrar la xerrada que està millor valorada (que serà la que té la mitjana de valoracions més alta), en cas d’empat en la nota, considerar la que ha tingut més valoracions i en cas d’empat agafar qualsevol.");
            System.out.println("16. Mostrar les dades de les xerrades que farà una persona concreta.");
            System.out.println("17. Donar de baixa les demostracions que no estiguin actives i que es van dissenyar abans d’una certa data");
            System.out.println("18. Sortir de l’aplicació.");
            opcio = Integer.parseInt(teclat.nextLine());

        switch (opcio) {
            case 1:
            for (int i = 0; i < LlistaAssociacions.getNumAssociacions; i++) {
                System.out.println(LlistaAssociacions.medallesProva("", "", 0).toString());
            }
            break;

    }
}
