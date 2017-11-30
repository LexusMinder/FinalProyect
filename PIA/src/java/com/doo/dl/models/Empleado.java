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
public class Empleado {
    private int No_empleado;
    private String Nombre;
    private String Apellido_paterno;
    private String Apellido_materno;
    private String Direccion;
    private String Fecha_nacimiento;

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
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido_paterno
     */
    public String getApellido_paterno() {
        return Apellido_paterno;
    }

    /**
     * @param Apellido_paterno the Apellido_paterno to set
     */
    public void setApellido_paterno(String Apellido_paterno) {
        this.Apellido_paterno = Apellido_paterno;
    }

    /**
     * @return the Apellido_materno
     */
    public String getApellido_materno() {
        return Apellido_materno;
    }

    /**
     * @param Apellido_materno the Apellido_materno to set
     */
    public void setApellido_materno(String Apellido_materno) {
        this.Apellido_materno = Apellido_materno;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    /**
     * @param Fecha_nacimiento the Fecha_nacimiento to set
     */
    public void setFecha_nacimiento(String Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }
    
    
}
