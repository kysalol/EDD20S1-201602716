/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_1_edd;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Matriz {
    
    int numero1, numero2;
    String entrada;
    Boolean letra;
    Scanner m = new Scanner(System.in);
    
    public Matriz(){
        
        
    }
    
    public void todo() {
        
        letra = true;
        Scanner numero = new Scanner(System.in);
        System.out.println("Escriba el numero de colmnas por filas que decea en la matriz");
        numero1 = numero.nextInt();
        
        if (numero1 > 0) {
            llenadodematriz(numero1);
        }else{
            
            while (numero1 <= 0) {                
               System.out.println("Solo se permiten numero positivos enteros mayores a 0");
               numero1 = numero.nextInt(); 
               
                if (numero1>=1) {
                     llenadodematriz(numero1);
                }
              
            }
            
        }
              
    }
    
    
    
    public void llenadodematriz(int numero1){
        
        int n = this.numero1;
        int n2 = n-1;
               
        Integer[][] m = new Integer[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
             m[i][j] = 0;
            }
        }
        
//        for (int k = 0; k < n; k++) {
//            for (int l = 0; l < n; l++) {
//                if (l < n2) {
//                    System.out.print(m[k][l]);
//                } else {
//                    System.out.println(m[k][l]);                  
//                }
//            }
//        }
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0)||(i == n2)) {
                     m[i][j] = 1;
                }    
            }
        }        
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0)||(i == n2)) {
                     m[j][i] = 1;
                }    
            }
        }            
       
        System.out.println("matriz de: " + n + " X "+ n);
        
        
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                if (l < n2) {
                    System.out.print(m[k][l]);
                } else {
                    System.out.println(m[k][l]);                  
                }
            }
        }
        
    }
            
    
            
    
}
