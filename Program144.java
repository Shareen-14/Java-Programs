import java.util.*;

class Program144
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 0, iCnt = 0, iRet = 0;

		System.out.println("Enter Number of Elements");
		iSize = sobj.nextInt();
		int Arr[] = new int[iSize];
		//Arr = (int*)malloc(sizeof(int)*iSize);

		System.out.println("Enter numbers");
		for(iCnt = 0; iCnt<Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
			//scanf("%d",&Arr[iCnt]);
		}

		Marvellous mobj = new Marvellous();
		iRet = mobj.Add(Arr);
		//iRet = Add(Arr, iSize);

		System.out.println("Addition is : "+iRet);
	}
}

class Marvellous
{
	public int Add(int Brr[])
	{
		int iSum = 0, iCnt = 0;
		for(iCnt = 0; iCnt < Brr.length; iCnt++)
		{
			iSum = iSum + Brr[iCnt];
		}
		return iSum;
	}
}