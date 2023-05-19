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
public class Reto3 {
    public static void PequeñoOso(){
        Scanner escan = new Scanner(System.in);
        int[] N = new int[Integer.parseInt(escan.nextLine())];
        String S;
        int min=0, rep = 0;
        S = escan.nextLine();
        for(int i = 0; i < N.length; i++){
            N[i] = Integer.parseInt(S.split(" ")[i]);
        } 
        for (int i = 0; i < N.length ; i++) {
            if(min < N[i])
                min = N[i];
            for (int j = 0; j < N.length ; j++) {
                
                if( N[i] == N[j] && j != i){
                    rep++;
                }
            }
        }
        if(rep > 0){
            System.out.println("Me quedo en La Miel");
        }else{
            for (int i = 0; i < N.length; i++) {
                if(min > N[i]){
                    min = i+1;
                }
            }
            System.out.println(min);
        }
    }
}
