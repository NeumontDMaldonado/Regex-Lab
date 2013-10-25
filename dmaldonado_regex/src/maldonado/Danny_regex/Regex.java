package maldonado.Danny_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex 
{
	public static void printUrls(String text)
	{
		String path = null;
		String regex = "http://([w]*[.]?[a-z]+[.]?[a-z]*[.][a-z]{3})([/]?[a-z]*[/]*[a-z]*[-]?[.]*[0-9]*[.]*[a-zA-Z]*)";
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(text);
		if(match.find())
		{
			System.out.println("URL: " + match.group());
			System.out.println("Domain: " + match.group(1));
			if(match.group(2).equals(""))
			{
				path = "not present";
			}
			else
			{
				path = match.group(2);
			}
			System.out.println("Path: " + path);
		}
		else
		{
			System.out.println("\""+text + "\" is an invalid URL");
		}
	}
}
