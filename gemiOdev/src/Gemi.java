
public class Gemi {
    
    private String gemiAdi;
    private String gemiInsaYil;

    public Gemi(String gemiAdi, String gemiInsaYil) {
        this.gemiAdi = gemiAdi;
        this.gemiInsaYil = gemiInsaYil;
    }
    
   @Override
   public String toString() {
      return String.format("Gemi adi : %s  Gemi insa yili : %s", 
        getGemiAdi(), getGemiInsaYil());
   }

 
    public String getGemiAdi() {
        return gemiAdi;
    }

    
    public void setGemiAdi(String gemiAdi) {
        this.gemiAdi = gemiAdi;
    }

     
    public String getGemiInsaYil() {
        return gemiInsaYil;
    }

     
    public void setGemiInsaYil(String gemiInsaYil) {
        this.gemiInsaYil = gemiInsaYil;
    }
    
    
}
