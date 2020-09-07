/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Lenovo
 */

public class Islemler {
    /**
     * 
     * Yığıtın elemnlarının sırasını tersine çevirir
     * @param s Tersine çevrilecek yığıt
     * @return Tersine çevirlmiş yığıtı döndürür
     */
     public static void main(String[] args) {
        // TODO code application logic here
    }
    public static <T> Stack<T> tersCevir(Stack<T> s){
        //Metodun gövdesini yazınız
        
        Stack<T> s2=(Stack<T>)s.clone();
        Stack<T> s3=new Stack<>();
      
        while (!s2.isEmpty()) {
       
           s3.push(s2.pop()) ;
           
            
        }
        
     
        
        
      
      
        
        return s3;
    }

    /**
     * İki yığıtın eşit olup olmadığını kontrol eder
     * @param s1 Birinci yığıt
     * @param s2 İkinci yığıt
     * @return İki yığıtın eşit olma durumunu döndürür
     */
    public static <T> boolean esit(Stack<T> s1, Stack<T> s2)
    {
        //Metodun gövdesini yazınız
         Stack<T> s3=(Stack<T>)s1.clone();
          Stack<T> s4=(Stack<T>)s2.clone();
          
         
        while (!s3.isEmpty() && !s4.isEmpty()) {
            if (s3.peek()==s4.peek()) {
                 s3.pop();
                 s4.pop();

            }
            else{
                  return false;
            }
           
            
            
        }
      return true;
    }

    /**
     * Postfix ifadeyi değerlendirir. İşlemler tamsayılar üzerinde gerçekleşir. "7 5 /" işleminin sonucu 1'dir.
     * @param girdi Girdi ifadesi
     * @return İfadenin sonucu
     */
    public static Integer postfixDegerlendir(String girdi) {
        //Metodun gövdesini yazınız
        Stack<Integer> s3=new Stack<>();
        
        char a;
        int b,d1,d2;
        
        for(int i=0;i<girdi.length();i++) {            
            a=girdi.charAt(i);
            
            if (Character.isDigit(a)){
                 b=a;
                s3.push(b);
                
            }else{
             
                d1=s3.pop();
                d2=s3.pop();
                 switch (a) {
                        case '+':
                            s3.push(d1 + d2);
                            break;
                        case '-':
                            s3.push(d1 + d2);
                            break;
                        case '*':
                             s3.push(d1 + d2);
                            break;
                        case '/':
                            s3.push(d1 + d2);
                            break;

                
                         
            }
           
        }
         
        
        
       
    }return s3.pop();}

    /**
     * Infix ifadeyi postfix'e dönüştürür.
     * @param girdi Infix girdi metni
     * @return Dönüştürülmüş postfix ifade
     */
    public static String infixToPostfix(String girdi){
        //Metodun gövdesini yazınız
        return null;
    }

    /**
     * Infix ifadeyi sembollerine ayıran metod
     * @param girdi Infix ifade
     * @return Sembol dizisi
     */
    private static String[] splitToTokens(String girdi)
    {
        StringTokenizer t=new StringTokenizer(girdi, "+-*/^() ",true);
        List<String> tokenList=new ArrayList<>();
        while (t.hasMoreTokens()){
            String s=t.nextToken().trim();
            if(!s.equals(""))
                tokenList.add(s);
        }
        String [] tl=new String[tokenList.size()];
        tokenList.toArray(tl);
        return tl;
    }
}
