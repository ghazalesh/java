package ghazale.session08;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import myexception.employeeexception;
import service.employee;
import service.services;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws StreamReadException, DatabindException, IOException, employeeexception, SQLException
    {
    	LogManager.getLogManager().readConfiguration(new FileInputStream("loggerfile.properties"));
    	
        System.out.println( "Hello World!" );
       List<employee> em1= services.readservice("employee.json");
       services.savetodb(em1);
    }
}
