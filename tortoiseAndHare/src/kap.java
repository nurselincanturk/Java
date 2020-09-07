
import java.util.Random;


public class kap {
     private int konumK=1;
    private int a;
        public int fastPlod()
        {
            setKonumK(getKonumK() + 3);
            return getKonumK();
        }
        public int slip()
        {
            setKonumK(getKonumK() - 6);
            return getKonumK();
        }
        public int slowPlod()
        {
            setKonumK(getKonumK() + 1);
            return getKonumK();
        }
         
         public void random() {
             Random rand = new Random();
            int Sayi = rand.nextInt(10)+1;
            
            
            switch(Sayi){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                   fastPlod();
                    break;
                case 6:
                case 7:
                  slip();
                break;
                case 8:
                case 9:
                case 10:
                   slowPlod();
                    break;
        
                        }
         }
   
    public int getKonumK() {
        if (konumK<0) {
            konumK=1;
        }
        
        return konumK;
    }

    /**
     * @param konumK the konumK to set
     */
    public void setKonumK(int konumK) {
        this.konumK = konumK;
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }
        
        
        
     
}
