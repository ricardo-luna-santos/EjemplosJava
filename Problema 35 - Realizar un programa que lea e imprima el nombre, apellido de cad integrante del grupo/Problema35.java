import java.io.*;

public class Problema35
{
	String nom, apell, preg;

	public void Nombres()
	{
		System.out.println("***Programa que lee e imprime el nombre y apellido de n personas***");
		System.out.println("*******************************************************************");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			do
			{
				System.out.println("\nEscribe tu nombre:");
				nom = br.readLine();
				System.out.println("\nEscribe tu apellido");
				apell = br.readLine();
				System.out.println(nom +" "+ apell);
				System.out.println("Escribira otro? (si o no)");
				preg = br.readLine();
			}
			while (preg.equals("si"));
		}
		catch (IOException e)
		{
			System.out.println(e);
		}

	}

	public static void main (String args[])
	{
		Problema35 Impr = new Problema35();
		Impr.Nombres();
	}
}

