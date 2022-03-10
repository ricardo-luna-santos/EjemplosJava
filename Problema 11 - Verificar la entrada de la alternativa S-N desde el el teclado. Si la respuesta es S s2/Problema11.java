import java.util.*;
import java.io.*;

public class Problema11
{
	String resp;

	public void Alternativa()
	{
		System.out.println("***Programa que demuestra la lectura desde teclado***");
		System.out.println("*****************************************************");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			do
			{
				System.out.println("\n La respuesta debe ser S/N");
				resp = br.readLine();

				if ((resp.equals("S"))||(resp.equals("s")))
				{
					System.out.println("su respuesta es SI");
				}

				if ((resp.equals("N"))||(resp.equals("n")))
				{
					System.out.println("su respuesta es NO");
				}
			}
			while (((!resp.equals("S"))||(!resp.equals("s")))||((!resp.equals("N"))||(!resp.equals("n"))));
		}
		catch (IOException e)
		{
		}
	}

	public static void main(String args[])
	{
		Problema11 Impr = new Problema11();
		Impr.Alternativa();
	}
}


