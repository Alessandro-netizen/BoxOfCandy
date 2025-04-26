public class Candy {
    private String flavor;

    public Candy(String f) {
        flavor = f;
    }

    @Override
    public String toString() {
        return flavor;
    }

    public String getFlavor() {
        return flavor;
    }
}
