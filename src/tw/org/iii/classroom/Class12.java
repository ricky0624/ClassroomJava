package tw.org.iii.classroom;

public class Class12 
{
	public static void main(String[] args)
	{
		int[] a;
		int b[];
		int c; c=12;
		//new產生空間配置物件
		a = new int[7];
		a[2]=12;
		a[5]=100;
		a[6]=7;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("-----");
		int[] d= new int[3];
		int[] e= new int[]{1,2,3,5,7};
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
		System.out.println("-----");
		int[] f = {1,2,3,5,7};
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
	}
}
