package com.mycompany.bmi;

import java.util.Scanner;


public class BMI {

    
    public static void main(String[] args) {
        int berat;
        double tinggi;
        double bmi;
        
       Scanner in = new Scanner(System.in);
            System.out.println("Berapakah tinggimu ?");
                tinggi=in.nextInt();
            System.out.println("Berapakah beratmu  ?");
                berat=in.nextInt();
                 tinggi/=100; 
        bmi=berat / (tinggi*tinggi);
            System.out.println("hasil Bmi kamu adalah:" + bmi);
        
        if(bmi<18){
            System.out.println("kurus");
        }
        else if (bmi<22){
            System.out.println("normal");
        }
        else if (bmi<29){
            System.out.println("sedikit kelebihan berat badan");
        }
        else if (bmi>35){
            System.out.println("kelebihan berat badan");
        }
       
    }
    
}
