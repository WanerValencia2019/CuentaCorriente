package CuentaCorriente;

import java.util.Scanner;



public class Main {
	

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		String contraseña="";
	System.out.println("Bienvenido a tu cajero ATM");
	System.out.println("\n<-------------------LOGIN------------------->\n");
	System.out.print("Introduce tu contraseña: ");
	contraseña=leer.nextLine();
	Cajero cliente=new Cajero();
	
	cliente.Iniciar(contraseña);
	
	}

}
