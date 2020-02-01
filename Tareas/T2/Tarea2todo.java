    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Tarea2todo {
    
    String nombres[] = new String[5];
    ArrayList<String> monedas = new ArrayList<String>();
    ArrayList<Integer> monedasmodenero = new ArrayList<Integer>();
    ArrayList<Integer> monedas1 = new ArrayList<Integer>();
    ArrayList<Integer> monedas2 = new ArrayList<Integer>();
    ArrayList<Integer> monedas3 = new ArrayList<Integer>();
    ArrayList<Integer> monedas4 = new ArrayList<Integer>();
    
    
     public Tarea2todo(){
               
    }
        
    public void inicio() {
        
        nombres[0] = "Monedas";
        nombres[1] = "Kevin";
        nombres[2] = "Herbert";
        nombres[3] = "Mario";
        nombres[4] = "Enio";  
        
    } 
     
     public void agregarmoneda(){
         
         inicio();
         Scanner teclado = new Scanner(System.in);
         int opcion;
         do {             
         
         System.out.println("1.crear una moneda");
         System.out.println("2.agregar mas monedas a una existente");
         System.out.println("3.ver monedas");
         System.out.println("4.trasnferir desde el monedero");
         System.out.println("5.tansferencias entre usuarios");
         System.out.println("6.salir\n");
         
         opcion = teclado.nextInt();
         switch (opcion){
            case 1:
                 crear();
                 break;
            case 2:
                agregar();
                break;
            case 3:
                ver();
                break;
            case 4:
                transferencia1();
                break;
            case 5:
                transferencia2();
                break;
            case 6:
                
         }    
       } while (opcion != 6);     
         
     }
     
    public void crear(){
        
        Scanner nombre = new Scanner(System.in); 
        String nombren;
        System.out.println("ingrese numevo nombre de la moneda");    
        nombren = nombre.nextLine();
        monedas.add(nombren);
        
        Scanner cmonedas = new Scanner(System.in);
        int canmonedas;
        System.out.println("cuantas monedas desea asiganar al monedero");
        canmonedas = cmonedas.nextInt();
        monedasmodenero.add(canmonedas);
        
        int canmonedas1;
        System.out.println("cuantas monedas desea asiganar Kevin");
        canmonedas1 = cmonedas.nextInt();
        monedas1.add(canmonedas1);
        
        int canmonedas2;
        System.out.println("cuantas monedas desea asiganar Herbert");
        canmonedas2 = cmonedas.nextInt();
        monedas2.add(canmonedas2);
        
        int canmonedas3;
        System.out.println("cuantas monedas desea asiganar Mario");
        canmonedas3 = cmonedas.nextInt();
        monedas3.add(canmonedas3);
        
        int canmonedas4;
        System.out.println("cuantas monedas desea asiganar Enio");
        canmonedas4 = cmonedas.nextInt();
        monedas4.add(canmonedas4);
        
        
     }
     
    
    public void agregar(){
        
        int indicelistas;
        int tamanio;
        indicelistas = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("De que moneda desea trasnferir?");
        tamanio = monedas.size();
        for (int i = 0; i < tamanio; i++) {

        System.out.println("las monedas " + monedas.get(i));
             
           }   
        
        String smoneda;
        smoneda = teclado.nextLine();
         
        for (int i = 0; i < tamanio; i++) {
        
            if (smoneda.equalsIgnoreCase(monedas.get(i))) {
                
                Scanner cantidad = new Scanner(System.in);
                int asumar;
                System.out.println("cuantas desea sumar?");
                asumar = cantidad.nextInt();
                
                int temp;
                int suma;
                temp = monedasmodenero.get(indicelistas);
                suma = temp + asumar;
                monedasmodenero.set(indicelistas, suma);
                                   
            }

           }   
         
     }       
    
    
    public void ver(){
        
      int tamanio = monedas.size();
         
      if (tamanio > 0) {

        for (int i = 0; i < tamanio; i++) {

        System.out.println("las monedas " + monedas.get(i));
        
         System.out.println("Las monedas en el monedero son: " + monedasmodenero.get(i));
         System.out.println("las monedas de kevin son: " + monedas1.get(i));
         System.out.println("las monedas de Herbert son: " + monedas2.get(i));
         System.out.println("las monoedas de Mario son: " + monedas3.get(i));
         System.out.println("las monedas de Enio son: " + monedas4.get(i));        
           }
      }else{
          
          System.out.println("No existen monedas");
          
      }
                 
     }
     

    public void transferencia1(){
        
        
        String va;
        String nombre;
        int indicenombre;
        int indicelistas;
        String seleccion;
        Scanner nombres = new Scanner(System.in);
        Scanner moneda = new Scanner(System.in);
        
        System.out.println("trasferencias:");
        System.out.println("a que usario desea transferir monedas: ");
        System.out.println("Kevin");
        System.out.println("Herbert");
        System.out.println("Mario");
        System.out.println("Enio");
        nombre = nombres.nextLine();   

        indicenombre= 0;
        
        if (nombre.equalsIgnoreCase("kevin")) {
            indicenombre = 1;
        }else if (nombre.equalsIgnoreCase("Herbert")) {
            indicenombre = 2;              
        } else if (nombre.equalsIgnoreCase("Mario")) {
            indicenombre = 3;              
        } else if (nombre.equalsIgnoreCase("Enio")) {
            indicenombre = 4;    
        } else {
            System.out.println("usuario inexistente");
        }
        
        
        if (indicenombre != 0) {
            int tamanio = monedas.size();
            
        for (int i = 0; i < tamanio; i++) {

        System.out.println("las monedas " + monedas.get(i));
             
           }            
            
        indicelistas = 0;
        Scanner teclado = new Scanner(System.in);
        va = teclado.nextLine();
        System.out.println("De que moneda desea trasnferir?");
        String smoneda;
        smoneda = moneda.nextLine();
        
        for (int i = 0; i < tamanio; i++) {

            if (smoneda.equalsIgnoreCase(monedas.get(i))) {
                indicelistas = i;
                
            }
             
           }  
        
            if (indicelistas != 0) {
                
                Scanner cantidad = new Scanner(System.in);
                int cantidadmone;
                
               System.out.println("cuantas monedas decea trasferir");
               cantidadmone = cantidad.nextInt();
               
                if (indicenombre == 1) {
                    int temp;
                    int suma;
                    temp = monedas1.get(indicelistas);
                    suma = temp + cantidadmone;
                    monedas1.set(indicelistas, suma);
                    
                    int temp2;
                    int suma2;
                    temp2 = monedasmodenero.get(indicelistas);
                    suma2 = temp2 - cantidadmone;
                    monedasmodenero.set(indicelistas, suma2);
                    
                    
                } else if (indicenombre == 1) {
                    int temp;
                    int suma;
                    temp = monedas2.get(indicelistas);
                    suma = temp + cantidadmone;
                    monedas2.set(indicelistas, suma);
                    
                    int temp2;
                    int suma2;
                    temp2 = monedasmodenero.get(indicelistas);
                    suma2 = temp2 - cantidadmone;
                    monedasmodenero.set(indicelistas, suma2);                    
                    
                }else if (indicenombre == 1) {
                    int temp;
                    int suma;
                    temp = monedas3.get(indicelistas);
                    suma = temp + cantidadmone;
                    monedas3.set(indicelistas, suma);
                    
                    int temp2;
                    int suma2;
                    temp2 = monedasmodenero.get(indicelistas);
                    suma2 = temp2 - cantidadmone;
                    monedasmodenero.set(indicelistas, suma2);                    
                    
                } else if (indicenombre == 1) {
                    int temp;
                    int suma;
                    temp = monedas4.get(indicelistas);
                    suma = temp + cantidadmone;
                    monedas4.set(indicelistas, suma);
                    
                    int temp2;
                    int suma2;
                    temp2 = monedasmodenero.get(indicelistas);
                    suma2 = temp2 - cantidadmone;
                    monedasmodenero.set(indicelistas, suma2);                    
                    
                }
                      
            }else{
                System.out.println("moneda no existente");
            }
            
        }
 

     }
     

    public void transferencia2() {
        
    
        
        String va;
        int vas;
        String nombre;
        int indicenombre;
        int indicelistas;
        String seleccion;
        Scanner nombres = new Scanner(System.in);
        Scanner moneda = new Scanner(System.in);
        
        
        System.out.println("trasferencias:");
        System.out.println("de que usario desea transferir monedas: ");
        System.out.println("Kevin");
        System.out.println("Herbert");
        System.out.println("Mario");
        System.out.println("Enio");
        nombre = nombres.nextLine();   

        indicenombre= 0;
        vas = 0;
        
        if (nombre.equalsIgnoreCase("kevin")) {
            vas = 1;
        }else if (nombre.equalsIgnoreCase("Herbert")) {
            vas = 2;              
        } else if (nombre.equalsIgnoreCase("Mario")) {
            vas = 3;              
        } else if (nombre.equalsIgnoreCase("Enio")) {
            vas = 4;    
        } else {
            System.out.println("usuario inexistente");
        }
        
        
        System.out.println("trasferencias:");
        System.out.println("a que usario desea transferir monedas: ");
        System.out.println("Kevin");
        System.out.println("Herbert");
        System.out.println("Mario");
        System.out.println("Enio");
        nombre = nombres.nextLine();   

        indicenombre= 0;
        
        if (nombre.equalsIgnoreCase("kevin")) {
            indicenombre = 1;
        }else if (nombre.equalsIgnoreCase("Herbert")) {
            indicenombre = 2;              
        } else if (nombre.equalsIgnoreCase("Mario")) {
            indicenombre = 3;              
        } else if (nombre.equalsIgnoreCase("Enio")) {
            indicenombre = 4;    
        } else {
            System.out.println("usuario inexistente");
        }
        
        
        if ((indicenombre != 0)&&(vas != 0)&&(vas != indicenombre)) {
            int tamanio = monedas.size();
            
        for (int i = 0; i < tamanio; i++) {

        System.out.println("las monedas " + monedas.get(i));
             
           }            
            
        indicelistas = 0;
        Scanner teclado = new Scanner(System.in);
        va = teclado.nextLine();
        System.out.println("De que moneda desea trasnferir?");
        String smoneda;
        smoneda = moneda.nextLine();
        
        for (int i = 0; i < tamanio; i++) {

            if (smoneda.equalsIgnoreCase(monedas.get(i))) {
                indicelistas = i;
                
            }
             
           }  
        
            if (indicelistas != 0) {
                
                Scanner cantidad = new Scanner(System.in);
                int cantidadmone;
                
               System.out.println("cuantas monedas decea trasferir");
               cantidadmone = cantidad.nextInt();
               
                if (indicenombre == 1) {
                    int temp;
                    int suma;
                    temp = monedas1.get(indicelistas);
                    suma = temp + cantidadmone;
                    monedas1.set(indicelistas, suma);
                    
                    if (vas == 2) {
                    int temp2;
                    int suma2;
                    temp2 = monedas2.get(indicelistas);
                    suma2 = temp2 - cantidadmone;
                    monedas2.set(indicelistas, suma2);
                    
                    } else if (vas == 3) {
                    int temp2;
                    int suma2;
                    temp2 = monedas3.get(indicelistas);
                    suma2 = temp2 - cantidadmone;
                    monedas3.set(indicelistas, suma2);
                    
                    } else if (vas == 4) {
                    int temp2;
                    int suma2;
                    temp2 = monedas4.get(indicelistas);
                    suma2 = temp2 - cantidadmone;
                    monedas4.set(indicelistas, suma2);
                    } 

                    
                    
                } else if (indicenombre == 1) {
                    int temp;
                    int suma;
                    temp = monedas2.get(indicelistas);
                    suma = temp + cantidadmone;
                    monedas2.set(indicelistas, suma);
                    
                    if (vas == 1) {
                    int temp2;
                    int suma2;
                    temp2 = monedas1.get(indicelistas);
                    suma2 = temp2 - cantidadmone;
                    monedas1.set(indicelistas, suma2);
                    
                    } else if (vas == 3) {
                    int temp2;
                    int suma2;
                    temp2 = monedas3.get(indicelistas);
                    suma2 = temp2 - cantidadmone;
                    monedas3.set(indicelistas, suma2);
                    
                    } else if (vas == 4) {
                    int temp2;
                    int suma2;
                    temp2 = monedas4.get(indicelistas);
                    suma2 = temp2 - cantidadmone;
                    monedas4.set(indicelistas, suma2);
                    } 

                }else if (indicenombre == 1) {
                    int temp;
                    int suma;
                    temp = monedas3.get(indicelistas);
                    suma = temp + cantidadmone;
                    monedas3.set(indicelistas, suma);
                    
                    if (vas == 2) {
                    int temp2;
                    int suma2;
                    temp2 = monedas2.get(indicelistas);
                    suma2 = temp2 - cantidadmone;
                    monedas2.set(indicelistas, suma2);
                    
                    } else if (vas == 1) {
                    int temp2;
                    int suma2;
                    temp2 = monedas1.get(indicelistas);
                    suma2 = temp2 - cantidadmone;
                    monedas1.set(indicelistas, suma2);
                    
                    } else if (vas == 4) {
                    int temp2;
                    int suma2;
                    temp2 = monedas4.get(indicelistas);
                    suma2 = temp2 - cantidadmone;
                    monedas4.set(indicelistas, suma2);
                    } 
                   
                    
                } else if (indicenombre == 1) {
                    int temp;
                    int suma;
                    temp = monedas4.get(indicelistas);
                    suma = temp + cantidadmone;
                    monedas4.set(indicelistas, suma);
                    
                    if (vas == 2) {
                    int temp2;
                    int suma2;
                    temp2 = monedas2.get(indicelistas);
                    suma2 = temp2 - cantidadmone;
                    monedas2.set(indicelistas, suma2);
                    
                    } else if (vas == 3) {
                    int temp2;
                    int suma2;
                    temp2 = monedas3.get(indicelistas);
                    suma2 = temp2 - cantidadmone;
                    monedas3.set(indicelistas, suma2);
                    
                    } else if (vas == 1) {
                    int temp2;
                    int suma2;
                    temp2 = monedas1.get(indicelistas);
                    suma2 = temp2 - cantidadmone;
                    monedas1.set(indicelistas, suma2);
                    } 
                   
                    
                }
                      
            }else{
                System.out.println("moneda no existente");
            }
            
        }        
        
        
        
    }
    
    
    
    public void restar(int quien){
        
        
        
        
    }
    
    
}
