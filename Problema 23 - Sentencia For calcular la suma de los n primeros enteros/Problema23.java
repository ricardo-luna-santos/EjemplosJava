import java.io.*;

public class Problema23
{
	String snum;
	int i, suma, num;

	public void Sumar()
	{
		System.out.println("***Programa que suma los primeros n numeros***");
		System.out.println("**********************************************");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			System.out.println("Cuantos numeros se van a sumar?");
			snum = br.readLine();
			num = Integer.parseInt(snum);

			for (i=0; i<=num; i++)
			{
				suma = suma+i;
			}
			System.out.println("El resultado de la suma de los numeros del 0 al "+ num +" es: "+ suma);
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}

	public static void main (String args[])
	{
		Problema23 Impr = new Problema23();
		Impr.Sumar();
	}
}
