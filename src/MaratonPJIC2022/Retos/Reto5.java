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
public class Reto5 {
    public static void WarCraftBattles(){
        Scanner escan = new Scanner(System.in);
        int casos = Integer.parseInt(escan.nextLine());
        int[] teams = new int[2], res = new int[casos];
        String[] S ;
        int[][] thralls, illidians;
       
        for (int i = 0; i < casos; i++) {
            S = escan.nextLine().split(" ");
            teams[0] = Integer.parseInt(S[0]);
            teams[1] = Integer.parseInt(S[1]);
            thralls = new int[teams[0]][2];
            illidians = new int[teams[1]][2];
            for (int j = 0; j < teams[0]; j++) {
                S = escan.nextLine().split(" ");
                thralls[j][0] = Integer.parseInt(S[0]);
                thralls[j][1] = Integer.parseInt(S[1]);
            }
            for (int j = 0; j < teams[1]; j++) {
                S = escan.nextLine().split(" ");
                illidians[j][0] = Integer.parseInt(S[0]);
                illidians[j][1] = Integer.parseInt(S[1]);             
            }
            for (int j = 0; j < teams[0] ; j++) {
                for (int k = 0; k < teams[1]; k++) {
                    if(thralls[j][1] == illidians[k][1]){
                        if(thralls[j][0] < illidians[k][0]){
                            illidians[k][0] = illidians[k][0] - thralls[j][0];
                            thralls[j][0] = 0;     
                        }else{
                            if(thralls[j][0] > illidians[k][0]){
                                thralls[j][0] = thralls[j][0] - illidians[k][0];
                                illidians[k][0] = 0; 
                            }else{
                                if(thralls[j][0] ==illidians[k][0]){
                                    thralls[j][0] = 0;
                                    illidians[k][0] = 0; 
                                }
                            }
                        }
                    }
                }
            }
            for (int j = 0; j < teams[1]; j++) {
                res[i] += illidians[j][0];
            }
        }
        for (int i = 0; i < casos; i++) {
            System.out.println(res[i]);
        }
    
    }
}
