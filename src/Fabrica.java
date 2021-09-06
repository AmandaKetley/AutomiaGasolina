public class Fabrica {

    public static Gol1000 getGol1000() {
        return new Gol1000();
    }

    public static Gol1600 getGol1600() {
        return new Gol1600();
    }

    public static JettaComfortline2000 getJettaComfortline2000() {
        return new JettaComfortline2000();
    }
}