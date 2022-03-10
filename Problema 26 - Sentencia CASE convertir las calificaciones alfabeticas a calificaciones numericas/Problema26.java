import java.io.*;

public class Problema26
{
	String letra;
	int opcnum;

	public void Calificaciones()
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			System.out.println("Escribe la letra de la calificacion alfabetica");
			letra = br.readLine();

			if ((letra.equals("A"))||(letra.equals("a")))
			{
				opcnum = 1;
			}
			else
			{
				if ((letra.equals("B"))||(letra.equals("b")))
				{
					opcnum = 2;
				}
				else
				{
					if ((letra.equals("C"))||(letra.equals("c")))
					{
						opcnum = 3;
					}
					else
					{
						if ((letra.equals("D"))||(letra.equals("d")))
						{
							opcnum = 4;
						}
						else
						{
							if ((letra.equals("F"))||(letra.equals("f")))
							{
								opcnum = 5;
							}
						}
					}
				}
			}
		}
		catch (IOException e)
		{
			System.out.println(e);
		}

		switch(opcnum)
		{
			case 1:
					System.out.println("La calificacion es 10");
			break;
			case 2:
					System.out.println("La calificacion es 9");
			break;
			case 3:
					System.out.println("La calificacion es 8");
			break;
			case 4:
					System.out.println("La calificacion es 7");
			break;
			case 5:
					System.out.println("La calificacion es 5");
			break;
		}
	}

	public static void main (String args[])
	{
		Problema26 Impr = new Problema26();
		Impr.Calificaciones();
	}
}