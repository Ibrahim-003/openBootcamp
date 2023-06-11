package introduccionProgramacion.ejercicio_tema9;

public class Main {
    public static void main(String[] args) {

        // CLASE CLIENTE
        Cliente cliente = new Cliente(20, "Ibrahim", 933948382, 10000);

        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        // CLASE TRABAJADOR
        Trabajador trabajador = new Trabajador(22, "Waldemar", 984734923, 3000);

        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);

    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

    public Persona(int edad, String nombre, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

}

class Cliente extends Persona {
    int credito;

    public Cliente(int edad, String nombre, int telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    int salario;

    public Trabajador(int edad, String nombre, int telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }
}