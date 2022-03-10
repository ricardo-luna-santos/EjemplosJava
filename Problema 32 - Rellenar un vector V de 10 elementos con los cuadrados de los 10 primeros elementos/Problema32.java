import java.util.*;

public class Problema32
{
	int i;
	double cuadra;

	public void Rellenar()
	{
		System.out.println("***Programa que llena un Vector con los cuadrados de los primeros 10 numeros***");
		System.out.println("*******************************************************************************");
		Vector V = new Vector(10);
		for (i=0; i<=10; i++)
		{
			cuadra = Math.pow(i,2);
			V.addElement(cuadra);
		}
		System.out.println("\nVector V con los cuadrados de los primeros 10 elementos:\n");
		System.out.println(V+"\n");
	}

	public static void main (String args[])
	{
		Problema32 Impr = new Problema32();
		Impr.Rellenar();
	}
}