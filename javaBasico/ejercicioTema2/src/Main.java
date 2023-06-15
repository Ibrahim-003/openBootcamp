import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio;
        String precioIVA;

        System.out.println("Porfavor ingrese el precio.");
        precio = scanner.nextDouble();

        precioIVA = getValue(precio);

        System.out.println(precioIVA);
    }

    static String getValue(double precio) {
        double operation = precio * 21 / 100;
        String result = "El nuevo precio con el IVA incluido es " + operation;

        return result ;
    }
}