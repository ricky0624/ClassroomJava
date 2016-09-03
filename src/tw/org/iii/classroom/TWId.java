package tw.org.iii.classroom;

// 20160903測試一下
// 身分證 => 地區、性別、驗證
public class TWId
{
	private String id =null;
	static String check="ABCDEFGHJKLMNPQRSTUVXYWZIO";
	
	//建構式
	TWId()
	{
		this((int)(Math.random()*2)==0,(int)(Math.random()*26));
	}
	TWId(boolean gender)
	{
		this(gender,(int)(Math.random()*26));
	}
	TWId(int area)
	{
		this((int)(Math.random()*2)==0,area);
	}
	TWId(boolean gender,int area)
	{
//		String c0=check.substring(area, area-1);
//		String c1=gender?"1":"2";
//		String c2="" + (int)(Math.random()*10);
		StringBuffer temp = new StringBuffer(check.substring(area, area+1));
		//id=check.substring(area, area+1);
		temp.append(gender?"1":"2");
		//id+=gender?"1":"2";
		for(int i=0;i<7;i++)
		{
			temp.append((int)(Math.random()*10));
			//id+=(int)(Math.random()*10);
		}
		for(int i=0;i<10;i++)
		{
			if(isRight(temp.toString() + i))
			{
				id = temp.append(i).toString();
				break;
			}
		}
	}
	TWId(String id)
	{
		this.id=id;
	}
	//傳回身分證字串
	String getId()
	{
		return id;
	}
	//傳回性別
	boolean getGender()
	{
		return id.charAt(1)=='1';
	}
	//傳回地區
	String getArea()
	{
		//可以使用字串陣列
		return "台中市";
	}
	//是否正確=>通過驗證
	static boolean isRight(String testId)
	{
		boolean ret = false;
		//{n}=>指定n次
		//{n,m}=>指定出現n~m次
		//{n,}=>指定n次以上
		//手機=>("09[0-8][0-9]-[0-9]{6}$")
		//Email、IP、家電、日期都是很好範例
		if(testId.matches("^[A-Z][12][0-9]{8}$"))
		{

			int n12 = check.indexOf(testId.charAt(0))+10;
			int n1 = n12/10;
			int n2 = n12%10;
			//B120863158
			int n3 = Integer.parseInt(testId.substring(1,2));
			int n4 = Integer.parseInt(testId.substring(2,3));
			int n5 = Integer.parseInt(testId.substring(3,4));
			int n6 = Integer.parseInt(testId.substring(4,5));
			int n7 = Integer.parseInt(testId.substring(5,6));
			int n8 = Integer.parseInt(testId.substring(6,7));
			int n9 = Integer.parseInt(testId.substring(7,8));
			int n10= Integer.parseInt(testId.substring(8,9));
			int n11= Integer.parseInt(testId.substring(9,10));
			int total= n1*1 + n2*9 + n3*8 + n4*7 + n5*6 +
					n6*5 + n7*4 + n8*3 + n9*2 + n10*1 + n11*1;
			ret = total % 10 == 0;
		}
		else
		{
			ret=false;
		}
		return ret;
	}
// 未完成的另一種寫法
//	static boolean preCheck(String testId)
//	{
//		boolean isOK=false;
//		if(testId.matches(""))
//		{
//			isOK=true;
//		}
//		return isOK;
//		if(testId.length()==10)
//		{
//			if(testId.charAt(1)=='1' || testId.charAt(1)=='2')
//			{
//				// 抽出第一碼=> testId.charAt(0)
//				// 是否為A-Z=> "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexof();
//			}
//		}
		
}
