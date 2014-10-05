package boletin2.pkg10;

import java.util.Scanner;

public class Boletin210 {
    
    public static void main(String[] args) {
        
        int cantidad;
        
        System.out.print("introducir cantidad en euros: ");
        Scanner dato=new Scanner(System.in);
        cantidad=dato.nextInt();
        
        System.out.println(cantidad/100 + " billetes de 100e");
        System.out.println(cantidad%100/20 + " billetes de 20e");
        System.out.println(cantidad%100%20/5 + " billetes de 5e");
        System.out.println(cantidad%100%20%5 + " monedas de 1e");
    }
}
//created by Seijas