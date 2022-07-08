/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.aldo.reto1;
import java.lang.reflect.Array;
import java.util.Arrays;
/**
 *
 * @author aldai
 */
public class Reto1 {
    

    public static void main(String[] args) {
        double[] listasNotas = {0.5,0.7,4.2,3.6,4.4,2.2,2.4,3.5,3.7,0.6};
        double suma = 0,mayor=0,menor=5,prom=0;
        
        for (int i = 0;i<listasNotas.length;i++){
            suma = suma + listasNotas[i];
            prom = suma/listasNotas.length;
            if (listasNotas[i]>mayor){
                mayor = listasNotas[i];
            }
            if (listasNotas[i]<menor){
                menor = listasNotas[i];
            }
        }
        
        double[] resultado = {prom,menor,mayor};
        
        System.out.println(Arrays.toString(resultado)); //resultado
        //System.err.println(Arrays.toString(listasNotas));
        
        //esto se supone que es una actualizacion
        System.out.println("Hola mundo");
        
        //esto es una actualizacion 2
    }
}