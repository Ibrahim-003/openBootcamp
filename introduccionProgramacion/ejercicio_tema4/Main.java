package introduccionProgramacion.ejercicio_tema4;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        // Usando un if, crear una condición que compare si la variable numeroIf es
        // positivo, negativo, o 0.
        int numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("El valor de la variable es positiva.");
        } else if (numeroIf == 0) {
            System.out.println("El valor de la variable es igual a 0.");
        } else {
            System.out.println("El valor de la variable es negativa.");
        }

        // Crea un bucle While, este bucle tendrá que tener como condición que la
        // variable numeroWhile sea inferior a 3, el bloque de código que tendrá el
        // bucle deberá:
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile += 1;
        }

        // Para el bucle Do While, deberás crear la misma estructura que en el While,
        // pero solo se debe ejecutar una vez.
        int numDoWhile = 3;
        do {
            System.out.println(numDoWhile);
            numDoWhile += 1;
        } while (numDoWhile < 3);

    
        // Para el bucle For, crea una variable numeroFor, esta variable tendrá como
        // valor 0 y su condición será que la variable sea igual o menor que 3, se irá
        // incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por
        // pantalla.
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // Por último, para el Switch, deberás crear la variable estacion, y distintos
        // case para las cuatro estaciones del año. Dependiendo del valor de la variable
        // estacion se deberá mandar un mensaje por consola informando de la estación en
        // la que está. También habrá que poner un default para cuando el valor de la
        // variable no sea una estación.
        String estacion = "INVIERNO";
        switch (estacion) {
            case "PRIMAVERA":
                System.out.println("La estacion del año es primavera");
                break;
            case "VERANO":
                System.out.println("La estacion del año es verano");
                break;
            case "OTOÑO":
                System.out.println("La estacion del año es otoño");
                break;
            case "INVIERNO":
                System.out.println("La estacion del año es invierno");
                break;
            default:
                System.out.println("El valor de la variable no corresponde a las estaciones del año");
                break;
        }

    }
}