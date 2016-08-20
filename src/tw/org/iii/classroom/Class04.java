package tw.org.iii.classroom;

public class Class04
{
	public static void main(String[] args)
	{
		//1-12月
		int month =(int)(Math.random()*12+1);
		System.out.println(month);
		
		switch(month)
		{
		case 1:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28");
			break;
		case 3:
			System.out.println("31");
			break;
		case 4:
			System.out.println("30");
			break;
		case 5:
			System.out.println("31");
			break;
		case 6:
			System.out.println("30");
			break;
		case 7:
			System.out.println("31");
			break;
		case 8:
			System.out.println("31");
			break;
		case 9:
			System.out.println("30");
			break;
		case 10:
			System.out.println("31");
			break;
		case 11:
			System.out.println("30");
			break;
		case 12:
			System.out.println("31");
			break;
		default:
			System.out.println("XX");
			break;
		}
	}
}


//case 1: case 3: case 5: case 7: case8:
//case 10: case 12:
//	System.out.println("31");
//	break;
//case 4: case 6: case 9: case 11:
//	System.out.println("30");
//	break;
//case 2:
//	System.out.println("28");
//	break;
//default:
//	System.out.println("XX");
//	break;
	

