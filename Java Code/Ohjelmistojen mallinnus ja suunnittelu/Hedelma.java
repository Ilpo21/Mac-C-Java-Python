public abstract class Hedelma {

    private String name;
    private double kgprice;
    private static int lkm;

    public Hedelma() {
        lkm++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKgprice() {
        return kgprice;
    }

    public void setKgprice(double kgprice) {
        this.kgprice = kgprice;
    }

    public static int getLkm() {
        return lkm;
    }

    public static void setLkm(int lkm) {
        Hedelma.lkm = lkm;
    }

    @Override
    public String toString() {
        return ("nimi:" + name + " " + "hinta:" + kgprice);
    }
    // "Hedelma [nimi=" + name +"", kilohinta="+kgprice]"

}
