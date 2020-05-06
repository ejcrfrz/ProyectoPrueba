/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba;

import java.util.Scanner;

/**
 *
 * @author EDUARDO
 */
public class ProyectoPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        while (true) {
            System.out.println("Escoja su opcion");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            Scanner sc = new Scanner(System.in);
            String op = sc.nextLine();
            
            System.out.print("Ingrese el primer numero: ");
            String strn1 = sc.nextLine();
            
            System.out.print("Ingrese el segundo numero: ");
            String strn2 = sc.nextLine();
            
            int n1 = Integer.valueOf(strn1);
            int n2 = Integer.valueOf(strn2);

            switch (op) {
                case "1":
                    int resultado1 = sumar(n1, n2);
                    System.out.println("La suma es: " + resultado1);
                    break;
                case "2":
                    int resultado2 = funcionRestar(n1,n2);
                    System.out.println("La suma es: " + resultado2);
                    break;
            }

        }

    }

    static int sumar(int a, int b) {
        int res = 0;
        res = a + b;

        return res;

    }


    static int funcionRestar(int num1, int num2){

        int result;
        result = num1 - num2;
        return result;
    }

}
