
public class Test {

    public static void main(String[] args) {
        Gemi gemi1=new Gemi("mavi", "1996");
        TuristikGemi turistikGemi1=new TuristikGemi("beyaz", "2000", 55);
        KargoGemisi kargoGemisi1=new KargoGemisi("siyah", "2003", 1000);
     
        
         Gemi[] gemi=new Gemi[3];
         gemi[0]=gemi1;
         gemi[1]=turistikGemi1;
         gemi[2]=kargoGemisi1;
         
           for (Gemi currentGemi : gemi) {
         System.out.println(currentGemi); 
           }
        
    }

}
