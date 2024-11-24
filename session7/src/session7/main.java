package session7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class main {
	private static final String URL="jdbc:sqlite:test2.db";
	public static void main(String[] args) throws SQLException {
		
		String countryname="iran";
		String sql="""
				select *
				from department,country
				where department.id=country.id and country.name= ?
				
				""";
		System.out.println("connecting...");
		Connection connection=null;
		connection=DriverManager.getConnection(URL);
		System.out.println("connected...");
		PreparedStatement preparedstatment= connection.prepareStatement(sql);
		preparedstatment.setString(1, countryname);
		
		ResultSet resultset=preparedstatment.executeQuery();
		
		while (resultset.next()) {
			country c1=new country();
			department d1= new department();
			
			c1.setName(resultset.getString("name"));
			d1.setId(resultset.getInt("id"));
			d1.setName(resultset.getString("name"));
			
			System.out.println(d1.toString());
			System.out.println(c1.toString());
		}
		
		
		
		
	}

}
