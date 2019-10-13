package CuentaCorriente;

import java.util.Scanner;



public class Cajero extends Usuario {
	Scanner leer = new Scanner(System.in);
	private double retiro,saldo=this.getSaldo();
	
	public void Iniciar(String contraseña) {
		if(this.getContraseña().equals(contraseña.trim())) {
	
			byte menu=1;
			
			while(menu!=0) {
				
				System.out.println("Bienvenido a WAELFREBRE");
				System.out.println("");
				System.out.println("Señor(a) usuario(a) a continuación seleccione la acción de desea realizar.");
				System.out.println("");
				System.out.println("1.Retirar Dinero");
				System.out.println("2.Depositar Dinero");
				System.out.println("3.Consultar Saldo");
				System.out.println("4.Información de la cuenta");
				System.out.println("0.Salir");
				System.out.println("Opción-->");
				menu=leer.nextByte();

				switch (menu) {
				case 1:
					double dinero=Dinero();
					RetirarDinero(dinero);
					break;
				case 2:
					double dinero2=Dinero();
					IngresarDinero(dinero2);

					break;

				case 3:
					System.out.println("Señor(a)"+" "+this.getNombre()+" "+"su saldo actual es: "+this.getSaldo());
					
					break;
					
				case 4:
					Informacion();
					
					break;
				default:
					System.out.println("\nQuerido usuario, no más opciones disponibles");
					break;
				}

			}
		}
	}
	private double Dinero() {
		double dinero=0;
		System.out.print("Ingrese la cantidad de dinero-> ");
		dinero=leer.nextDouble();
		return dinero;
	}
	private  void RetirarDinero(double dinero) {
		if(saldo>=dinero){
			this.setSaldo(saldoCambio(dinero, "retirar"));
			saldo=this.getSaldo();
		}
		else {
			boolean trabaja=saldoNegativo(dinero);
			if(trabaja) {
				System.out.println("Señor esto es un error, por favor ingresa un valor valido ");
			}
			
		}
	}
	private void IngresarDinero(double dinero) {
		setSaldo(saldoCambio(dinero, "ingresar"));
		this.saldo=this.getSaldo();
	}
	
	
	private double saldoCambio(double dinero,String tipo) {
		double saldoFinal=0;
		
		switch (tipo) {
		case "ingresar":
			saldoFinal=this.saldo+dinero;
			break;
			
		case "retirar":
			saldoFinal=this.saldo-dinero;
			break;
		
		default:
			saldoFinal=this.saldo;
			break;
		}
		
		return saldoFinal;
	}
	
	private boolean saldoNegativo(double dinero ) {
		boolean negativo = false;
		
		if (this.saldo<dinero) {
			return negativo=true;
			
		}else {
			return false;		
		}
	}
	public void verificarContraseña(){
		String password="";
		System.out.println("Sr "+this.getNombre()+" ingrese su contraseña: ");
		password=leer.nextLine();
		if(this.getContraseña().equals(password.trim())){

		}
	}
	
	private void Informacion() {
		System.out.println("Usuario(a) de WAELFREBRE, a continuación sus datos personales--->");
		System.out.println("\nNombre(s)"+" "+this.getNombre());
		System.out.println("\nApellido"+" "+this.getApellidos() );
		System.out.println("\nNumero telefonico:"+" "+this.getTelefono());
		System.out.println("\nDirección"+" "+this.getDireccion());
		System.out.println("\nNumero de cuenta"+" "+this.getN_cuenta().replace(getN_cuenta().subSequence(0, 4),"xxxxx"));
		System.out.println("\nSaldo en la cuenta"+" "+this.getSaldo());
		System.out.println("\nQuerido usuario de WAELFREBRE muchas gracias por preferirnos :D)");
	}

	
	
}
