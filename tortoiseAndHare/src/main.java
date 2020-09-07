
import java.util.Scanner;


public class main {

    
        
    public static void main(String[] args) {
               
     int a=0;
   Scanner input =new Scanner(System.in);
        System.out.println("kaplumbaga sayisini giriniz");
        int kapsayi=input.nextInt();
        System.out.println("tavsan sayini giriniz");
        int tavsayi=input.nextInt();
        kap[] kaplumbaga=new kap[kapsayi];
        tav[] tavsan=new tav[tavsayi];
      //  int[] sıralama=new int[tavsayi+kapsayi];
       char[][] siralama=new char[tavsayi+kapsayi][3];
        for (int i = 0; i < kapsayi; i++) {
           
            kaplumbaga[i]=new kap();
        }
       for (int i = 0; i < tavsayi; i++) {
           
            tavsan[i]=new tav();
        }
  
     while (a<71) {  
         
      
         for (int i = 0; i < kapsayi; i++) {
            kaplumbaga[i].random();
        }
        for (int i = 0; i < tavsayi; i++) {
            tavsan[i].random();
        }
         for (int i = 0; i < kapsayi; i++) {            
        	 siralama[i][0]='K';
        	 siralama[i][1]=(char) (i+1);
        	 siralama[i][2]=(char) kaplumbaga[i].getKonumK();
         }
         int b=kapsayi;
        for (int i = 0; i < tavsayi; i++) {
           
        	siralama[b][0]='T';
        	siralama[b][1]=(char) (i+1);
        	siralama[b][2]=(char) tavsan[i].konumT;
           
            b++;
          }

char tmp;
            char tmp1;
            char tmp2;
            for (int i = 0; i < kapsayi+tavsayi ; i++)
	 {
		 for ( int j = i+1; j < kapsayi+tavsayi; j++)
		 {
			 if (siralama[i][2]>siralama[j][2])
			 {
				 tmp =  siralama[i][2];
				 siralama[i][2] = siralama[j][2];
				 siralama[j][2] =  tmp;
                                
                                 tmp1 = siralama[i][0];
                                 siralama[i][0] = siralama[j][0];
                                 siralama[j][0] = tmp1;

				
                                 tmp2 = siralama[i][1];
                                 siralama[i][1] = siralama[j][1];
                                 siralama[j][1] = tmp2;
			 }
		 }
	 }
            
            for (int i = 0; i < siralama[0][2]; i++) {
                System.out.print("-");
            }
            System.out.print(siralama[0][0]); System.out.print((int)siralama[0][1]);
            for (int i = 0; i < siralama.length-1; i++) {
                for (int j = 0; j < siralama[i+1][2]-siralama[i][2]; j++) {
                    
                    System.out.print("-");
                    
                }
                if (siralama[i+1][2]==siralama[i][2]) {
                    System.out.print("Ouch");
                }
                else{
                System.out.print(siralama[i+1][0]);System.out.print((int)siralama[i+1][1]);}
            }
            a=siralama[kapsayi+tavsayi-1][2];
        
            for (int i = 0; i < 71 - a; i++)
                    {
                        System.out.print("-");
                    }
                    System.out.println("\n");
                
                System.out.println("\n\n");
            
     }
     
     for (int i = 0; i < kapsayi+tavsayi; i++) {
         
         for (int j = 0; j < 10; j++) {
                if (siralama[i][2]>= 70 && siralama[j][2] >= 70)
                {
                    System.out.println("BERABERE");
                }
            
                else if (siralama[i][2] >= 70)
                 {
                    if (siralama[i][0]=='K') {
                         System.out.println("K"+(int) siralama[i][1]+"   KAZANDI. YUHH!! ");
                    break;
                    }
                    else if (siralama[i][0]=='T') {
                           System.out.println("T"+(int) siralama[i][1]+"   KAZANDI. YUHH!! ");
                    break;
                    }
                    
                       
                }}
          
     
     }
     
     
      
//        for (int i = kapsa2yi; i < tavsayi+kapsayi; i++) {
//             if (sıralama[i][2] >= 70)
//                {
//                    
//                        System.out.println("T"+(int) sıralama[i][1]+"   KAZANDI. YUHH!! ");
//                    break;
//                  }
//           
//          }
                  
                
          
           
            
//        for (int i = 0; i < kapsayi+tavsayi; i++) {
//            if (kaplumbaga[i].konumK >= 70)
//                {
//                    System.out.println("K"+(int) sıralama[i+1][1]+"   KAZANDI. YUHH!! ");
//                    break;
//                }
//            else if (tavsan[i].konumT >= 70)
//                {
//                    System.out.println("T"+(int) sıralama[i+1][1]+"   KAZANDI. OLEYYYY!!!!");
//                    break;
//                }
//            else{ for (int j = 0; j < 10; j++) {
//                if (tavsan[i].konumT >= 70 && kaplumbaga[j].konumK >= 70)
//                {
//                    System.out.println("BERABERE");
//                }
//            }}
    
                 System.out.println("\n");
        }
       
          
        }
    

