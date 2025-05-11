package SimpleFactory;

public class Masinuta implements IJucarie {
    @Override
    public void afisareDescriere() {
        System.out.println("Masinuta: jucarie din plastic cu roti mobile.");
    }
}
