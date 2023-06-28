public class Main {
    public static void main(String[] args) {

        // Haciendo uso del metodo reverse() el cual invierte una cadena de texto
        String cadenaInvertida = reverse("Hola mundo");
        System.out.println(cadenaInvertida);


    }

    public static String reverse(String texto) {
        char[] arrayCadena = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            arrayCadena[i] = texto.charAt(texto.length() - 1 - i);
        }

        return new String(arrayCadena);
    }
}