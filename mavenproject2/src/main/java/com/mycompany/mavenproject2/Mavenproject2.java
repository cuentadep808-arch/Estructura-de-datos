/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;


public class Mavenproject2 {

    public static void main(String[] args) {
    
        int[ ] numero = {4,5,6,3,2,8};
    
    for (int i = 0; i < numero.length; i++) {
        for (int j = i + 1; j < numero.length; j++) {
            
            if (numero[i]  > numero[j]) {
              int aux = numero[i];
              numero[i] = numero[j];
              numero[j] = aux;
              
            }
            
        }
    }
    for (int i = 0; i < numero.length; i++){
        System.out.println(numero[i]);
    }
}
}