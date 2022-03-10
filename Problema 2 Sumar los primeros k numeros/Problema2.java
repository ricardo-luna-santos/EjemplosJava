import java.io.*;

public class Problema2
{
	String cadena= "";
	int resul, decocadena;
	int suma = 0;

	public void Sumando()
	{

		System.out.println("***Programa que suma cuantos numeros quiera***");
		System.out.println("**********************************************");

		System.out.println("Escriba el primer numero y de enter:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try
		{
			do
			{
				cadena = br.readLine();
				decocadena = Integer.parseInt(cadena);
				suma = suma+decocadena;
				System.out.println("Escriba el siguiente numero (Para saber el resultado escriba el signo = )");
			}
			while(!cadena.equals("="));
		}
		catch (Exception e)
		{
			if (cadena.equals("="))
			{
				resul = suma;
				System.out.println("El resultado de la suma es: "+ resul);
			}
			else
			{
				System.out.println("No se aceptan letras, espacios en blanco ni cualquier otro signo a excepcion del = (igual)");
			}
		}
	}
	public static void main(String args[])
	{
		Problema2 Impr = new Problema2();
		Impr.Sumando();
	}
}