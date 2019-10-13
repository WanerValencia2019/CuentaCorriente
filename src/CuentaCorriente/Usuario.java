package CuentaCorriente;

public class Usuario {

	private String direccion="Medrano",nombre="Maluma",apellidos="Baby",telefono="(+57)350-245-3450";
	private String cedula="1004011252",contraseña="pass",n_cuenta="20191001";
	private double saldo=15000000;

	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public double getSaldo() {
		return saldo;
	}



	public String getCedula() {
		return cedula;
	}

	

	public String getContraseña() {
		return contraseña;
	}



	public String getDireccion() {
		return direccion;
	}



	public String getNombre() {
		return nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public String getTelefono() {
		return telefono;
	}



	public String getN_cuenta() {
		return n_cuenta;
	}


	
}
