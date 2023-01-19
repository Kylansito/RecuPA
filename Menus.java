public class Menus {
    private Plat[] plats;
    private int numMenus;// nombre de menús a confeccionar
    private static int PREU_MAXIM = 100000; // Preu màxim d’un plat
    private int preuMesGranActual;
    private int preuMesPetitActual;
    private static Plat[] omplePlats(int quants) {
        // retorna una taula d’objectes Plat amb tantes posicions
        // plenes com indica el paràmetre. Són els plats proposats pels chefs
    }
    public Menus(int quants, int menus) {
        plats = omplePlats(quants);
        numMenus = menus;
        // Completa Exercici 2
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
            // Les dades que cal entrar per teclat és el número de menús que s’han
            // de confeccionar i el nombre de plats proposats pels chefs

            System.out.println("Introdueix el nombre de menús que s'han de confeccionar: ");
            
            // Completa - Exercici 3
        }
    public ??? trobaMillor(???) {
        // Decideix què retorna el mètode i els paràmetres
        // Completa - Exercici 4
    }
    public String toString() {
        // Completa - Exercici 5
    }
    
        
}
    