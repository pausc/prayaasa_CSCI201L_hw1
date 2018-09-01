package prayaasa_CSCI201L_hw1;

import java.util.ArrayList;
import java.util.List;

public class User
{
	private String _firstName;
	private String _lastName;
	private List<Event> Events = new ArrayList<Event>();
	
	public String GetFirstName()
	{
		return _firstName;
	}
	
	public String GetLastName()
	{
		return _lastName;
	}

	public User(String firstName, String lastName)
	{
		_firstName = firstName;
		_lastName = lastName;
	}
	
	public void AddEvent(String title, String time, String month, String day, String year)
	{
		Events.add(new Event(title, time, month, day, year));
	}

}
