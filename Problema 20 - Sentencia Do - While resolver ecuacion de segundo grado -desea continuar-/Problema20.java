import java.io.*;

public class Problema20
{
	int a, b, c, numx, frac;
	double x1, x2;
	String resp;

	public void SeGrado()
	{
		System.out.println("***Programa que resuelve ecuaciones de 2do grado del tipo ax2+bx+c=0***");
		System.out.println("***********************************************************************\n");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			do
			{
				System.out.println("Escribe el valor de a:");
				a = Integer.parseInt(br.readLine());

				System.out.println("\nEscribe el valor de b:");
				b = Integer.parseInt(br.readLine());

				System.out.println("\nEscribe el valor de c: ");
				c = Integer.parseInt(br.readLine());

				x1 = (-b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
				x2 = (-b-(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);

				numx = (int)x1;
				if (numx == x1)
				{
					System.out.println("El valor de x1 es: "+ x1);
				}
				else
				{
					frac = (int)(-b+(Math.sqrt(Math.pow(b,2)-4*a*c)));
					System.out.println("El valor de x1 es: "+ frac +" / "+(2*a));
				}

				numx = (int)x2;
				if (numx == x2)
				{
					System.out.println("El valor de x2 es: "+ x2);
				}
				else
				{
					frac = (int)(-b-(Math.sqrt(Math.pow(b,2)-4*a*c)));
					System.out.println("El valor de x2 es: "+ frac +" / "+(2*a));
				}

				System.out.println("Desea continuar?");
				resp = br.readLine();
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
		Problema20 Impr = new Problema20();
		Impr.SeGrado();
	}
}

