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
public class Granada extends Item{
    public Integer dano;
    public Double peso;
    public Double areaexplo;

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAreaexplo() {
        return areaexplo;
    }

    public void setAreaexplo(Double areaexplo) {
        this.areaexplo = areaexplo;
    }
    
    public String resumo(){
        return super.resumo()+"DANO"+this.dano+"\n"+"PESO"+this.peso+
                                "\n"+"AREA DE EXPLOSÃO"+this.areaexplo;
    }
}
