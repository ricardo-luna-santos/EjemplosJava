import java.io.*;

public class Problema8
{
	int i;
	float num, suma, resul;

	public void Media()
	{
		System.out.println("***Programa que calcula la media de 50 numeros***");
		System.out.println("************************************************");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			for (i=1; i<=50; i++)
			{
				System.out.println("Escriba la cantidad #"+i);
				num = Integer.parseInt(br.readLine());
				suma = suma+num;
			}
			resul = suma/50;
			System.out.println("La media de los 50 numeros es: "+resul);
		}
		catch (Exception e)
		{
			System.out.println(e);
			System.out.println("\nSolo escriba numeros...No se aceptan letras ni caracteres!!!.");
		}
	}

	public static void main (String args[])
	{
		Problema8 Impr = new Problema8();
		Impr.Media();
	}
}