import java.io.*;

public class Problema36
{
	String snum, cadena;
	int num, suma, i;

	public void Sumatoria()
	{
		System.out.println("***Programa que lee e imprime la sumatoria de 10 numeros***");
		System.out.println("***********************************************************");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	  	try
	  	{
			for (i=1; i<=10; i++)
			{
				System.out.println("\nEscriba cantidad #"+i);
				snum = br.readLine();
				num = Integer.parseInt(snum);
				if (num > 0)
				{
					suma = suma+num;
					if (cadena == null)
					{
						cadena = snum;
					}
					else
					{
						cadena = cadena+"+"+snum;
					}
				}
				else
				{
					if (num < 0)
					{
						System.out.println("El numero debe ser positivo");
						i = 10;
					}
				}
			}
			if (num > 0)
			{
				System.out.println("\nLa suma queda: "+ cadena);
				System.out.println("\nEl resultado de la suma es: "+ suma);
			}
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String args[])
	{
		Problema36 Impr = new Problema36();
		Impr.Sumatoria();
	}
}
