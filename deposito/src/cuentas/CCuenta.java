package cuentas;
/**
 * Esta clase simula el comportamiento de una cuenta de un banco
 * 
 * @author ubuntu
 * @version 1.0
 * @since 03/03/2024
 */
public class CCuenta {

    /**
     * Devuelve el nombre del cliente
     * 
     * @return el nombre del cliente
     */
    public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del cliente.
	 * 
	 * @param nombre el nombre del cliente a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el numero de cuenta
	 * 
	 * @return el numero de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Establece el numero de cuenta.
	 * 
	 * @param cuenta establece el parametro del atributo que tiene el numero de cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve el saldo de la cuenta
	 * 
	 * @return el valor del atributo del saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Establece el valor de saldo.
	 * 
	 * @param saldo establece el parametro del atributo que tiene el saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve el tipo de interes
	 * 
	 * @return el valor del atributo del tipo de interes
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Establece el valor del tipo de interes.
	 * 
	 * @param tipoInterés establece el parametro del atributo que tiene el tipo de interes
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Atributos
	 */
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parametros
     * @param nom String, nombre del cliente
     * @param cue String, nummero de cuenta
     * @param sal double, saldo de la cuenta
     * @param tipo double, tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el saldo de la cuenta.
     * 
     * @return el saldo de la cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Establece la cantidad a ingresar.
     * 
     * @param cantidad a ingresar en la cuenta
     * @throws Exception no permite ingresar cantidad
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Establece la cantidad a retirar.
     * 
     * @param cantidad que permite retirar de la cuenta
     * @throws Exception no permite retirar cantidad 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
