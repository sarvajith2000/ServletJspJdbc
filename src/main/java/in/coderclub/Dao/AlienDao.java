package in.coderclub.Dao;
import java.sql.*;
import in.coderclub.model.Alien;

public class AlienDao {
	
	public  Alien getAlien(int aid) {
		
		Alien alien = new Alien();
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alien", "root", null);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from alien where aid ="+aid);
		    if(rs.next())
		    {
		    	alien.setAid(rs.getInt("aid"));
		    	alien.setAname(rs.getString("aname"));
		    	alien.setColor(rs.getString("color"));
		    }
			 
			
		}
		catch(Exception e ) {
			System.out.println(e);
			
		}
		
		return alien;
	}

	
	
	
}
