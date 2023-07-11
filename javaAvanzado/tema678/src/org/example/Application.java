package org.example;

public class Application {
    private static Application instance;
    boolean isRunning = false;

    private Application() {}

    public static Application getInstance() {
        if (instance == null) {
            instance = new Application();
        }

        return instance;
    }

    public void run() {
        if (!isRunning) {
            System.out.println("Arrancando!");
            isRunning = true;
        } else {
            System.out.println("Ya estaba en ejecucion");
        }
    }
}
