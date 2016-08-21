package tw.org.iii.classroom;

public class Class18
{
	public static void main(String[] args)
	{
		int count=0;
		Bike myBike,urBike;
		myBike=new Bike();
		urBike=new Bike();
		System.out.println("myBike:"+myBike.getSpeed());
		System.out.println("urBike:"+urBike.getSpeed());
		
		System.out.println("---");
		while(myBike.getSpeed()<10)
		{
			myBike.upSpeed();
			count++;
		}
		System.out.println(count);

		
		urBike.upSpeed();
		urBike.upSpeed();
		urBike.downSpeed();
		System.out.println("myBike:"+myBike.getSpeed());
		System.out.println("urBike:"+urBike.getSpeed());
	}

}
