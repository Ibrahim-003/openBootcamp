import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = dividePorCero(10, 0);
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de codigo");
        }
    }

    public static int dividePorCero(int dividendo, int divisor) throws ArithmeticException, IOException {
        int result = 0;

        try {
            result = dividendo / divisor;
        }catch (ArithmeticException e) {
            throw new IOException();
        }

        return result;
    }
}