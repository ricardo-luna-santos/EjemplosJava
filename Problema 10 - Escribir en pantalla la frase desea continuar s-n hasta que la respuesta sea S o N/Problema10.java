import java.io.*;

public class Problema10
{
	String resp;

	public void Frase()
	{
		System.out.println("***Programa que demuestra lectura de teclado***");
		System.out.println("***********************************************");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try
		{
			do
			{
				System.out.println("desea continuar S/N");
				resp = br.readLine();
			}
			while ((!resp.equals("N"))&&(!resp.equals("S")));
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String args [])
	{
		Problema10 Impr = new Problema10();
		Impr.Frase();
	}
}
