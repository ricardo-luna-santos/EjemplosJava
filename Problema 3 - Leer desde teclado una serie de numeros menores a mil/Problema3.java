import java.io.*;

public class Problema3
{
	String num;
	int deconum;

	public void Condicion()
	{
		System.out.println("***Programa que acepta numero menores a 1000***");
		System.out.println("*********************************************");
		System.out.println("Para salir escribe: exit");
		System.out.println("\nEscribe un numero");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			do
			{
				num = br.readLine();
				deconum = Integer.parseInt(num);
				if (deconum>=1000)
				{
					System.out.println("El numero debe ser menor a 1000");
				}
				else
				{
					if (deconum<1000)
					{
						System.out.println("Escriba otro numero");
					}
				}
			}
			while (!num.equals("exit"));
		}
		catch (Exception e)
		{
		}
	}

	public static void main (String args [])
	{
		Problema3 Impr = new Problema3();
		Impr.Condicion();
	}
}
