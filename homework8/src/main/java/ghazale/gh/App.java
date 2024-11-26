package ghazale.gh;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import accounts.account;
import accounts.transaction;
import ghazale.gh.model.person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	System.out.println( "Hello World!" );
    	File flie =new File("test.json");
    	ObjectMapper objectmapper = new ObjectMapper();
    	person p1 = objectmapper.readValue(flie , person.class );
    	 System.out.println( p1 );
    	 p1.toString();
    	 
        System.out.println( "Hello World!" );
        
  
    	ObjectMapper objectmapper2 = new ObjectMapper();
    	person p2 = objectmapper2.readValue(flie , person.class );
    	 System.out.println( p2 );
    	 p1.toString();
    	 
        System.out.println( "Hello World!" );
        
        File flie2 =new File("acocount.json");
        
        ObjectMapper o3 = new ObjectMapper();
        //transaction ta= o3.readValue(flie2,  transaction.class);
        account a = o3.readValue(flie2 ,  account.class);

       
        System.out.println(  a.toString() );
    }
}
