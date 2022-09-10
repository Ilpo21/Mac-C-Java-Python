
public class Main {
    public static void main(String[] args) {

        Hedelma hed1 = HedelmaLuokka.luoHedelma("Omena", "Green Day", 2.38);

        Hedelma hed2 = HedelmaLuokka.luoHedelma("Omena", "Red Delicious", 1.38);

        Hedelma hed3 = HedelmaLuokka.luoHedelma("Banaani", "Banane", 0.87);

        Hedelma hed4 = HedelmaLuokka.luoHedelma("Paaryna", "paaryna1", 4.20);

        Hedelma hed5 = HedelmaLuokka.luoHedelma("Pomelo", "pomelo1", 2.40);
        System.out.println(hed1);
        System.out.println(hed2);
        System.out.println(hed3);
        System.out.println(hed4);
        System.out.println(hed5);

        System.out.println(Hedelma.getLkm());
        // System.out.println(hed1.getLkm()); ei oikea tapa

        // Hedelma hed1 = new Hedelma() {
        // };
        // hed1.setName("omena");
        // hed1.setKgprice(2.37);

        // Omena omena1 = new Omena();
        // omena1.setName("Red delicious");
        // omena1.setKgprice(1.37);

        // Hedelma banaani1 = new Banaani();
        // banaani1.setName("Bananer");
        // banaani1.setKgprice(2.22);

        // System.out.println(omena1);
        // System.out.println(banaani1);
    }

}
