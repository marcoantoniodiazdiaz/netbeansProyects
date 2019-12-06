
package algortrecursivo;
import java.util.Scanner;
/**
 *
 * @author ElIlluminadoRAA 
 * Integrantes
 * Alejandro Ramirez Aguirre
 * Ivan Alejandro Mendoza Rivera
 * Gabriel Gonzales Jimenez
 * Sergio Manuel Plascencia Martinez
 * 
 * Mejorado por Marco Diaz ;D
 * 
 */
public class AlgortRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        execute();
    }
     
    private static int Metodo(int N){
        //si el numero es 0 directamente lo retornamos
        if(N == 0) {
            return N;          
        } else { //Si no, hacemos la operacion (n/10)+(n%10) y lo retornamos
            return Metodo(N/10) + N%10;
        }
    }
    public static int Metodon(int n){
        // Creo una variable tipo String para meter el numero digitado
        char c;
        String H = Integer.toString(n);
        // Se crea otra variable tipo entero para guardar la longitud del numero
        int lon = H.length();
        // reinicio el valor de nuestra variable para poder operar
        n  =0;
        // Se crea el ciclo for donde se va a repetir el numero de veces que tiene la longitud de mi numero (n)
        for (int i = 0; i < lon ; i++) { 
            //Sumo el char en la posicion i del for al espacio "" para convetirlo en String y despues lo convierto a Int
            //Cuando el ciclo se repita se sumara al numero que ya tenia antes
            n += Integer.parseInt("" + H.charAt(i));           
        }
        return n;
        //una vez sumados todos los numeros retorno n
    }
    
    public static void execute() {
        // El programa recibe un numero de entrada por ejemplo 123 y regresa la suma de todos sus digitos (6)
        
        Scanner leer = new Scanner (System.in);
        //Aqui pedimos el numero entero, declaramos la variable y de paso le damos el valor que pedimos con el scanner
        System.out.print("------------ Menu ------------\n"
                + "1. Metodo Iterativo\n"
                + "2. Metodo Recursivo\n"
                + "3. Salir");
        int op = leer.nextInt();
        switch (op) {
            case 1:
                System.out.print("Digite un numero: ");
                int n = leer.nextInt();
                // Mando llamar el metodo
                System.out.println("Resultado :" + Metodon(n));
                break;
            case 2:
                System.out.print("Introduce un número entero: ");
                int N = leer.nextInt();
                // Por medio del sout mandamos llamar el metodo dando el resultado
                System.out.println("La suma de los dígitos del número es: " + Metodo(N));
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
 
}
    
    
    

