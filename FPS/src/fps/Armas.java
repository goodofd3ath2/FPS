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
    public Integer municao;
    public Integer balaspente;

    public Integer getMunicao() {
        return municao;
    }

    public void setMunicao(Integer municao) {
        this.municao = municao;
    }

    public Integer getBalaspente() {
        return balaspente;
    }

    public void setBalaspente(Integer balaspente) {
        this.balaspente = balaspente;
    }

    public Armas(){
        this.dano = null;
        this.pente = null;
        this.peso = null;
        this.balaspente = 0;
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
    
    public Boolean atirar(){
        if(balaspente==0){
            if(municao == 0){
                return false;
            }
            recarregar();
        }
        else
        {
            balaspente = balaspente - 1;
        }
      return true;  
    }
    
    public Boolean recarregar(){
        if(balaspente == 0){
            balaspente = 40;
            municao = municao - 40;
            
            return true;
        }
        else
        {
            return true;
        }
    }
    public String resumo(){
        return super.resumo()+"DANO: "+this.dano+ "\n"+
                "PENTE: "+this.pente+ "\n"+
                "PESO: "+this.peso+ "\n";
    }
    
    
}
