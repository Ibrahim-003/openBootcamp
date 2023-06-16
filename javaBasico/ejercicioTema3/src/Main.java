
public class Main {
    public static void main(String[] args) {
        String[] items = {"Puerta", "Ventana", "Mostrador", "Cocina"};
        String cadena = "";

        for (int i = 0; i < items.length; i++) {
            cadena += items[i] + "/";
        }

        System.out.println(cadena);

    }
}