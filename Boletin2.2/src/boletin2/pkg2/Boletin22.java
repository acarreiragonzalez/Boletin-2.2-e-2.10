
package boletin2.pkg2;

import java.util.Scanner;


public class Boletin22 {

   
    public static void main(String[] args) {
        float lado, area ;
        System.out.println("lado");
        Scanner dato= new Scanner (System.in);
        lado = dato.nextFloat();
        area=(lado*lado);
        area=(float) Math.pow(lado,2);
        System.out.println("area=" + area );
        
 
    }
    
}
