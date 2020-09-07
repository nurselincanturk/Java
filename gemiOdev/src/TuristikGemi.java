
public class TuristikGemi extends Gemi{
    private int maxYolcuSayisi;
    
    public TuristikGemi(String gemiAdi, String gemiInsaYil,int maxYolcuSayisi) {
        super(gemiAdi, gemiInsaYil);
        this.maxYolcuSayisi=maxYolcuSayisi;
        
    }
    


    @Override
    public String toString() {
        
        return super.toString()+ String.format("  max yolcu sayisi: %s",getMaxYolcuSayisi());
    }

  


    
    public int getMaxYolcuSayisi() {
        return maxYolcuSayisi;
    }

     
    public void setMaxYolcuSayisi(int maxYolcuSayisi) {
        this.maxYolcuSayisi = maxYolcuSayisi;
    }
    
}
