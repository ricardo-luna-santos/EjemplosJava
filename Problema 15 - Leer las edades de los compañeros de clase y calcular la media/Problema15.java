import java.io.*;

public class Problema15
{
	int numcom, i;
	int edad;
	double suma = 0;
	double media;

	public void Media()
	{
		System.out.println("***Calcula la edad media de un grupo de personas***");
		System.out.println("***************************************************\n");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			System.out.println("Escribe el numero de personas:");
			numcom = Integer.parseInt(br.readLine());

			for (i=1; i<=numcom; i++)
			{
				System.out.println("\nEscribe la edad de la persona #"+i+":");
				edad = Integer.parseInt(br.readLine());
				suma= suma+edad;
			}
			media = suma/numcom;
			System.out.println("\nLa edad media de las "+numcom+" personas es: "+media);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main (String args[])
	{
		Problema15 Impr = new Problema15();
		Impr.Media();
	}
}