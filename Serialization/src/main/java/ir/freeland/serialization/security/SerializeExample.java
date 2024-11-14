package ir.freeland.serialization.security;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1 . Saving an Object to a File: When you want to persist an object to a file for later retrieval.
//2 . Sending an Object Over a Network: When you need to transmit an object to another machine over a network (e.g., in RMI or web services).
//3 . Storing Objects in a Database: When you want to save the state of an object in a database.
public class SerializeExample {
    public static void main(String[] args) {
    	String acountalic[]= {"a","b","c"};
    	List<String> a=Arrays.asList(acountalic);
    	
    	String acountali[]= {"q","y","x"};
    	List<String> ali=Arrays.asList(acountali);
    	
    	String acountaghazale[]= {"e","t","z"};
    	List<String> g=Arrays.asList(acountaghazale);
    	
        User user1 = new User("Alice", "foo",30,"11100025",a);
        User user2 = new User("Ali", "too",30,"11100026",ali);
        User user3 = new User("ghazale", "moo",30,"11100027",g);
        
        try (FileOutputStream fileOut = new FileOutputStream("user.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
        	out.writeObject(user1);
        	//out.writeObject(user2);
            //out.writeObject(user3);
            System.out.println("Serialized data is saved in user.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}