/*
Programa que calcula el maximo comun divisor entre 2 numeros

Integrantes:
Adrian Flores Macias
Ernesto Gonzales Gomez
Yolanda Lopez Gomez
Jhonatan Uriel Castellanos Preciado

Y mejorado por Marco Diaz
 */
package divisor;

import java.util.Scanner;

public class Divisor {

    //Declaracion de variables
    static int a, b, aux, n1, n2;
    static Scanner leer = new Scanner(System.in);

    public static int MCD_iterativo(int n1, int n2) {
        //declaramos el numero menor que tenemos como b y el mayor como a
        //Esto con el objetivo de no causar error al ejecutar
        if (n1 > n2) {
            a = n1;
            b = n2;
        } else {
            a = n2;
            b = n1;
        }
        /*Calculamos el maximo comun divisor mediante un ciclo iterativo en el cual nos guiamos 
        con el residuo de dividir el numero mayor entre el menor y retornamos el valor   
         */
        do {
            aux = b;
            b = a % b;
            a = aux;
        } while (b != 0);
        return aux;
    }

    public static int MCD_recursivo(int num1, int num2) {
        //num2 sera nuestro numero menor asi que cuando sea 0 significa que en nuestra otra variable 
        //ya tenemos el maximo comun divisor 
        if (num2 == 0) {
            return num1;
            //como el if solo esta impriemindo el resultado aqui tenemos que volver a llamar la funcion
            //recursiva las veces que sea necesario para encontra el maximon comun divisor
        } else {
            return MCD_recursivo(num2, num1 % num2);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        execute();
    }
    
    public static void execute() {
        System.out.println("Ingrese un numero: ");
        n1 = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        n2 = leer.nextInt();
        //Mandamos a imprimir en pantalla a ambos resultados
        System.out.println("El M.C.D. entre " + n1 + " y " + n2 + " por metodo Iterativo es: " + MCD_iterativo(n1, n2));
        System.out.println("El M.C.D. entre " + n1 + " y " + n2 + " por metodo Recursivo es: " + MCD_recursivo(n1, n2));
    }

}
