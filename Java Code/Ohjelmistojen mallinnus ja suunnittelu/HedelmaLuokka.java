public class HedelmaLuokka {

    private HedelmaLuokka() {

    }

    public static Hedelma luoHedelma(String type, String name, double kgprice) {

        Hedelma hedelma = null;

        if (type.equalsIgnoreCase("Banaani")) {
            hedelma = new Banaani();
        } else if (type.equalsIgnoreCase("Omena")) {
            hedelma = new Omena();
        }

        if (hedelma != null) {
            hedelma.setName(name);
            hedelma.setKgprice(kgprice);
        }
        return hedelma;
    }
}
