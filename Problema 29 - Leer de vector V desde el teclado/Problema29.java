import java.util.*;

public class Problema29
{
	int i;

	public void Vec()
	{
		System.out.println("***Programa que hace lectura de un Vector***");
		System.out.println("********************************************");

		System.out.println("\nPrimera forma para visualizar un Vector:");
		Vector V = new Vector(5, 6);
		try
		{
	 		for (i=0; i<=5; i++)
	 		{
				V.addElement(i);
			}
			System.out.println(V);

			System.out.println("\nSegunda forma para visualizar un Vector:");
			for (i=0; i<=V.size(); i++)
			{
				System.out.println(V.elementAt(i)+"\t");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		}
	}

	public static void main (String args[])
	{
		Problema29 Impr = new Problema29();
		Impr.Vec();
	}
}