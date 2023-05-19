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
public class Calentamiento {
    //Primeros N numeros primos
    public static void Calentamiento(){
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
    }
}
