/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doo.dl.models;

/**
 *
 * @author SEG-14
 */
public class User {

    private String username;
    private String password;
    private String name;
    private String semestre;
    private String matricula;
    private String carrera;
    private int examen1;
    private int examen2;
    private int examen3;
    private int tareas;
    private int proyectof;
    private int autorizacion;
    


    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the semestre
     */
    public String getSemestre() {
        return semestre;
    }
    
    public void setSemestre(String semestre){
        this.semestre = semestre;
      
    }

    /**
     * @return the materia
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the autorizacion
     */
    public int getAutorizacion() {
        return autorizacion;
    }

    /**
     * @param autorizacion the autorizacion to set
     */
    public void setAutorizacion(int autorizacion) {
        this.autorizacion = autorizacion;
    }
   
        /**
     * @return the examen1
     */
    
}
