
import java.util.Scanner;


public class Odev2sýfreleme {

    
    public static void main(String[] args) {
         
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("metni girin");
			String metin=scanner.nextLine();
			System.out.println("anahtarý girin");
			String anahtar=scanner.nextLine();
      
//        System.out.println(metin);
//        System.out.println(anahtar);
			sifreleme s=new sifreleme(); 
    

			s.metin=metin;
			s.anahtar=anahtar;
			
			s.metindizisi=metin.toCharArray();
			s.anahtardizisi=anahtar.toCharArray();
			
      s.sayisalcevirici();
      s.sifre();
		}

    }
    
}
