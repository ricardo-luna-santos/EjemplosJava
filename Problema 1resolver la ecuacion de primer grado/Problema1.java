public class Problema1
{
	float a = 2;
	float b = 3;
	float c = 12;
	float x;
	int   numi, a2,b2,c2, frac;

	public void Ecuacion()
	{
		System.out.println("***Programa que resuelve Ecuaciones de primer grado ax+b=c***");
		System.out.println("*************************************************************\n");

		a2=(int)a;
		b2=(int)b;
		c2=(int)c;
		x = (c-(b))/a;
		numi = (int)x;

		if (numi==x)
		{
			if (b2>0)
			{
				System.out.println("El resultado de la ecuacion "+a2+"x"+"+"+b2+"="+c2+" es: "+numi);
			}
			else
			{
				if (b2<0)
				{
					System.out.println("El resultado de la ecuacion "+a2+"x"+b2+"="+c2+" es: "+numi);
				}
			}
		}
		else
		{
			frac= (c2-(b2));

			if (b2>0)
			{
				System.out.println("El resultado de la ecuacion "+a2+"x"+"+"+b2+"="+c2+" es: "+frac+"/"+a2);
			}
			else
			{
				if (b2<0)
				{
					System.out.println("El resultado de la ecuacion "+a2+"x"+b2+"="+c2+" es: "+frac+"/"+a2);
				}
			}
		}
	}

	public static void main (String args[])
	{
		Problema1 Impr = new Problema1();
		Impr.Ecuacion();
	}
}