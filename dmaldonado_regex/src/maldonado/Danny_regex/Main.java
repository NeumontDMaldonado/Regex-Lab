package maldonado.Danny_regex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		FileReader input = null;
		try 
		{
			input = new FileReader("Fish.html");
		} 
		catch (FileNotFoundException e) 
		{
			System.err.println("No file found");
			e.printStackTrace();
		}
		BufferedReader reader = new BufferedReader(input);
		
		String text = "";
		while(reader.ready())
		{
			text = reader.readLine();
			Regex.printUrls(text);
		}
	}
}