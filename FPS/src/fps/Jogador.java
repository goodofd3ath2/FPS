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
public class Jogador {
    public String nome;
    public String senha;
    public Armas arma;
    public Personagem personagem;
    public Double cash;
    public Double gold;
    public Granada granada;

    public Jogador(){
        this.nome ="mssiedler";
        this.arma=new Armas();
        this.arma.setDescricao("JK-98 Paraguay");
        this.arma.setDano(5.1);
        this.arma.setMunicao(80);
        this.arma.setPente(20);
        this.personagem = new Personagem();
        this.personagem.setDescricao("Noob");
        this.cash=0.0;
        this.gold=200.0;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Double getGold() {
        return gold;
    }

    public void setGold(Double gold) {
        this.gold = gold;
    }

    public Granada getGranada() {
        return granada;
    }

    public void setGranada(Granada granada) {
        this.granada = granada;
    }
    
    public String resumo(){
        return this.getNome() +"\n"+ this.arma.getDescricao()
                    +"\n"+ this.getCash()+ "\n"+
                    this.getGold()+ "\n"+ this.personagem.getDescricao();
    }
}
