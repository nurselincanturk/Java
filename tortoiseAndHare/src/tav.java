
import java.util.Random;


public class tav {
     int konumT = 1;
        public int sleep()
        {
            setKonumT(getKonumT() + 0);
            
            return getKonumT();
        }
        public int bigHoop()
        {
            setKonumT(getKonumT() + 9);
            return getKonumT();
        }
        public int bigSlip()
        {
            setKonumT(getKonumT() - 12);
            return getKonumT();
        }
        public int smallHoop()
        {
            setKonumT(getKonumT() + 1);
            return getKonumT();
        }
        public int smallSlip()
        {
            setKonumT(getKonumT() - 2);
            return getKonumT();
        }
        
        
        public void random(){
             Random rand = new Random();
            int Sayi = rand.nextInt(10)+1;
              switch(Sayi){
                case 1:
                case 2:
//                   
                    sleep();
                    break;
                case 3:
                case 4:
//                     
                     bigHoop();
                    break;
                case 5:
//                   
                     bigSlip();
                    break;
                case 6:
                case 7:
                case 8:
//                 
                     smallHoop();
                case 9:
                case 10:
//                   
                     smallSlip();
                    break;
        
      
                          }
                    
            
            
            
        }

    /**
     * @return the konumT
     */
    public int getKonumT() {
        if (konumT<0) {
            konumT=1;
        }
        return konumT;
    }

    /**
     * @param konumT the konumT to set
     */
    public void setKonumT(int konumT) {
        this.konumT = konumT;
    }
}
