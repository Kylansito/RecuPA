public class Plat {
    public static final int POSTRES = 1;
    public static final int PRIMER = 2;
    public static final int SEGON = 3;
    private int identificador; // identificador del plat
    private int tipus; // ha de ser un dels atributs estàtics previs
    private boolean peix;
    private boolean carn;
    /*
    * els dos atributs previs són excloents. Si no és una postres un ha de
    * tenir un valor de fals i altre true. Les postres tenen ambdós atributs a
    * fals
    */
    private int preu; // preu del plat
    public Plat(int iden, int tipus, boolean peix, int preu) {
        this.identificador = iden;
        this.preu = preu;
        this.tipus = tipus;
        if (tipus != POSTRES) {
            this.carn = !peix;
            this.peix = peix;
        } else {
            this.carn = false;
            this.peix = false;
        }
    }
    public int getIdentificador() {
        return identificador;
    }
    public boolean isPeix() {
        return peix;
    }
    public boolean isCarn() {
        return carn;
    }
    public int getPreu() {
        return preu;
    }
    public int getTipus() {
        return tipus;
    }
}
