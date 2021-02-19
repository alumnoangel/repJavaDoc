/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud4_ed;
/*
*
*@author Angel Hueso
*
*/
public class CCuenta {

  
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * 
     */
    public CCuenta ()
    {
    }
    /**
     * 
     * @param nom nombre del titular de la cuenta
     * @param cue numero de cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interes de la cuenta
     */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
    /** Metodo de asignar el nombre del titular de la cuenta
     * 
     * @param nom nombre del titular de la cuenta
     */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    /**Metodo que nos devuelve el nombre del titular
     * 
     * @return <code>nombre</code> devuelve el nombre del titular de la cuenta
     */
    public String obtenerNombre()
    {
        return nombre;
    }

     /**Metdo que nos devuelve el salod disponible en la cuenta
      * 
      * @return <code>saldo</code> retorna el saldo de la cuenta
      */
     public double estado ()
    {
        return saldo;
    }

    /**Metodo para ingresar dinero en la cuenta
     * 
     * @param cantidad la cantidad ingresada a la cuenta
     * @throws Exception excepcion por la cual no se puede hacer un ingreso
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    /**Metodo para retirar dinero de la cuenta
     * 
     * @param cantidad la cantidad ingresada a la cuenta
     * @throws Exception excepcion por la cual no se puede hacer un ingreso
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
    * Devuelve una cuenta obtenida
    *@return <code>cuenta</code> retorna el numero de la cuenta
    */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**Asignar el numero de la cuenta
   * 
   * @param cuenta numero de la cuenta
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * 
   * @param saldo saldo de la cuenta
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  /*
  * Devuelve el tipo de interes
  *@return<code>tipoInterés</code> Porcentaje a aplicar
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**Asignar el valor del tipo de interes
   * 
   * @param tipoInterés porcentaje a aplicar
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
