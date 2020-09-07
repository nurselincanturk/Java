package mukemmelsayi;
import java.util.Scanner;
public class MukemmelSayi {

    
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int sayac=0;

        System.out.println("Sayi giriniz: ");

        int sayi = scan.nextInt();

        for (int i=1;i<=sayi/2;i++){

        if(sayi%i==0){

        sayac+=i;

        }

        }

        if(sayac==sayi) System.out.println(sayi+" sayisi mukemmel sayidir.");

        else System.out.println(sayi+" sayisi mukemmel sayi degildir.");
    
        
    }
    
}
