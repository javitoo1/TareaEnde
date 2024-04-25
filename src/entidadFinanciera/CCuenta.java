/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;
/**
 * 
 * @author Javier
 * @version version 1
 */

public class CCuenta {

    /**
     * Nombre de la persona titular
     * 
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * Este metodo realiza una accion pero actulmente no realiza ninguina operacion
     */
    public CCuenta()
    {
    }
    /**
     * 
     * @param nom El nombre de la persona
     * @param cue El nombre de la cuenta
     * @param sal El numero que representa el saldo
     * @param tipo El numero que representa al tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * 
     * @return EL resultado del saldo
     */
    public double estado(){
        return this.getSaldo();
    }
    /**
     * 
     * @param cantidad El numero que representa la cantidad a ingresar
     * @throws Exception Si la cantidad a ingresar es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * 
     * @param cantidad El numero que representa la cantidada retirar
     * @throws Exception Si no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception (getERRORCANTIDADNEGATIVA());
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    private static String ERRORCANTIDADNEGATIVA = "No se puede retirar una cantidad negativa";

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * @return the ERRORCANTIDADNEGATIVA
     */
    public static String getERRORCANTIDADNEGATIVA() {
        return ERRORCANTIDADNEGATIVA;
    }

    /**
     * @param aERRORCANTIDADNEGATIVA the ERRORCANTIDADNEGATIVA to set
     */
    public static void setERRORCANTIDADNEGATIVA(String aERRORCANTIDADNEGATIVA) {
        ERRORCANTIDADNEGATIVA = aERRORCANTIDADNEGATIVA;
    }
}


    
   