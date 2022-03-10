import java.io.*;

public class Problema24
{
	int opcnum;

	public void Numero()
	{
		System.out.println("***Programa que lee desde teclado un numero entre 1 y el 10***");
		System.out.println("************y muestra los numeros impares o pares*************");
		System.out.println("**************************************************************");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			System.out.println("\nEscribe un numero del 1 al 10: ");
			opcnum = Integer.parseInt(br.readLine());

			switch(opcnum)
			{
				case 1:
						System.out.println("Los numeros impares son 3, 5, 7 y 9");
				break;
				case 2:
						System.out.println("Los numeros pares son 4, 6, 8 y 10");
				break;
				case 3:
						System.out.println("Los numeros impares son 1, 5, 7 y 9 ");
				break;
				case 4:
						System.out.println("Los numeros pares son 2, 6, 8 y 10");
				break;
				case 5:
						System.out.println("Los numeros impares son 1, 3, 7 y 9");
				break;
				case 6:
						System.out.println("Los numeros pares son 2, 4, 8 y 10");
				break;
				case 7:
				 		System.out.println("Los numeros impares son 1, 3, 5 y 9");
				break;
				case 8:
				 		System.out.println("Los numeros pares son 2, 4, 6 y 10");
				break;
				case 9:
						System.out.println("Los numeros impares son 1, 3, 5 y 7");
				break;
				case 10:
						System.out.println("Los numeros pares son 2, 4, 6 y 8");
				break;
				default:
						System.out.println("Escribe un numero del 1 al 10");
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
		Problema24 Impr = new Problema24();
		Impr.Numero();
	}
}