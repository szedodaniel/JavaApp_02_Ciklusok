
package ciklusok;

import java.util.Random;
import java.util.Scanner;

public class Ciklusok {

   
    public static void main(String[] args) {
    
        //9.feladat
      //  harommalEsOttelOszthatoTermeszetesSzamok(1000);
      //10.feladat
        //bonyolultFeladat();
        //11.feladat
      //  pozitivParatlanSzamokOsszege(234);
      //12.feladat
       // penzFelosztas(50);
       //13.feladat
       
        talaltSzam();
        
      
           
       
        
    }
   
    public static void harommalEsOttelOszthatoTermeszetesSzamok(int szam){
       for (int i = 0; i <= szam; i++) {
           if(i%3 == 0 && i%5 == 0){
               System.out.print(i+",");
           }
       }
        
   }
   public static void bonyolultFeladat(){
    Scanner sc = new Scanner(System.in);
    int parosDB= 0;
    int paratlanDb = 0;
    
    int osszeg = 0;
    int szam;
    do{
        System.out.println("Kérem adjon meg egy számot: ");
        szam = sc.nextInt();
        osszeg +=szam;
        if(szam%2 == 0)
        {
            parosDB++;
            
        }else
        {
            paratlanDb++;
        }
    }while(osszeg < 100);
       System.out.println("Páros számok: "+parosDB+" db");
           System.out.println("Páratlan számok: "+paratlanDb+" db");
               System.out.println("Összeg: "+osszeg+" db");
   }
   public static void pozitivParatlanSzamokOsszege(int N){
      int osszeg = 0;
      int i = 1;
       do{       
           System.out.println(osszeg);
           osszeg+=i;
           i+=2;
    
           
       }while(osszeg < N);
       
   } public static void penzFelosztas(int penz){
       int[] fizetoeszkoz = {20000,10000,5000,2000,1000,500,200,100,50,20,10,5};
    
       int kerekitettErtek = (int)(Math.round(penz/5.0)*5);
       System.out.println(kerekitettErtek);
       int i = 0;
       do{
          int db= kerekitettErtek/fizetoeszkoz[i];
          if(db > 0){
              System.out.println(fizetoeszkoz[i]+" Ft"+ db +" db");
          }
          kerekitettErtek %= fizetoeszkoz[i];
          i++;
          
       }while(kerekitettErtek > 0);

   }
   public static void talaltSzam(){
       Scanner sc = new Scanner(System.in);
       Random r = new Random();
      
       int szam = r.nextInt(1+100);
       System.out.println("Gondoltam egy 1 és 100 közötti számot!"+szam);
      int tipp = sc.nextInt();
      
      while(szam != tipp){
          
       if(tipp < szam){
           
           System.out.println("nagyobbra gondoltam");
           
       }else{
          
           System.out.println("kisebbre gondoltam");
       }
       
       tipp = sc.nextInt();
      }
      if(tipp != 0){
          System.out.println("Ön nyert!");
      } 
      
   }
        
   
    
}
