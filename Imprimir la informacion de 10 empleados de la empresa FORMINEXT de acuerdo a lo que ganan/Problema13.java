import java.util.*;

public class Problema13
{
	int i, numper;

	public void Forminext()
	{
		System.out.println("***Programa que imprime el numero de personas y lo que ganan***");
		System.out.println("********************************************************2*******");

		Random num = new Random();


		for (i=0; i<=3; i++)
		{
			numper = (int)(num.nextDouble()*10.0);

			if (i == 1)
			{
				System.out.println(numper + " persona(s) ganan $10000");
			}

			if (i == 2)
			{

				System.out.println("\n"+ numper + " persona(s) ganan entre $10000 y $5000");
			}

			if (i == 3)
			{
				System.out.println("\n"+ numper + " personas gana menos de $5000\n");
			}
		}
	}

	public static void main (String args[])
	{
		Problema13 Impr = new Problema13();
		Impr.Forminext();
	}
}