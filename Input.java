package Input;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
public class Input extends InputScanner
{
	public static String getPassword ()
    {
		Console c = System.console();
	    if (c == null) 
	    { //IN ECLIPSE IDE
	        InputStream in = System.in;
	        int max=50;
	        byte[] b=new byte[max];
	        
	        int l = 0;
	        try
	        {
	        	l = in.read(b);
	        }
	        
	        catch(IOException ioe)
	        {
	        	System.out.println("I/O operation failed.");
	        }
	        
	        catch(Exception e)
	        {
	        	System.out.println("Unexpected Error Occoured");
	        }
	        
	        l--;//last character is \n
	        if (l > 0) 
	        {
	            byte[] e = new byte[l];
	            System.arraycopy(b, 0, e, 0, l);
	            return new String(e);
	        } 
	        
	        else 
	        {
	            return null;
	        }
	    } 
	    
	    else 
	    { //Outside Eclipse IDE
	        return new String(c.readPassword());
	    }
	}
}