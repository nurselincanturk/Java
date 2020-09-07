import com.mysql.jdbc.Connection;

import java.sql.DriverManager;


public class proje {
    
    
     public static Connection getConnection(){
    
    Connection con=null;
    
        try {
           Class.forName("com.mysql.jdbc.Driver");
           con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/demo","root","");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    
    
    
    return con;  
    }
}
