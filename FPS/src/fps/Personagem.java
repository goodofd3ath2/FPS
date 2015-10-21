/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fps;

/**
 *
 * @author Aluno
 */
public class Personagem extends Item{
    public Double vida;
    public Double altura;
    public Double resistencia;

    public Personagem(){
        this.altura = null;
        this.resistencia = 0.0;
        this.vida = 100.0;
    }
    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getResistencia() {
        return resistencia;
    }

    public void setResistencia(Double resistencia) {
        this.resistencia = resistencia;
    }
    
    public String resumo(){
        return super.resumo()+"VIDA"+this.vida+ "\n"+
                "ALTURA"+this.altura+ "\n"+
                "RESISTENCIA"+this.resistencia+ "\n";
        
    }
}
