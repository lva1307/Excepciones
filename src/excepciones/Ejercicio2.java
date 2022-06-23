package excepciones;

public class Ejercicio2 {

    public static void main(String[] args) {


        String nombre = null;

        try {
            if (nombre == null) {
                throw new NullPointerException("El nombre esta vacio");
            }
        } catch (NullPointerException nul) {
            System.out.println("Error al imprimir la cadena ingresada: " + nul);

        } finally {
            System.out.println("El programa ha terminado satisfactoriamente");
        }
    }
}

//si nombre null ENTONCES lanza EXCEPTION adecuada. THROW