public class Main {
    public static void main(String[] args) {
        int[][] numeros = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                String mensaje = String.format("El elemento de posicion [%d][%d] tiene el valor %d", i, j, numeros[i][j]);
                System.out.println(mensaje);
            }
        }
    }
}