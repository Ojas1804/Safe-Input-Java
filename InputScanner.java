package Input;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class InputScanner 
{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static Scanner strIn = new Scanner(System.in);
	
	public static int getInt()
	{
		int i = Integer.MAX_VALUE;
		try
		{
			return(Integer.parseInt(strIn.nextLine()));
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Inputs with integer datatype are accepted only.");
		}
		
		catch(Exception e)
        {
        	System.out.println("Unexpected Error Occoured");
        }
		
		return(i);
	}
	
	public static float getFloat()
	{
		try
		{
			return(Float.parseFloat(strIn.nextLine()));
		}
		catch(NumberFormatException e)
		{
			System.out.println("Inputs with float datatype are accepted only.");
		}
		return Float.MAX_VALUE;
	}
	
	public static double getDouble()
	{
		try
		{
			return(Double.parseDouble(strIn.nextLine()));
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Inputs with double datatype are accepted only.");
		}
		
		catch(Exception e)
        {
        	System.out.println("Unexpected Error Occoured");
        }
		
		return Double.MAX_VALUE;
	}
	
	public static byte getByte()
	{
		try
		{
			return(Byte.parseByte(strIn.nextLine()));
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Inputs with Byte datatype are accepted only.");
		}
		
		catch(Exception e)
        {
        	System.out.println("Unexpected Error Occoured");
        }
		
		return Byte.MAX_VALUE;
	}
	
	public static boolean getBoolean()
	{
		try
		{
			String str = strIn.nextLine();
			if((str.equals("true") || str.equals("false")) == false)
			{
				throw new NumberFormatException();
			}
			return(Boolean.parseBoolean(str));
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Inputs with boolean datatype are accepted only.");
		}
		
		catch(Exception e)
        {
        	System.out.println("Unexpected Error Occoured");
        }
		
		return false;
	}
	
	public static String getString()
	{
		try
		{
			return(strIn.nextLine());
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
	}
	
	public static long getLong()
	{
		try
		{
			return(Long.parseLong(strIn.nextLine()));
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Inputs with Long datatype are accepted only.");
		}
		
		catch(Exception e)
        {
        	System.out.println("Unexpected Error Occoured");
        }
		
		return Long.MAX_VALUE;
	}
	
	public static short getShort()
	{
		try
		{
			return(Short.parseShort(strIn.nextLine()));
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Inputs with Short datatype are accepted only.");
		}
		
		catch(Exception e)
        {
        	System.out.println("Unexpected Error Occoured");
        }
		
		return Short.MAX_VALUE;
	}
	
	public static BigInteger getBigInteger()
	{
		try
		{
			String str = strIn.nextLine();
			BigInteger bi = new BigInteger(str);
			return(bi);
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Inputs with Short datatype are accepted only.");
		}
		
		catch(Exception e)
        {
        	System.out.println("Unexpected Error Occoured");
        }
		
		return BigInteger.ONE;
	}
	
	public static BigDecimal getBigDecimal()
	{
		try
		{
			String str = strIn.nextLine();
			BigDecimal bd = new BigDecimal(str);
			return(bd);
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Inputs with Short datatype are accepted only.");
		}
		
		catch(Exception e)
        {
        	System.out.println("Unexpected Error Occoured");
        }
		
		return BigDecimal.ONE;
	}
}
