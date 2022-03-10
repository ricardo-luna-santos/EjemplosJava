import java.util.*;

public class Problema33
{
	int i, elem;
	float suma, promedio;

	public void Calculos()
	{
		System.out.println("***Programa que calcula la suma y promedio de los elementos de un Vector***");
		System.out.println("***************************************************************************");

		Vector A = new Vector(10);
		Random num = new Random();

		for(i=0; i<=10; i++)
		{
			elem = (int)(num.nextDouble()*10.0);
			A.addElement(elem);
			suma = suma+elem;
		}
		promedio = suma/10;
		System.out.println("\nLos elementos del Vector:");
		System.out.println(A);

		System.out.println("\nResultado de la suma de todos sus elementos:");
		System.out.println(suma);

		System.out.println("\nPromedio de sus elementos: ");
		System.out.println(promedio+"\n");
	}

	public static void main (String args[])
	{
		Problema33 Impr = new Problema33();
		Impr.Calculos();
	}
}