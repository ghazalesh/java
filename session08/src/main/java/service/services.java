package service;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import myexception.employeeexception;

public class services {
	private static final Logger log = Logger.getLogger(services.class.getName());
	
	public static List<employee> readservice(String filename)  throws employeeexception{
		List<employee> employeelist = new ArrayList<>();

		File flie = new File("employee.json");

		ObjectMapper objectmaper = new ObjectMapper();
		List<employee> emp2=null;
		try {
			emp2 = objectmaper.readValue(flie, new TypeReference<List<employee>>() {});
		} catch (DatabindException e) {
			
			log.warning("can not bind");
			throw new employeeexception("filed binded", e);
			
		} catch (IOException e) {
			log.severe("can not found file");
			throw new employeeexception("filed file "+filename, e);
			
		}
		
		for (employee employee : emp2) {
			System.out.println(employee.toString());
		}
		
		return emp2;

	}
	
	public static void savetodb (List<employee> listemlpyee ) throws SQLException
	{
		String URL = "jdbc:sqlite:employee.db";
		String SQL = "insert into employees(fname,lname,age,salary,email) values(?,?,?,?,?)";
		
		Connection connection = DriverManager.getConnection(URL);
		PreparedStatement preparedstatment =connection.prepareStatement(SQL);		
		for (employee employee : listemlpyee) {
			preparedstatment.setString(1, employee.getFirstname());
			preparedstatment.setString(2, employee.getLastname());
			preparedstatment.setInt(3, employee.getAge());
			preparedstatment.setInt(4, employee.getSalary());
			preparedstatment.setString(5, employee.getEmail());
			preparedstatment.executeUpdate();
		}
		
		
		
		
	}
	
	
	
	
}
