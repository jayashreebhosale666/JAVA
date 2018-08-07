
enum Day
{
	SUNDAY,MONDAY,WEDNESDAY,TUESDAY,THURSDAY,FRIDAY,SATURDAY;
	
}
public class EnumSwitch {
	Day day;
	public EnumSwitch(Day day) {
		this.day=day;
	}
	void dayLike()
	{
			switch(day)
			{
			
			case MONDAY:System.out.println("Monday is bad.");
				break;
			case FRIDAY:System.out.println("Fridays are better.");
				break;
			case SATURDAY:
			case SUNDAY: System.out.println("Weekends are fun.");
				break;
			default:System.out.println("Other days are so--so.");
				break;
			
			}
	}
public static void main(String args[])
{

	EnumSwitch e=new EnumSwitch(Day.valueOf("SUNDAY"));
	e.dayLike();
	EnumSwitch e32=new EnumSwitch(Day.valueOf("FRIDAY"));
	e32.dayLike();
	EnumSwitch e1=new EnumSwitch(Day.valueOf("WEDNESDAY"));
	e1.dayLike();
	

}
}
/*
Weekends are fun.
Fridays are better.
Other days are so--so.
*/
