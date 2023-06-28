import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStream fichero = null;
        PrintStream nuevoFichero = null;

        try {
            fichero = new FileInputStream("base.txt");
            nuevoFichero = new PrintStream("destino.txt");
            makeCopy(fichero, nuevoFichero);
        }catch(Exception e) {
            System.out.println("A ocurrido un error con el archivo! " + e.getMessage());
        }

    }

    public static void makeCopy(InputStream fichero, PrintStream nuevoFichero) throws IOException {

        BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = ficheroBuffer.read(buffer)) != -1) {
            nuevoFichero.write(buffer, 0, bytesRead);
        }
        System.out.println("La copia del fichero se ha completado.");

    }
}