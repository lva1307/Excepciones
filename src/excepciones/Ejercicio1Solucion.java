package excepciones;

public class Ejercicio1Solucion {


    public static void main(String[] args){          //sin retorno
        String nombre = null;

        try{
            System.out.println("El nombre es: "+nombre.length());

        }catch(NullPointerException nul) {
            System.out.println("Error al imprimir el nombre: "+nul);
        }finally {
            System.out.println("Programa finalizado");
        }

    }
}
