import java.io.*;

public class Problema25
{
	String Sopcion;
	int opcmenu, bis;

	public void Meses()
	{
		System.out.println("***Programa que deduce el numero de dias del mes***");
		System.out.println("***************************************************\n");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			System.out.println("Menu de meses");
			System.out.println("1. Enero");
			System.out.println("2. Febrero");
			System.out.println("3. Marzo");
			System.out.println("4. Abril");
			System.out.println("5. Mayo");
			System.out.println("6. Junio");
			System.out.println("7. Julio");
			System.out.println("8. Agosto");
			System.out.println("9. Septiembre");
			System.out.println("10.Octubre ");
			System.out.println("11.Noviembre");
			System.out.println("12.Diciembre");

			System.out.println("\nEscribe el numero del mes: ");
			Sopcion = br.readLine();
			opcmenu = Integer.parseInt(Sopcion);

			switch(opcmenu)
			{
				case 1:
						System.out.println("Enero tiene 31 dias");
				break;
				case 2:
					    System.out.println("Cuantos dias tiene el año?");
					    bis = Integer.parseInt(br.readLine());
					    if (bis == 365)
					    {
							System.out.println("Febrero tiene 28 dias y el año no es bisciesto");
						}
						else
						{
							if (bis == 366)
							{
								System.out.println("Febrero tiene 29 dias y el año es bisciesto");
							}
						}
				break;
				case 3:
						System.out.println("Marzo tiene 31 dias");
				break;
				case 4:
						System.out.println("Abril tiene 30 dias");
			    break;
				case 5:
						System.out.println("Mayo tiene 31 dias");
				break;
				case 6:
						System.out.println("Junio tiene 30 dias");
				break;
				case 7:
						System.out.println("Julio tiene 31 dias");
				break;
				case 8:
						System.out.println("Agosto tiene 31 dias");
				break;
				case 9:
						System.out.println("Septiembre tiene 30 dias");
				break;
				case 10:
						System.out.println("Octubre tiene 31 dias");
				break;
				case 11:
						System.out.println("Noviembre tiene 30 dias");
				break;
				case 12:
						System.out.println("Diciembre tiene 31 dias");
				break;
			}
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}

	public static void main (String args[])
	{
		Problema25 Impr = new Problema25();
		Impr.Meses();
	}
}