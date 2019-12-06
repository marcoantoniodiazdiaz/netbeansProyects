package factorial.i.r;

import java.util.Scanner;

public class FactorialIR {
    static double fact_rec(double n) {
        //System.out.println("n que entra "+n);
        if (n == 0) return 1;
        
        System.out.println("N que retorna "+(n-1)*n);
        return fact_rec (n-1)*n;
    }

    static double fact_it(double n) {
        double f = n;
        for (int j = (int) n-1; j >= 1; j--) f = j * f;
        return f;
    }
    
    
    public static void main(String[] args) {
        execute();
    }
    
    public static void execute() {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        double n;
        System.out.print("Proporcione el valor de n: ");
        n = s.nextDouble();
        System.out.printf("El factorial it de %.0f es %.0f \n\n",n,fact_it(n));
        System.out.printf("El factorial rec de %.0f es %.0f \n\n",n,fact_rec(n));   
    }
    
}
