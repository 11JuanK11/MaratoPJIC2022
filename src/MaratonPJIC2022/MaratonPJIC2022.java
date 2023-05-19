/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MaratonPJIC2022;

import MaratonPJIC2022.Retos.*;
import java.util.Scanner;

/**
 *
 * @author 57301
 */
public class MaratonPJIC2022 {

    /**
     * @param args the command line arguments
     */
    
    //RETOS CATEGORIA #1
    public static void main(String[] args) {
        int opc = 0;
        Scanner escan = new Scanner(System.in);
        do {            
            System.out.println("Retos maraton de programacion.\n"
                + "1. Calentamiento.\n"
                + "2. Reto #1 Equipos\n"
                + "3. Reto #2 Johnny B Goode\n"
                + "4. Reto #3 Pequenio Oso\n"
                + "5. Reto #4 The Sport Of Kings\n"
                + "6. Reto #5 WarCraft Battles\n"
                + "7. Salir ");
            opc = Integer.parseInt(escan.nextLine());
            switch (opc) {
                case 1:
                    Calentamiento.Calentamiento();
                    break;
                case 2:
                    Reto1.EQUIPOS();
                    break;
                case 3:
                    Reto2.JohnnyBGoode();
                    break;
                case 4:
                    Reto3.PequeñoOso();
                    break;
                case 5:
                    Reto4.TheSportOfKings();
                    break;
                case 6:
                    Reto5.WarCraftBattles();
                    break;
                default:
                    ;
            }
        } while (opc != 7);
    }

        
        
    
    
}


/* 
Calentamiento
Primeros N numeros primos:
        int b, num , k =0;
        Scanner a = new Scanner(System.in);
        num = a.nextInt();
        int i = 1;
        while(k < num){
            b = 0;
            for(int j = 1;  j <= i; j++ ){
                if(i % j == 0){
                    b++;
                }
            }
            if(b == 2){
                k++;
                System.out.println(i);
            }
            i++;
        }

Reto #1 EQUIPOS
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

Reto #2 Johnny B. Goode
        int casos, longitud, errores, contMin = 0, contMay = 0;
        Scanner a = new Scanner(System.in);
        casos = a.nextInt();
        longitud = a.nextInt();
        char[][] b = new char[casos][longitud];
        errores = a.nextInt();
        
        for(int i = 0; i < casos; i++){
            b[i] = a.next().toCharArray();
        }
        
        for(int i = 0; i < b.length ; i++){
            contMin = 0;
            contMay = 0;
            for (int j = 0; j < b[i].length ; j++) {
                //Character.isLowerCase(b[i][j])
                if( 'a' <= b[i][j] && b[i][j] <= 'z' ){
                    contMin++;
                }else{
                    contMay++;
                }
            }
            if(contMin > contMay){
                if(contMay <= errores){
                    System.out.println("Johnny");
                }else{
                    System.out.println("none");
                }
            }
            if(contMin < contMay){
                if(contMin <= errores){
                    System.out.println("brother");
                }else{
                    System.out.println("none");
                }
            }
            if(contMin == contMay){
                if(contMin > errores && contMay > errores){
                    System.out.println("none");
                }
            }   
        }

Reto #3 EL PEQUEÑO OSO
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
Reto #4 The sport of kings
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
            for (int j = 0; j < dimen; j++) {
                if(bal[j] == pos[j]){
                    for (int k = 0; k < dimen ; k++) {
                        if(k != j){
                            cont += Math.pow( pos[k], 2);
                        }
                    }
                }
            }
            minv[i] = (float)(Math.sqrt(cont));
        }
        for (int i = 0; i < minv.length ; i++) {
            System.out.printf("%.4f",minv[i]);
            System.out.println("");
        }

Reto #5 WarCraft Battles
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
*/