package prayaasa_CSCI201L_hw1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class MainMenu
{	
	public static void main(String[] args)
	{
		Scanner scanObject = new Scanner(System.in);
		String inputFilename;
		Gson gsonObject = new Gson();
		FileReader fr;
		JsonObject jObject = new JsonObject();
		boolean validFile = false;
		while(!validFile)
		{
			try
			{
				System.out.print("What is the name of the input file? ");
				inputFilename =  scanObject.nextLine();
				fr = new FileReader(inputFilename);
				jObject = gsonObject.fromJson(fr, JsonObject.class);
				validFile = true;
			} catch (FileNotFoundException | JsonIOException e)
			{
				System.out.println("That file could not be found.");
			} catch (JsonSyntaxException ex)
			{
				System.out.println("That file is not a well-formed JSON file.");
			}
		}
		//At this point, we have a valid file in our jObject.
		Calendar calendarInstance = new Calendar(jObject);
		
		
		scanObject.close();
	}

}
