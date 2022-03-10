import java.util.*;

public class Problema30
{
	int i;

	public void Transferencia()
	{	
		System.out.println("***Programa que Transfiere los valores aleatorios del Vector B al Vector A***");
		System.out.println("*****************************************************************************\n");
		Random num = new Random();
		Vector B = new Vector(5);
		Vector A = new Vector(5);

		for (i=0; i<=5; i++)
	    	{
			B.addElement((int)(num.nextDouble()*10.0));
		}
		System.out.println("Los elementos del Vector B son: ");
		System.out.println(B);

		System.out.println("\nAhora se copian los elementos del Vector B al Vector A: ");
		A=B;

		System.out.println("\nLos elementos del Vector A son: ");
		System.out.println(A);
	}

	public static void main (String args[])
	{
		Problema30 Impr = new Problema30();
		Impr.Transferencia();
	}
}