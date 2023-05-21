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
public class Reto4 {
    public static void TheSportOfKings(){
        Scanner escan = new Scanner(System.in);
        int casos = Integer.parseInt(escan.nextLine()), cont ;
        int[] bal, vel, pos, limit ;
        String[] a,b,c,d;
        float[] minv = new float[casos];
        for(int i = 0; i < casos; i++){
            cont = 0;
            int dimen = Integer.parseInt(escan.nextLine());
            limit = new int[dimen];
            bal = new int[dimen];
            vel = new int[dimen];
            pos = new int[dimen];
            a = escan.nextLine().split(" ");
            b = escan.nextLine().split(" ");
            c = escan.nextLine().split(" ");
            d = escan.nextLine().split(" ");
            for (int j = 0; j < dimen ; j++) {
                limit[j] = Integer.parseInt(a[j]);
                bal[j] = Integer.parseInt(b[j]);
                vel[j] = Integer.parseInt(c[j]);
                pos[j] = Integer.parseInt(d[j]);
            }
            
            boolean ban = true;
            int  igualdades=0, iterador[];
            iterador = new int[dimen];
            do{
                for (int k = 0; k < dimen; k++) {
                    bal[k] += vel[k]; 
                    if(bal[k] == pos[k] || bal[k] > limit[k]){
                        ban = false;
                    }         
                }             
            }while(ban);

            for (int j = 0; j < dimen; j++) {
                if (bal[j] == pos[j] ) {
                    igualdades++;
                    iterador[j] = j;
                }
            } 
            if(igualdades < dimen){
                for (int j = 0; j < dimen; j++) {
                    if( iterador[j] != j){
                        cont += Math.pow( pos[j], 2);
                    }
                }
            }else{
                cont = 0;
            }
            minv[i] = (float) (Math.sqrt(cont));  
        }
        for (int i = 0; i < minv.length ; i++) {
            System.out.printf("%.4f",minv[i]);
            System.out.println("");
        }
    }
}
