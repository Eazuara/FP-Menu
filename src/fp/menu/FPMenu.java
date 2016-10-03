/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.menu;
import java.util.*;

/**
 *
 * @author alumno
 */
public class FPMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("La opcion elejida es:"+menu());
    }
    public static int menu(){
        int opcion;
        Scanner entrada=new Scanner (System.in);
        System.out.println("***Calculo de área***");
        System.out.println("***Menú***");
        System.out.println("Introduce la opcion deseada");
        System.out.println("1. Area de cuadrados");
        System.out.println("2. Area de circulos");
        System.out.println("3. Area de triangulos");
        opcion=entrada.nextInt();
        return opcion;
    
    }
    
}
