package paquete01;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese su Nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su Apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su Edad");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su Universidad");
        String uni = entrada.nextLine();
        // nombre = "atacames"
        char valor = nombre.charAt(0); // obtener el primer caracter de una
        // cadena
        //  L   o   j   a
        //  0   1   2   3
        switch (valor) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("%s\n"
                        + "%s\n"
                        + "con edad de: %d\n"
                        + "es estudiante de la %s", nombre.toUpperCase(),
                        apellido.toUpperCase(),edad,uni);
                break; 
                

                
            default:
                System.out.printf("%s "
                        + "%s"
                        + "con edad de: %d "
                        + "es estudiante de la %s", nombre.toLowerCase(),
                        apellido.toLowerCase(),edad,uni);
                break;

        }

    }
}
