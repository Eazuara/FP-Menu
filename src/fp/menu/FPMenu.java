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
     Scanner entrada=new Scanner (System.in);
     int opcion;
     do{
 
        System.out.println("***Calculo de área***");
        System.out.println("***Menú***");
        System.out.println("Introduce la opcion deseada");
        System.out.println("1. Area de cuadrados");
        System.out.println("2. Area de circulos");
        System.out.println("3. Area de triangulos");
        opcion=entrada.nextInt();
     }while(opcion<0 || opcion>=4);
        return opcion;
        
        }
    public static float CalcularArea(int op){
        float area;
        switch(op){
            case 1:
                area =areaCuadrado();
                break;
            case 2:
                area =areaCirculo();
                break;
            case 3:
                area =areaTriangulo();
                break;
            default:
                area =mensajeSalida();
                break;
            
        }
        return area;
    
    }
}
       
    

