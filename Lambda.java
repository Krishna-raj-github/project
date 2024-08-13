import java.util.Scanner;
interface I1
{
	static Scanner sc = new Scanner(System.in);
	public String m1(int aa);
	default int m3(String ss)
	{
		System.out.println(ss);
		return sc.nextInt();
	}
}
interface I2
{
	static Scanner sc = new Scanner(System.in);
	public int m3(String ss);
	default String m1(int aa)
	{
		System.out.println(aa);
		return sc.next();
	}
	
	public static void main(String[] args)
	{
		I1 obj = aa -> { System.out.println("lambda");
			return sc.next();
		};
		System.out.println(obj.m1(sc.nextInt()));

		I2 obj2 = ss -> { System.out.println("lambdaa");
			return sc.nextInt();
		};
		System.out.println(obj2.m3(sc.next()));

		System.out.println(obj.m3(sc.next()));
		System.out.println(obj2.m1(sc.nextInt()));

	}
}