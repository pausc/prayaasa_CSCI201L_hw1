package prayaasa_CSCI201L_hw1;

public class Event
{
	private String _title;
	private String _time;
	private String _month;
	private String _day;
	private String _year;
	
	public Event(String title, String time, String month, String day, String year)
	{
		_title = title;
		_time = time;
		_month = month;
		_day = day;
		_year = year;
	}

	public String GetTitle()
	{
		return _title;
	}

	public String GetTime()
	{
		return _time;
	}

	public String GetMonth()
	{
		return _month;
	}

	public String GetDay()
	{
		return _day;
	}

	public String GetYear()
	{
		return _year;
	}

}
