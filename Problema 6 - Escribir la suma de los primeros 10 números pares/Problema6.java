import java.io.*;

public class Problema6
{
	String cadena, snum;
	int num,suma, i, par;

	public void Sumapares()
	{
		System.out.println("***Programa que suma los primero 10 numero pares que ud. escriba***");
		System.out.println("*******************************************************************\n");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			while (i<10)
			{
				System.out.println("Escribe un numero:");
				snum = br.readLine();
				num = Integer.parseInt(snum);
				par = num/2*2;
				if (par == num)
				{
					suma = suma+par;
					i = i+1;
					if (cadena == null)
					{
						cadena = snum;
					}
					else
					{
						cadena = cadena+"+"+ snum;
					}
				}
			 }
			 System.out.println("La suma de los numeros pares queda asi: "+cadena+"=");
			 System.out.println("El resultado de la suma es: "+suma);

		}
		catch (IOException e)
		{
			System.out.println(e);
		}

	}

	public static void main (String args[])
	{
		Problema6 Impr = new Problema6();
		Impr.Sumapares();
	}
}

