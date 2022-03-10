import java.util.*;

public class Problema31
{
	int i;

	public void Rellenar()
	{
		System.out.println("***Programa que rellena un Vector con numeros consecutivos***");
		System.out.println("*************************************************************\n");

		Vector A = new Vector(10);
		for (i=0; i<=10; i++)
		{
			A.addElement(i);
		}
		System.out.println("Asi queda el Vector A:\n");
		System.out.println(A);
	}

	public static void main (String args[])
	{
		Problema31 Impr = new Problema31();
		Impr.Rellenar();
	}
}