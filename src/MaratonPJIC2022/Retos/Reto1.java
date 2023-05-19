/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MaratonPJIC2022.Retos;

import java.util.Scanner;

/**
 *
 * @author 57301
 */
public class Reto1 {
    public static void EQUIPOS(){
        Scanner a = new Scanner(System.in);
        int equipos = a.nextInt(), cont=0;
        int [] N = new int[equipos], M = new int[equipos];
        
        
        for (int i = 0; i < equipos; i++) {
            N[i] = a.nextInt();
            M[i] = a.nextInt();
            
        }
        for(int i = 0; i < N.length; i++){
            for (int j = 0; j < M.length; j++) {
                if(N[i] == M[j]){
                    cont++;
                }
            }
        }
        System.out.println(cont);  
    }
}

