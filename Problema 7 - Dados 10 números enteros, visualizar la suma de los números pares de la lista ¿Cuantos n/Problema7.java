import java.io.*;

public class Problema7
{
	String Strnum;
	String listnum="";
	int num, suma, resul, i, par, contpar, impar, media, nimpar;

	public void Numeros()
	{
		System.out.println("***Programa que calcula de 10 numeros la media aritmetica de los numeros***");
		System.out.println("***impares, la suma de los numeros pares y cuantos numeros pares existen***");
		System.out.println("***************************************************************************");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try
		{
			for (i=1; i<=10; i++)
			{
				System.out.println("Escribe el #"+i);
				Strnum = br.readLine();
				num = Integer.parseInt(Strnum);

				par = num/2*2;
				if (par == num)
				{
					contpar = contpar+1;
					if (i==1)
					{
						listnum = Strnum;
					}
					else
					{
						if (i>1)
						{
							if (listnum== "")
							{
								listnum=Strnum;
							}
							else
							{
								listnum =  listnum+"+"+Strnum;
							}
						}
					}
					suma = suma+num;
				}
				else
				{
					impar = impar+num;
					nimpar = nimpar+1;
				}
			}
			resul = suma;
			System.out.println("\nVisualizacion de la suma:"+ listnum);
			System.out.println("\nEl resultado de la suma de los # pares es: "+resul);
			System.out.println("\nHay "+contpar+" numeros pares");
			media = impar/nimpar;
			System.out.println("\nLa media aritmetica de los numero impares es: "+media);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main (String args [])
	{
		Problema7 Impr = new Problema7();
		Impr.Numeros();
	}
}
