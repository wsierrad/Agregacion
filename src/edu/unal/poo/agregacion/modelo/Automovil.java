/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.agregacion.modelo;

/**
 *
 * @author Estudiante
 */
public class Automovil {
    private String marca;
    private String modelo;
    private int annio;
    private LLanta[] llantas;
    private Puerta[] puertas;
    private Motor motor;

    public Automovil() {
      this.llantas = new LLanta[4];
      this.puertas = new Puerta[4];
    }

    public Automovil(String marca, String modelo, int annio, LLanta[] llantas, Puerta[] puertas, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.annio = annio;
        this.llantas = llantas;
        this.puertas = puertas;
        this.motor = motor;
        this.llantas = new LLanta[4];
        this.puertas = new Puerta[4];
    }

    public Automovil(String marca, String modelo, int annio) {
        this.marca = marca;
        this.modelo = modelo;
        this.annio = annio;
        this.llantas = new LLanta[4];
        this.puertas = new Puerta[4];
    }
        
    public Motor getMotor(){
      return this.motor;
    }
        
    public void replaceMotor(Motor motor){
      this.motor = motor;
    }
    
    public LLanta[] getLlantas(){
      return this.llantas;
    }
    public boolean addLlanta(LLanta llanta){
      //
        return false;
    }
    
    public boolean removeLlanta(LLanta llanta){
        if (this.llantas.length > 0){
            for(int i=0; i< llantas.length; i++){
                if(llantas[i]==llanta){
                    llantas[i]=null;
                    return true;
                }
            }
        }
      return false;
    }
    public boolean replaceLlanta(LLanta llanta, LLanta nueva){
        if (this.llantas.length > 0){
            for(int i=0; i< llantas.length; i++){
                if(llantas[i]==llanta){
                    llantas[i]=nueva;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean addPuerta(Puerta puerta){
        if (this.puertas.length > 0){
            for(int i=0; i< puertas.length; i++){
                if(puertas[i]==null){
                    puertas[i]=puerta;
                    return true;
                }
            }
        }
        return false;
    }
    public boolean removePuerta(Puerta puerta){
        if (this.puertas.length > 0){
            for(int i=0; i< puertas.length; i++){
                if(puertas[i]==puerta){
                    puertas[i]=null;
                    return true;
                }
            }
        }
        return false;
    }
    public Puerta[] getPuerta(){
        return this.puertas;
    }
    public boolean replacePuerta(Puerta puerta, Puerta nuevaPuerta){
         if (this.puertas.length > 0){
            for(int i=0; i< puertas.length; i++){
                if(puertas[i]==puerta){
                    puertas[i]=nuevaPuerta;
                    return true;
                }
            }
        }
        return false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public Puerta[] getPuertas() {
        return puertas;
    }

    public void setPuertas(Puerta[] puertas) {
        this.puertas = puertas;
    }
    
    
}
