/*PROGRAMA QUE IMPRIME COMO RESULTADO LA POTENCIA DEL NUMERO INGRESADO*/

package potencia;
import java.util.*;

public class Potencia {

    private static int potencia_recursiva(int num, int exponente) { // Parametros declarados para la ejecucion de los dos metodos RECURSIVO E ITERATIVO.
        if (exponente == 0) {  //Si el numero ingresado es 0 retorna 1 como potencia.
            return 1;
        } 
        else {  //Caso contrario se hace la siguiente operacion para calcular la potencia del numero ingresado.
            return num * potencia_recursiva(num, exponente - 1);
        }
    }

    private static int potencia_iterativa(int num, int exponente) {
        int p = 1;
        for (int x = 0; x < exponente; x++) {  // Ciclo para exponentes positivos.
            p*= num;  // Multiplica el numero por si mismo por las veces a elevar.
        }
        return p;
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        execute();
    }
    
    public static void execute() {
        Scanner leer = new Scanner(System.in);
        int num, exponente;
        System.out.println("Ingresa un numero ");
        num = leer.nextInt();
        System.out.println("Ingresa la potencia a elevar ");
        exponente = leer.nextInt();
        System.out.println();
        // A continuacion, se mandan imprimir cada, metodo para monstrarlo al usuario.
        System.out.println("El resultado del numero " + num + " es " + potencia_recursiva(num, exponente));
        System.out.println();
        System.out.println("El exponente del numero " + num + " mediante el ITERATIVO es " + potencia_iterativa(num, exponente));
        System.out.println();
    }
}

    