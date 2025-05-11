package SimpleFactory;

public class ProgramJucarie {
    public static void main(String[] args) {
        JucarieFactory jucarieFactory = new JucarieFactory();
        IJucarie jucarie = null;
        try {
            jucarie = jucarieFactory.creareJucarie(ETipJucarie.URSULET);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (jucarie != null) {
            jucarie.afisareDescriere();
        }
    }
}