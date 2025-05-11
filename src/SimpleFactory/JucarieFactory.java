package SimpleFactory;

public class JucarieFactory {
    public IJucarie creareJucarie(ETipJucarie tipJucarie) throws Exception {
        switch (tipJucarie) {
            case URSULET:
                return new UrsuletPlus();
            case MASINUTA:
                return new Masinuta();
            default:
                throw new Exception("Tip de jucarie necunoscut!");
        }
    }
}