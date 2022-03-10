import java.io.*;

public class Problema19
{
	int suma, cont, num;
	int multi = 1;

	public void SumMult()
	{
		System.out.println("***Programa que hace operacion de suma y multiplicacion de 10 numeros***");
		System.out.println("************************************************************************");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			do
			{
				cont = cont+1;
				System.out.println("\nEscribe el cantidad #"+ cont);
				num = Integer.parseInt(br.readLine());
				suma = suma+num;
				multi = multi*num;
			}
			while ((cont < 10)&&(num > 0));
			if (num > 0)
			{
				System.out.println("El resultado de la suma es: "+suma);
				System.out.println("\nEl resultado de la multiplicacion es: "+multi);
			}
			else
			{
				if (num < 0)
				{
					System.out.println("El numero debe ser mayor a 0");
				}
			}
		}
		catch (IOException e)
		{
			System.out.println("El numero no debe contener decimales ni letras");
		}
	}

	public static void main (String args[])
	{
		Problema19 Impr = new Problema19();
		Impr.SumMult();
	}
}
