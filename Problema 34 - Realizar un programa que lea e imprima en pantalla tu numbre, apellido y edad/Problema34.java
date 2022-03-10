import java.io.*;

public class Problema34
{
	String nom, apell;
	int edad;

	public void Datos()
	{
		System.out.println("***Programa que lee desde teclado e imprime en pantalla***");
		System.out.println("**********************************************************\n");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			System.out.println("Escribe tu numbre:");
			nom = br.readLine();
			System.out.println("\nEscribe tu apellido:");
			apell = br.readLine();
			System.out.println("\nEscribe tu edad:");
			edad = Integer.parseInt(br.readLine());
			System.out.println("Tu nombre es: "+ nom +" "+ apell +" y tienes "+ edad +" años");
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}

	public static void main (String args[])
	{
		Problema34 Impr = new Problema34();
		Impr.Datos();
	}
}