import java.io.*;

public class Problema18
{
	String nom, apell, dom, edad, resp;

	public void Control()
	{
		System.out.println("***Programa de control escolar con Do-While***");
		System.out.println("**********************************************\n");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			do
			{
				System.out.println("\nEscribe el nombre: ");
				nom = br.readLine();

				System.out.println("\nEscribe los apellidos: ");
				apell = br.readLine();

				System.out.println("\nEscribe el domicilio: ");
				dom = br.readLine();

				System.out.println("\nEscribe la edad: ");
				edad = br.readLine();

				System.out.println("\nDesea continuar? (si o no)");
				resp = br.readLine();
			}
			while(resp.equals("si"));
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}

	public static void main (String args[])
	{
		Problema18 Impr = new Problema18();
		Impr.Control();
	}
}