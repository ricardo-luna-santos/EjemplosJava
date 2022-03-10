public class Problema28
{
	double c = 1;
	double suma;

	public void Cuadrados()
	{
		System.out.println("***Programa que suma los cuadrados de los primeros 100 numeros***");
		System.out.println("*****************************************************************\n");

		while (c<=100)
		{
			suma = suma+(Math.pow(c,2));
			c++;
		}
		System.out.println("La suma de los cuadrados de los primeros 100 numeros es: "+suma);
	}

	public static void main (String args[])
	{
		Problema28 Impr = new Problema28();
		Impr.Cuadrados();
	}
}