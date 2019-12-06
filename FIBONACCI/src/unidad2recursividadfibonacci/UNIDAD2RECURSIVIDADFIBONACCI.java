package unidad2recursividadfibonacci;

import java.util.*;

public class UNIDAD2RECURSIVIDADFIBONACCI {

    static Scanner leer = new Scanner(System.in);
    static UNIDAD2RECURSIVIDADFIBONACCI opc = new UNIDAD2RECURSIVIDADFIBONACCI();

    public static void main(String[] args) {
        execute();
    }
    
    public static void execute() {
        while (true) {

            System.out.println("\nSERIE DE FIBONACCI"
                    + "\n 1.-Metodo iterativo"
                    + "\n 2.-Metodo recursivo"
                    + "\n 3.-Salir");
            System.out.print("Opcion: ");
            String op = leer.next();
            int tra = 0;
            try {
                tra = Integer.parseInt(op);
                if (!(tra > 0 && tra <= 3)) {
                    System.err.println("Opcion Invalida");
                }

            } catch (NumberFormatException e) {
                {
                    System.err.println("Opcion Invalida");
                }
            }

            switch (tra) {
                case 1: {
                    leer.nextLine();
                    System.out.println("Ingresa el limite que desea ver de a serie fibonaci");
                    String lim = leer.nextLine();
                    if (isNumber(lim)) {
                        opc.Itera(Integer.parseInt(lim));
                    } else {
                        System.err.println("Error: Invalido");
                    }
                    break;
                }
                case 2: {
                    leer.nextLine();
                    System.out.println("Ingresa el limite que desea ver de a serie fibonaci");
                    long Limite = leer.nextLong();
                    System.out.println("Los primeros "+Limite+" de la serie fibonacci son:");                    
                    Recur(Limite,0,1);
                    break;
                }
                case 3: {
                    return;
                }
            }
        }
    }

    private static void Recur(long Limite, long anterior, long actual) {
       if(Limite>0){
           System.out.println(" "+actual);
           Recur(Limite-1, actual, anterior + actual);
       }
    }

    public void Itera(int num) {
        int f = 0;
        int t1 = 1;
        int t2;
        for (int i = 1; i <= num; i++) {
            t2 = f;
            f = t1 + f;
            t1 = t2;
            System.out.print(t1 + ", ");

        }

    }

    public static boolean isNumber(String cad) {
        try {
            Integer.parseInt(cad);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

}
