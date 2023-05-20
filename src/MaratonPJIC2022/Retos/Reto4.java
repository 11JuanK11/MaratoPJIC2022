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
        int casos = Integer.parseInt(escan.nextLine()) ;
        int[] bal, vel, pos, limit;
        String[] a,b,c,d;
        float[] minv = new float[casos];
        for(int i = 0; i < casos; i++){
            int dimen = Integer.parseInt(escan.nextLine()), cont = 0;
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
                while(ban){
                    //Comparar posicion balon y posicion de geek
                    for (int j = 0; j < dimen; j++) {
                        if (bal[j] == pos[j]) {
                            for (int k = 0; k < dimen; k++) {
                                if (k != j) {
                                    cont += Math.pow(pos[k], 2);
                                }
                            }
                        }
                    }
                    for (int k = 0; k < dimen; k++) {
                        if(bal[k] == pos[k] || bal[k] == limit[k]){
                            ban = false;
                        }
                        bal[k] += vel[k];
                        
                    }
                    minv[i] = (float) (Math.sqrt(cont));
                }
                
            
            
        }
        for (int i = 0; i < minv.length ; i++) {
            System.out.printf("%.4f",minv[i]);
            System.out.println("");
        }
    }
}
