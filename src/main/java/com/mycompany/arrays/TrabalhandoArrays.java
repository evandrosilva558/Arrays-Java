/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrays;

/**
 *
 * @author Evandro
 */
public class TrabalhandoArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // criando array 
        String[] meuArray = {"Evandro","Erika","Isabella","miguel","Isaias","Marcia","Henrique","Iury","Erica","Julia"};
        for(int i=0; i<10; i++) System.out.println("Nome: "+meuArray[i]);
        
        // array multivaloravél 
        int [][] ArrayMulti = {{1,2,3,4,5},{6,7,8,9,10}};
        for (int[] ArrayMulti1 : ArrayMulti) {
            for (int j = 0; j < ArrayMulti1.length; j++) {
                System.out.println(ArrayMulti1[j]);
            }
        }
        
        // trocando o valor do array na posição [0]        
        meuArray[0] = "EV";
        
        // tamanho do array com .length
        System.out.println("Tamanho do array: "+meuArray.length);
    }             
    
}
