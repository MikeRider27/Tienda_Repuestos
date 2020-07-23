/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mike
 */
public class Cliente extends Persona {
    
    protected int idCliente;
    protected String razonSocial;
    protected String apellidos;
    protected TipoCliente tipoCliente;

    public Cliente() {
        tipoCliente=new TipoCliente();
    }

    public Cliente(int idCliente, String apellidos, TipoCliente tipocliente, int idPersona, String numeroDocumento, String nombres, String direccion, String telefono, String email, TipoDocumento tipoDocumento) {
        super(idPersona, numeroDocumento, nombres, direccion, telefono, email, tipoDocumento);
        this.idCliente = idCliente;
        this.apellidos = apellidos;
        this.tipoCliente = tipocliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
