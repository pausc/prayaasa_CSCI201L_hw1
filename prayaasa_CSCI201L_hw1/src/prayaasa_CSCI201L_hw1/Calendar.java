package prayaasa_CSCI201L_hw1;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Calendar
{
	private List<User> Users = new ArrayList<User>();
	
	public Calendar(JsonObject obj)
	{
		JsonArray jUsers = (JsonArray) obj.get("Users");
		System.out.println(jUsers.toString());
	}
	
	public int AddUser(String firstName, String lastName)
	{
		User newUser = new User(firstName, lastName);
		Users.add(newUser);
		return Users.indexOf(newUser);
	}

}
