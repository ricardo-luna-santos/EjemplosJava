import java.io.*;

public class Problema27
{
	int divisor, dividendo, cociente, residuo;

	public void Division()
	{
		System.out.println("***Programa que calcula el cociente y el residuo de una division***");
		System.out.println("*******************************************************************\n");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			System.out.println("\nEscribe el numero Dividendo:");
			dividendo = Integer.parseInt(br.readLine());

			System.out.println("\nEscribe el numero Divisor:");
			divisor = Integer.parseInt(br.readLine());

			cociente = dividendo/divisor;
			residuo = dividendo%divisor;

			System.out.println("El cociente de la division es: "+ cociente);
			System.out.println("\nEl residuo de la division es: "+ residuo);
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}

	public static void main (String args [])
	{
		Problema27 Impr = new Problema27();
		Impr.Division();
	}
}