/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2025_act1;

import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class Persona {
    
    private float peso;
    private float estatura;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    
    public float calcularIMC(){
        float imc = getPeso() / (getEstatura() * getEstatura());
        
        if(imc < 18.5){
            JOptionPane.showMessageDialog(null, "BAJO PESO");
        } else if(imc >= 18.5 && imc <= 24.9){
            JOptionPane.showMessageDialog(null, "NORMAL");
        } else if(imc >= 25 && imc <= 29.9){
            JOptionPane.showMessageDialog(null, "SOBREPESO");
        } else if(imc >= 30 && imc <= 34.9){
            JOptionPane.showMessageDialog(null, "OBESIDAD I");
        } else if(imc >= 35 && imc <= 39.9){
            JOptionPane.showMessageDialog(null, "OBESIDAD II");
        } else if(imc > 40){
            JOptionPane.showMessageDialog(null, "OBESIDAD III");
        } 
        
        return imc;
    }
    
}
