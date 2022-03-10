import java.io.*;

public class Problema9
{
	int num, oper, i;

	public void Factorial()
	{
		System.out.println("***Programa que calcula el factorial de cualquier numero***");
		System.out.println("*********************************************************\n");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Escriba el numero al cual se calculara su factorial:");
		try
		{
			num = Integer.parseInt(br.readLine());
			oper=num;
			if (num>0)
			{
				for (i=1; i<num; i++)
				{
					oper = oper*i;
				}
				System.out.println("El factorial del numero "+num+" es: "+oper);
			}
			else
			{
				if (num<0)
				{
					for (i=-1; i>num; i--)
					{
						oper = oper*i;
					}
					System.out.println("El factorial del numero "+ num + " es: "+ oper+"\n");
				}
			}
		}
		catch (Exception e)
		{
			System.out.println(e+ "\n Escriba de nuevo el numero");
		}
	}

	public static void main (String args[])
	{
		Problema9 Impr = new Problema9();
		Impr.Factorial();
	}
}