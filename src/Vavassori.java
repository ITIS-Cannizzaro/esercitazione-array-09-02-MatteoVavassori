import java.util.Scanner;

public class Vavassori
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				case 1:
					primoes();
				break;
				case 2:
					
				break;
				case 3:
					
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		System.out.println("1 - Es n. * - Titolo es. *");
		System.out.println("2 - Es n. * - Titolo es. *");
		
	}
	static void primoes()
	{
		int[] array1= new int[5];
		for (int i=0;i<array1.length;i++)
		{
			System.out.println("inserire numero");
			array1[i]=Integer.parseInt(in.nextLine());
		}
		int[] array2= new int[5];
		for (int i=0;i<array2.length;i++)
		{
			System.out.println("inserire numero");
			array2[i]=Integer.parseInt(in.nextLine());
		}
		
		int[] array3= new int[array1.length + array2.length];
		for (int i=0;i<array1.length;i++)
		{
			array3[i]= array1 [i];
		}
		for(int j=0; j<array2.length; j++)
		{
			array3[array1.length+ j]= array2[j];
		}
		for(int j=0; j<array3.length;j++)
			for(int i=0; i<array3.length-1;i++)
			if(array3[i]>array3[i+1])
			{
				swap(i, i+1, array3);
			}
		for(int i=0; i<array3.length; i++)
		{
			System.out.println(array3[i]);
		}
		
	}
	public static void swap(int a, int b, int num[])
	{
		int tempo = num[a];
		num[a]=num[b];
		num[b]=tempo;
	}
	}

