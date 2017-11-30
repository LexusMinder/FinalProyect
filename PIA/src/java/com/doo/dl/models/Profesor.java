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
public class Profesor {
    private int No_empleado;
    private int Cuenta_id;
    private int Estatus_id;
    private int Area_id;
    private String Grado_estudio;

    /**
     * @return the No_empleado
     */
    public int getNo_empleado() {
        return No_empleado;
    }

    /**
     * @param No_empleado the No_empleado to set
     */
    public void setNo_empleado(int No_empleado) {
        this.No_empleado = No_empleado;
    }
    
    /**
     * @return the Cuenta_id
     */
    public int getCuenta_id() {
        return Cuenta_id;
    }

    /**
     * @param Cuenta_id the Cuenta_id to set
     */
    public void setCuenta_id(int Cuenta_id) {
        this.Cuenta_id = Cuenta_id;
    }

    /**
     * @return the Estatus_id
     */
    public int getEstatus_id() {
        return Estatus_id;
    }

    /**
     * @param Estatus_id the Estatus_id to set
     */
    public void setEstatus_id(int Estatus_id) {
        this.Estatus_id = Estatus_id;
    }

    /**
     * @return the Area_id
     */
    public int getArea_id() {
        return Area_id;
    }

    /**
     * @param Area_id the Area_id to set
     */
    public void setArea_id(int Area_id) {
        this.Area_id = Area_id;
    }

    /**
     * @return the Grado_estudio
     */
    public String getGrado_estudio() {
        return Grado_estudio;
    }

    /**
     * @param Grado_estudio the Grado_estudio to set
     */
    public void setGrado_estudio(String Grado_estudio) {
        this.Grado_estudio = Grado_estudio;
    }
    
    
}
