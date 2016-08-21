package tw.org.iii.classroom;

public class Class15
{
	public static void main(String[] args)
	{
		//永遠用一維陣列去看,二維=一維裡面還有一維
		//執行結果：[[I@15db9742  [[代表二維陣列  I代表型別  @在  15db9742記憶體位置
		int[][] a;
		int [] b[];
		int c[][];
		int[] d=new int[2];
		int e = 2;
		a = new int[3][2];
		b = new int[4][];
		b[0]=new int[2];
		b[1]=new int[3];
		System.out.println(b.length);
		// c=new int[][3]; 不合理
		
		int[] f={1,2,3,4};
		System.out.println(f.length);
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		System.out.println(f);
		System.out.println("-----");
		f=new int[3];
		System.out.println(f);
		System.out.println(f.length);
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
	}
}
