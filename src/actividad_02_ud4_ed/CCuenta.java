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
    /**
     * 
     * @param nom nombre del titular de la cuenta
     */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    /**
     * 
     * @return devuelve el nombre del titular de la cuenta
     */
    public String obtenerNombre()
    {
        return nombre;
    }

     /**
      * 
      * @return retorna el saldo de la cuenta
      */
     public double estado ()
    {
        return saldo;
    }

    /**
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

    /**
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
    *@return cuenta retorna el numero de la cuenta
    */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
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
  *@return tipoInteres
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * 
   * @param tipoInterés tipo de interes de la cuenta
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
