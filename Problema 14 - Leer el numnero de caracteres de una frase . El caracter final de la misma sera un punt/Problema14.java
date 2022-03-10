import java.io.*;

public class Problema14
{
	String palabra;
	int numletras;
	int pospunto;

	public void Caracteres()
	{
		System.out.println("***Programa que lee el numero de caracteres de una frase***");
		System.out.println("***********************************************************");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			System.out.println("\nEscribe la frase terminandola con punto");
			palabra = br.readLine();
			pospunto = palabra.indexOf(".");
			pospunto = pospunto+1;
			System.out.println("El numero de caracteres en la frase es de: "+pospunto);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main (String args [])
	{
		Problema14 Impr = new Problema14();
		Impr.Caracteres();
	}
}