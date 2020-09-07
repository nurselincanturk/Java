
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
      
        
        
        
        
         
        Scanner scanner=new Scanner(System.in);
        System.out.println("Faktöriyelini bulmak için sayi giriniz");
        int sayi=scanner.nextInt();
        int a=factorial(sayi);
        System.out.println("Girdiginiz sayinın faktöriyel sonucu:"+a);
        System.out.println("Yaklasık e sayisini bulmak icin terim sayisi giriniz");
        int sayi2=scanner.nextInt();
        double b=esayisi(sayi2);
        System.out.println("Girdiginiz sayiyiya göre yaklasık e sayisi:"+b);

           
         

    }
      public static int factorial(int x)
  {
       
       
            int factorial=1;
            for (int i = x; i >1; i--) 
            {
                factorial=factorial*i;
            
            }
            

             return factorial;

   }  
      
        public static double esayisi(int x)
  {
       
        double deger=1;
            for (int i = 1; i < x; i++) 
            {
                double a=factorial(i);
                
                deger=deger+(1/a);
            
            }
        

          return deger;          

   }  
 }
    
    

