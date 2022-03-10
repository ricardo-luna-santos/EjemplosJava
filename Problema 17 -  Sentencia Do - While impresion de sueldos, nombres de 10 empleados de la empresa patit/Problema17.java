import java.util.*;

public class Problema17
{
	int c, pos;

	public void Patito()
	{
		System.out.println("***Programa que imprime los sueldos y los nombres de empleados***");
		System.out.println("*****************************************************************\n");
		Vector Nom = new Vector(10);
		Vector Suel = new Vector(10);
		Vector Num = new Vector(10);
		Random rnd = new Random();

		Nom.addElement("Javier");
		Nom.addElement("Ramirez");
		Nom.addElement("Manolo");
		Nom.addElement("Carlos");
		Nom.addElement("Samantha");
		Nom.addElement("Azucena");
		Nom.addElement("Ingrid");
		Nom.addElement("Samuel");
		Nom.addElement("Vicente");
		Nom.addElement("Karla");

		Suel.addElement("$10000");
		Suel.addElement("$2500");
		Suel.addElement("$3000");
		Suel.addElement("$6340");
		Suel.addElement("$1400");
		Suel.addElement("$2100");
		Suel.addElement("$3210");
		Suel.addElement("$6230");
		Suel.addElement("$5937");
		Suel.addElement("$3865");

		pos = (int)(rnd.nextDouble()*10.0);

		do
		{
			if (Num.contains(pos))
			{
				pos = (int)(rnd.nextDouble()*10.0);
			}
			else
			{
				Num.addElement(pos);
				System.out.println(Nom.elementAt(pos) +" "+ Suel.elementAt(pos));
				c++;
			}
		}
		while (c!=10);
	}

	public static void main (String args[])
	{
		Problema17 Impr = new Problema17();
		Impr.Patito();
	}
}