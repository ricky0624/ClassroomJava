package tw.org.iii.classroom;

class Bike2
{
	//Field屬性
	private double speed;
	
	//Constructor
	//名稱永遠跟類別名稱大小寫一模一樣
	Bike2()
	{
		speed=1;
		System.out.println("Bike():"+speed);
	}
	
	
	//Method方法
	void upSpeed()
	{
		speed = speed<1?1:speed*1.2;
	}
	void downSpeed()
	{
		speed = speed<1?1:speed*0.7;
	}
	//測速器
	double getSpeed()
	{
		return speed;
	}
}

