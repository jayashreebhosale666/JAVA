enum Car
{
	lamborgini(300),tata(100),audi(150),fiat(200),maruti(230);
	private int price;
	private Car(int p) {
		// TODO Auto-generated constructor stub
		price=p;
	}
 int getPrice()
	{
	return price;	
	}
}
public class EnumConstructor {

	public static void main(String[] args) {
	      System.out.println("All car Speed:");

		for(Car c:Car.values())
		{
			System.out.println(c+" Speed is "+c.getPrice()+" km/hrs");
		}
	}

}
