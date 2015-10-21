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
public class Item {
    private String descricao;
    private Double gold;
    private Double cash;
    
    public Item(){
        this.cash = 0.0;
        this.gold = 0.0;
        this.descricao = null;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getGold() {
        return gold;
    }

    public void setGold(Double gold) {
        this.gold = gold;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }
    
    public String resumo(){
        return "ITEM"+this.descricao + "\n"+
                "CASH"+this.cash+ "\n"+
                "GOLD"+this.gold+ "\n";
    }
    
}
