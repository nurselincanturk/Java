
import java.util.Arrays;


public class sifreleme {
    
        
    public StringBuilder sb=new StringBuilder();
       public String metin;
       public String anahtar; 
//  
      public char[] metindizisi;
        public char[] anahtardizisi;
        public char[] alfabe={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        public String alf="abcdefghijklmnopqrstuvwxyz";
        public int fark;
        public String eklenecek;
        public char[] anahtar2=null;
        public char[] metin2=null;
    int[] metinkod=null;
        int[] anahtarkod=null;
        public int sayi=0;

    public void sayisalcevirici(){
    
    
       
        if (metin.length() > anahtar.length()) {
            fark=metin.length()-anahtar.length();
            eklenecek=anahtar.substring(0, fark);
            sb.append(anahtar);
            sb.append(eklenecek);
            String a=sb.toString();
            anahtar2=a.toCharArray();
            metin2=metindizisi;
      
        
        }
         if (anahtar.length() > metin.length()) {
            fark=anahtar.length()-metin.length();
            eklenecek=metin.substring(0, fark);
            sb.append(metin);
            sb.append(eklenecek);
            String a=sb.toString();
            metin2=a.toCharArray();
            anahtar2=anahtardizisi;
            
         }  
        if (anahtar.length() == metin.length()) 
        {
            anahtar2=anahtardizisi;
            metin2=metindizisi;}
        
        
        
                  
        metinkod=new int[metin2.length]  ;        
        anahtarkod=new int[anahtar2.length];
        
        for (int i = 0; i < metin2.length; i++) {
            for (int j = 0; j < alfabe.length; j++) {
                if (metin2[i] == alfabe[j]) {
                    metinkod[i]=j+1;
                }
                 }
        }
     
          for (int i = 0; i < anahtar2.length; i++) {
            for (int j = 0; j < alfabe.length; j++) {
                if (anahtar2[i] == alfabe[j]) {
                    anahtarkod[i]=j+1;
                }
                 }
        }
       
        sayi=anahtarkod.length;
       System.out.println(Arrays.toString(metinkod));
        System.out.println(Arrays.toString(anahtarkod));
    
        System.out.println("\n");
    
    
    }
    
    
    
    
    public void sifre(){
    
       int[] sifrekod=new int[anahtarkod.length];
        for (int i = 0; i <sayi ; i++) {
            sifrekod[i]=metinkod[i]+anahtarkod[i];
        }
        System.out.println(Arrays.toString(sifrekod));
        
        
        
        int[] sifrekod2=new int[sifrekod.length];
        for (int i = 0; i < sifrekod.length; i++) {
            if (sifrekod[i]>26) {
               sifrekod2[i] =sifrekod[i]-26;
            }
            else{
            sifrekod2[i]=sifrekod[i];
            }
        }
        System.out.println(Arrays.toString(sifrekod2));
       System.out.println("sifre : ");
        for (int i = 0; i < sifrekod2.length; i++) {
            
            System.out.print(alfabe[sifrekod2[i]-1]);
//            System.out.print(alf.charAt(sifrekod2[i]));
            System.out.print(" ");
            
        }
        
        System.out.println("\n");
        
    
    
    
    
    }
    
    
}
