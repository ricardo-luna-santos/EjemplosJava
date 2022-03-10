import java.io.*;

public class Problema12
{
	String numdia;
	int dia;

	public void Semana()
	{
		System.out.println("***Programa que imprime los dias de la semana en funcion de una variable***");
		System.out.println("***************************************************************************");
		System.out.println("\n Escribe un numero del 1 al 7:");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try
		{
			numdia = br.readLine();
			dia = Integer.parseInt(numdia);

			if (dia==1)
			{
				System.out.println("Es Domingo");
			}
			else
			{
				if (dia==2)
				{
					System.out.println("Es Lunes");
				}
				else
				{
					if (dia==3)
					{
						System.out.println("Es Martes");
					}
					else
					{
						if (dia==4)
						{
							System.out.println("Es Miercoles");
						}
						else
						{
							if (dia==5)
							{
								System.out.println("Es Jueves");
							}
							else
							{
								if (dia==6)
								{
									System.out.println("Es Viernes");
								}
								else
								{
									if (dia==7)
									{
										System.out.println("Es Sabado");
									}
									else
									{
										if (dia>7)
										{
											System.out.println("Escribe un numero no mayor de 7");
										}
									}
								}
							}
						}
					}
				}
			}
		}
		catch (Exception e)
		{
		 	System.out.println(e);
		}
	}

	public static void main (String args[])
	{
		Problema12 Impr = new Problema12();
		Impr.Semana();
	}
}