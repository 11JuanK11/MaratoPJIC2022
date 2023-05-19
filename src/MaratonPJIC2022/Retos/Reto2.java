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
public class Reto2 {
    public static void JohnnyBGoode(){
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
    }
}

