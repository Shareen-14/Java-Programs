import java.util.*;

class Program149
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
        String str;

		System.out.println("Enter your name");
		str = sobj.nextLine();

		Marvellous mobj = new Marvellous();
		mobj.Display(str);
	}
}

class Marvellous
{
	public static void Display(String Data)
	{
		System.out.println("Welcome : "+Data);
	}
}