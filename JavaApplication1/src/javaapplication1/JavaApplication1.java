/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author m_taH
 */
public class JavaApplication1 {
 
   /* public static int nein ( int a){
        Scanner naha = new Scanner(System.in);
        System.out.println("sayiyi giriniz:");
        a= naha.nextInt();
        for(int i=1;i<a;i++)
               {
                   a+= a*(a-i);
               }
        System.out.println("sonuc="+ a); 
        return a;
        
    }*/
    public static void gain (){
        Scanner nah = new Scanner(System.in);
        System.out.println("sayiyi giriniz:");
        int n= nah.nextInt();
        int fakto=1;
        while(n>0){
        fakto*=n;
        n--;
        } 
        System.out.println("sonuc="+fakto);
    
    }
    public static void main(String[] args) {
        
        Scanner zırt = new Scanner(System.in);
        zırt.useLocale(Locale.US);// double sayının kullanımını 3.14 veya 3,14 gibisinden belirlemek icin.
        System.out.println("bir sayı giriniz");
        double a=zırt.nextDouble();
        System.out.println("a değişkeninin değeri = " + a);
        
        Scanner zort = new Scanner(System.in);
       // zırt.useLocale(Locale.US);// double sayının kullanımını 3.14 veya 3,14 gibisinden belirlemek icin.
        System.out.println("bir yazı giriniz");
        String b=zort.nextLine();
        System.out.println("b değişkeninin değeri = " + b);
        
        gain();
       // nein();
    }
    
}
