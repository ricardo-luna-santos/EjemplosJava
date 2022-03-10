import java.io.*;

public class Problema21
{
	float i, media, suma;
	float fin = 20;
	float ini = 0;
	String resp;

	public void Medias()
	{
		System.out.println("***Programa que calcula la media de una serie de numeros***");
		System.out.println("***********************************************************\n");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		try
		{
			do
			{
				fin = fin;
				for (i=ini; i<=fin; i++)
				{
					suma = suma+i;
					if (i >= fin)
					{
						media = suma/20;
						System.out.println("La media de la serie de "+ ini +" a "+ fin +" es: "+ media);
						System.out.println("\nDesea Continuar? (si o no)");
						resp = br.readLine();
						if (resp.equals("si"))
						{
							ini = ini+20;
							fin = fin+20;
							suma = 0;
						}
					}
				}
			}
			while (resp.equals("si"));
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}

	public static void main (String args[])
	{
		Problema21 Impr = new Problema21();
		Impr.Medias();
	}
}

