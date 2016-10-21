/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema14;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class PP2Problema14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        int [][] arr = new int [7][7]; //Creacion de arreglo de 7x7
        
        System.out.println(arr.length); //Declaracion de metodos
        arr=llenarArreglo(arr);
        mostrarArreglo(arr);
    }
    public static int[][]  llenarArreglo(int [][] a){   //Metodo para llenar el arreglo, las casillas de la diagonal princila se llenan con 1's y 
        Scanner entrada = new Scanner(System.in);       //los demás numeros se llenan con 0's, esto se logra con un if
        for(int i=0; i<7;++i){
            for (int j=0; j<7;++j){
                if(i==j){a[i][j]=1;}else {a[i][j]=0;}                
            }
        }
        
    return a;
    }
    public static void mostrarArreglo(int[][]a){        //metodo que muestra la matriz
        for(int i=0; i<7;++i){System.out.print("\n");
          for (int j=0; j<7;++j){
                System.out.print("["+a[i][j]+"]");
            }
        }
    }}