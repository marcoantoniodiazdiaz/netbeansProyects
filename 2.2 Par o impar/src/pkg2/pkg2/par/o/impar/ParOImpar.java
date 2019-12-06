package pkg2.pkg2.par.o.impar;

import java.io.*;

/**
 *
 * Integrantes:
 * JESUS EDUARDO AGUILAR SANTIAGO
 * HÉCTOR DE ALBA ZAMORA
 * ERICK GUADALUPE MADRIGAL LÓPEZ
 * ALAN BRAULIO CASTELLANOS ARRAÑAGA
 * 
 * Y pulido por Marco Diaz ;D
 * 
 * Este programa captura un número y determina si es par o impar
 */
public class ParOImpar {
    
    //y=Auxiliar para contavilizar el número de vueltas de un ciclo
    
    static int y=0;
    public static BufferedReader Leer = new BufferedReader (new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        execute();
    }
    public static boolean Es_par(int n){
        // Contabilizador de las vueltas
        y ++;
        if (n == 0){
            return true;
        } else { //Si no es par ejecuta el método impar
           return impar(n-1);
        }
    }
    public static boolean impar(int n){
        //Contabilizador de las vueltas
        y++;
        if (n == 0){
            return false;
        } else { // Si no es impar ejecuta el método Es_par
            return Es_par(n-1);
        }
    }
    
    public static void execute() throws IOException{
        int r;
        //Captura del número en la variable n
        System.out.print("Ingresa un número: ");
        int n = Integer.parseInt(Leer.readLine());
        System.out.println("\n¿Quiéres usar la recursividad? (1.- Si/2.- No)");
        r = Integer.parseInt(Leer.readLine());
        if (r == 1){
            //Determinación de si es par o impar de forma recursiva
            boolean EsPar=Es_par(n);
            if (EsPar == true){
                System.out.println("\nEl número "+n+" es par");
            }
            if (EsPar == false){
                System.out.println("\nEl número "+n+" es impar");
            }
            System.out.println("\nVueltas: "+y);
        } else {
            //Determinación de si es par o impar de forma iterativa
            if (r == 2){
                y ++;
                if (n%2 == 0){
                    System.out.println("\nEl número "+n+" es par");
                } else {
                    System.out.println("\nEl número "+n+" es impar");
                }
            System.out.println("\nVueltas: "+y);
            } else {
                System.out.println("\nOpción inválida");
            }
        }
    }
}

