package stringcalculator;

import java.util.Scanner;

public class Main {
	
	public static void main(String args [] )
	{
	Scanner entrada =new Scanner(System.in);
	
	System.out.println("Escriba el string:");
	
	String valor= entrada.nextLine(); 
	
	Add agregar =new Add();
	
	System.out.printf("el resultado es  %s", agregar.add(valor));
	}

}
