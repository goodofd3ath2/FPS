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
public class Armas extends Item{
    public Double peso;
    public Double dano;
    public Integer pente;

    public Armas(){
        this.dano = null;
        this.pente = null;
        this.peso = null;
    }
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getDano() {
        return dano;
    }

    public void setDano(Double dano) {
        this.dano = dano;
    }

    public Integer getPente() {
        return pente;
    }

    public void setPente(Integer pente) {
        this.pente = pente;
    }
    
    public String resumo(){
        return super.resumo()+"DANO"+this.dano+ "\n"+
                "PENTE"+this.pente+ "\n"+
                "PESO"+this.peso+ "\n";
    }
    
    
}
