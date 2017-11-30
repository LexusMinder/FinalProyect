/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doo.dl.models;

/**
 *
 * @author moust
 */
public class Cuenta {

    private int ID;
    private String Usuario;
    private String Password;
    private int NivelAutorizacion;

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the NivelAutorizacion
     */
    public int getNivelAutorizacion() {
        return NivelAutorizacion;
    }

    /**
     * @param NivelAutorizacion the NivelAutorizacion to set
     */
    public void setNivelAutorizacion(int NivelAutorizacion) {
        this.NivelAutorizacion = NivelAutorizacion;
    }

}
