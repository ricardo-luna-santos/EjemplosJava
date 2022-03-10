import java.io.*;

public class Problema5
{
	String num;
	float cont, intnum, suma, resul;

	public void Media()
	{
		System.out.println("***Programa que calcula la media de una serie de numeros positivos***");
		System.out.println("*********************************************************************");
		System.out.println("Para conocer el resultado escribe el signo = y da un enter");
		System.out.println("\nEscribe el primer numero:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try
		{
			do
			{
				num = br.readLine();
				intnum = Integer.parseInt(num);
				if (intnum>0)
				{
					suma = suma+intnum;
					cont = cont+1;
					System.out.println("Escribe otro numero:");
				}
				else
				{
					if (intnum<0)
					{
						System.out.println("Los numero deben ser positivos...Escribe otro numero");
					}
				}
			}
			while (!num.equals("="));
		}
		catch (Exception e)
		{
			if (num.equals("="))
			{
				resul = suma/cont;
				System.out.println("La media de los numeros dados es: "+resul);
			}
			else
			{
				System.out.println("No se aceptan letras, espacios en blanco ni otro cualquier caracter excepto el signo = (igual)");
			}
		}
	}

	public static void main (String args [])
	{
		Problema5 Impr = new Problema5();
		Impr.Media();
	}
}