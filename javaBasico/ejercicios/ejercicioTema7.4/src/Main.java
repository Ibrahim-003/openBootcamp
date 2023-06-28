import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<String> nombres= new Vector<>();
        nombres.add("Pepe");
        nombres.add("Juan");
        nombres.add("Alonso");
        nombres.add("Sandra");
        nombres.add("Ariana");

        nombres.remove(1);
        nombres.remove(1);

        System.out.println(nombres);
    }
}