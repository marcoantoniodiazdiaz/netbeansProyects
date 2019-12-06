/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2.invertirn;
//Descripción del programa: programa que invierte un número. Ejemplo: 123 a 321
/**
 *
 * @author
 * Equipo 6:
 * Brayan Alberto Godinez Flores
 * Alberto Cachua García
 * Gabriel Valencia Martínez
 * Gerardo Ismael Ramírez Hernández
 * 
 */
import java.util.*;
public class U2InvertirN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        execute();
    }
    
    public static void execute() {
        // TODO code application logic here
        Scanner l = new Scanner(System.in);//Declaración de variables a utilizar
        U2InvertirN a = new U2InvertirN();
        String na="",opx,aux="";
        int n=0,pos=0,correc,op=0;
        
        do{//Inicio de ciclo para evaluar el número a ingresar
            correc=0;//Variable que forma parte de la condicion del ciclo
        try{//Bloque de validación
        System.out.println("Ingrese un número");
        na=l.next();//Se ingresa un número a String para poder medir su longitud
        n=Integer.parseInt(na);//Se convierte a entero
        pos=na.length();//Longitud del número
        }catch(NumberFormatException x){//Mensaje de error por si el usuario no ingreso un número
            System.out.println("¡Error, ingrese un número!");
            correc++;//Aumenta la variable del ciclo y ocaciona que se repita
        }
        }while(correc>0);//Fin del ciclo
        
        
        do{//Inicio de ciclo de cálculo
            correc=0;//Variable que forma parte de la condicion del ciclo
        try{
            System.out.println("¿En que forma quiere calcularlo?\n1.-Recursiva\n2.-Iterativa");//Se le pregunta al usuario sobre la forma de evaluación
            opx=l.next();//Este proceso es igual que el ciclo anterior
            op=Integer.parseInt(opx);
        }catch(NumberFormatException q){//Mensaje de error por si el usuario no ingreso un número
            System.out.println("¡Error, ingrese un número!");
            correc++;//Aumenta la variable del ciclo y ocaciona que se repita
        }
        }while(correc>0);//Fin del ciclo
        
        if (op==1) {//If que determina la ejecución de la evaluación
            System.out.println("El número invertido es: "+invertirNum(n, pos-1));//Se imprime el resultado usando recursividad
        }else{
            //Forma Iterativa
            for (int x = pos-1; x >= 0; x--) {//Utilizamos un for inicializado en la longitud del número - 1(última posición) y se ejecutara de manera descendente
                aux=aux+na.charAt(x);//La variable auxiliar guarda cada caracter del número
            }
            System.out.println("El número invertido es: "+aux);//Se imprime el resultado
        }
    }
    
    //Forma Recursiva
    public static int invertirNum(int num, int pos){
         
        //Si es menor que 10 se devuelve el numero (el ultimo numero)
        if(num < 10){
            return num; 
        }else{
            //utilizamos el modulo del numero y lo multiplicamos por la potencia
            return (num % 10) * (int) Math.pow(10, pos) + (invertirNum(num/10, pos-1));
        }
         
    }
    
}
