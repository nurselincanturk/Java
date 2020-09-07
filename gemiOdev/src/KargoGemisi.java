
public class KargoGemisi extends Gemi{
    private int kargoKapasitesi;
    public KargoGemisi(String gemiAdi, String gemiInsaYil,int kargoAgirligi) {
        super(gemiAdi, gemiInsaYil);
        this.kargoKapasitesi=kargoAgirligi;
    }
    @Override
    public String toString() {
        
        return super.toString()+ String.format("  kargo kapasitesi: %s",getKargoKapasitesi());
    }

     
    public int getKargoKapasitesi() {
        return kargoKapasitesi;
    }

     
    public void setKargoKapasitesi(int kargoKapasitesi) {
        this.kargoKapasitesi = kargoKapasitesi;
    }
    
}
