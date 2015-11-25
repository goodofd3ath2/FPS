/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fps;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class FPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jogador jogador = new Jogador();
        
        JOptionPane.showMessageDialog(null, jogador.resumo());
        
        Armas segunda = new Armas();
        segunda.setDescricao("AK-47");
        
        jogador.setArma(segunda);
        JOptionPane.showMessageDialog(null, jogador.resumo());
        
       
        Personagem perso = new Personagem();
        
        perso.setAltura(1.60);
        perso.setResistencia(10.0);
        perso.setVida(100.0);
        perso.setDescricao("AK-47");
        perso.setGold(300.0);
        
        //JOptionPane.showMessageDialog(null, perso.resumo());
        
        Armas arma = new Armas();
        arma.setDano(22.2);
        arma.setPente(40);
        arma.setMunicao(160);
        arma.setPeso(1.2);
        //JOptionPane.showMessageDialog(null, arma.resumo());
        for (int i = 1; i <200; i++) {
            arma.atirar();
            System.out.println(arma.getMunicao());
        }
        
        Shield shi = new Shield();
        shi.setCor("azul");
        shi.setMaterial("Metal");
        shi.setPeso(12);
        shi.setTamanho(1.2);
        JOptionPane.showMessageDialog(null, shi.resumo());
        
        Granada granada = new Granada();
        granada.setDano(16);
        granada.setAreaexplo(14.5);
        granada.setPeso(1.2);
        JOptionPane.showMessageDialog(null, granada.resumo());
    }
    
}
