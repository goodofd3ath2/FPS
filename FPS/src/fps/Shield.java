/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fps;

/**
 *
 * @author Leticia
 */
public class Shield extends Item{
    public Integer peso;
    public String cor;
    public String material;
    public Double tamanho;

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }
    
    public String resumo(){
        return super.resumo()+"PESO: "+this.peso+"\n"+
                                "COR: "+this.cor+"\n"+
                                "MATERIAL: "+this.material+"\n"+
                                  "TAMANHO: "+this.tamanho;
    }
    
}
