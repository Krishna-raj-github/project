import java.util.*;
class Mock4
{
	static Scanner sc = new Scanner(System.in);
	Mock4(int a)
	{
		System.out.println("First constructor");
	}
	Mock4()
	{
		this(sc.nextInt());
		System.out.println("Second constructor");
	}
	void m1(int a)
	{
		System.out.println("First Method");
	}
	void m1(String a)
	{
		System.out.println("Second Method");
	}
}
class Override extends Mock4
{
	void m1(int a)
	{
		System.out.println("Method Overrided");
	}
	public static void main(String[] args)
	{
		Override or = new Override();
		or.m1(sc.nextInt());
		or.m1(sc.next());
		Mock4 m = new Mock4();
		m.m1(sc.nextInt());
	}
}

