public class Problema22
{
	double resul, i;
	int num = 4;

	public void Potencias()
	{
		System.out.println("***Programa que calcula las primeras 30 potencias del 4***");
		System.out.println("**********************************************************\n");
		for (i=0; i<=30; i++)
		{
			resul = (Math.pow(num,i));
			System.out.println("El numero 4 elevada a la potencia "+ i +" es: "+ resul);
		}
	}

	public static void main (String args[])
	{
		Problema22 Impr = new Problema22();
		Impr.Potencias();
	}
}