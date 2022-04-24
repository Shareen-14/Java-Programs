import java.util.*;
import MarvellousNumbers.ArrayX;

class Program146
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0, iRet = 0;

		System.out.println("Enter the number of elements");
		iLength = sobj.nextInt();

		Marvellous mobj = new Marvellous(iLength);
		mobj.Accept();
		mobj.Display();
		iRet = mobj.Add();
		System.out.println("Addition is : "+iRet);
	}
}
