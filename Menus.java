import Keyboard.*;
public class Menus {
    private Plat[] plats;
    private int numMenus;// nombre de menús a confeccionar
    private static int PREU_MAXIM = 100000; // Preu màxim d’un plat
    private int preuMesGranActual = PREU_MAXIM + 1;
    private int preuMesPetitActual = -1;
    private Plats3[] best;
    private Plats3[] current;
    private int[] marcatge;
    private int millorDiferencia = PREU_MAXIM + 1;

    private static Plat[] omplePlats(int quants) {
        // retorna una taula d’objectes Plat amb tantes posicions
        // plenes com indica el paràmetre. Són els plats proposats pels chefs
    }
    public Menus(int quants, int menus) {
        plats = omplePlats(quants);
        numMenus = menus;
        best = new Plats3[quants];
        current = new Plats3[quants];
        iniMarc();
    }

    private void iniMarc(){
        this.marcatge = new int[plats.length];
        for(int i = 0; i < plats.length; i++){
            if(plats[i].isPeix()){
                marcatge[i] = 2; 
            }else if(plats[i].isCarn()){
                marcatge[i] = 1;
            }else{
                marcatge[i] = 3;
            }
        }
    }

    private class Plats3 {
        private Plat primer;
        private Plat segon;
        private Plat postres;
        private int preu;
        public Plats3() {
            preu = 0;
            primer = null;
            segon = null;
            postres = null;
        }

        public String toString() {
            return "Primer plat " + primer.getIdentificador() + " segon plat " + segon.getIdentificador() + " + postres "+ postres.getIdentificador() + "amb un preu de " + preu;
        }
    }
        
    public static void main(String[] args) {

            System.out.println("Introdueix el nombre de menús que s'han de confeccionar: ");
            int nMenus = Keyboard.readInt();
            
            System.out.println("Introdueix el nombre de plats que proposa el xef: ");
            int nPlats = Keyboard.readInt();

            Menus men = new Menus(nPlats, nMenus);
            //men.trobaMillor(0);

            System.out.print(men);
        }
    public ??? trobaMillor(???) {
        // Decideix què retorna el mètode i els paràmetres
        // Completa - Exercici 4
    }
    public String toString() {
        String str = "";
        for(int i = 0; i < this.best.length; i++){
            str += ("Al menu " + (i + 1) + " hi ha els plats: " + best[i].toString() + "\n");
        }
        str += ("Hi ha una diferencia de " + this.millorDiferencia + " €");

        return str;
    }
    
        
}
    