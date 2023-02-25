
package Aplicacion;

import BasedeDatos.BaseDeDatos;
import java.util.InputMismatchException;
import java.util.Scanner;


public class NodoMart {
    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);
       BaseDeDatos datos = new BaseDeDatos("NodoMart");
       //cargar datos de la base de datos simulada
       //menu de Iniciar Sesion
      menuPrincipal();
      menuCliente();
       
          
    }
    
    public static void menuPrincipal(){
        Scanner tec = new Scanner(System.in);
       BaseDeDatos datos= new BaseDeDatos(" WELCOME TO NodoMart");
       System.out.println("\n\n========================================================");
       System.out.println("                      "+datos);
       System.out.println("--------------------------------------------------------");
       System.out.println("1 - Iniciar Sesion     ° 。 ° ˛˚˛ * _Π_____*。*˚         ");
       System.out.println("2 - Salir               ˚ ˛ •˛•˚ */______/~＼。˚ ˚ ˛     ");
       System.out.println("                        ˚ ˛ •˛• ˚ ｜ 田田 ｜門｜ ˚         ");     
       System.out.println("========================================================");
    }
    

    
    public static void menuCliente(){
        Scanner tec = new Scanner(System.in);
        
         BaseDeDatos datos = new BaseDeDatos("NodoMart");
       //cargar datos de la base de datos simulada
        int op=0;
       do{
        System.out.println("\n\n\n");
        System.out.println("--------------------------------------------------------");
        System.out.println("              Bienvenido de Nuevo ");
        System.out.println("--------------------------------------------------------");
        System.out.println("1 - Agregar al carrito");
        System.out.println("2 - Eliminar producto del carrito");
        System.out.println("3 - Carrito de compra");
        System.out.println("4 - Pagar");
        System.out.println("5 - Salir");
        System.out.println("--------------------------------------------------------");
       
       op=tec.nextInt();
        switch (op){
           case 1:
               datos.agregarCarrito();
               break;
           case 2:
               datos.eliminarProducto();
               break;
           case 3:
               datos.verCarrito();
               break;
           case 4:
               datos.pagar();
               break;
           case 5:
               System.out.println("Nos vemos :)");
               break;  
       }   
        if(op>5){
            System.out.println("Ingrese una opcion valida");   
       }
       }while(op!=5);
       
        
    }
}
