public class Problema4
{
	int i, sum2, i2;
	int suma = 0;

	public void Sumar()
	{
		System.out.println("***Programa que hace la sumatoria de todos los numeros del 1 al 100***");
		System.out.println("***********************************************************************");
		for (i=1; i<=100; i++)
		{
			sum2=suma;
			i2=i;
			suma= suma+i;
			System.out.println(i2+" + "+sum2+" = "+suma);
		}

	}

	public static void main(String args[])
	{
		Problema4 Impr = new Problema4();
		Impr.Sumar();
	}
}
