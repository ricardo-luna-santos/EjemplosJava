import java.io.*;

public class Problema16
{
	int i;
	float exA, exB, par, resA,resB, sumA, sumB;

	public void Examenes()
	{
		System.out.println("***Programa que calcula la calificacion media de 2 examenes***");
		System.out.println("**************************************************************");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader    br = new BufferedReader(isr);
		try
		{
			for (i=1; i<=26; i++)
			{
				par= i/2*2;
				if (par==i)
				{
					System.out.println("Escribe la calificacion del examen #"+i+":");
					exB= Integer.parseInt(br.readLine());
					sumB= sumB+exB;
				}
				else
				{
					System.out.println("Escribe la calificacion del examen #"+i+":");
					exA = Integer.parseInt(br.readLine());
					sumA = sumA+exA;
				}
			}
			resA = sumA/13;
			System.out.println("La media de las calificaciones del examen A es: "+resA);
			resB = sumB/13;
		    System.out.println("La media de las calificaciones del examen B es: "+resB);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main (String args[])
	{
		Problema16 Impr = new Problema16();
		Impr.Examenes();
	}
}
