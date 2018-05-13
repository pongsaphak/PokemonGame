/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 *
 * @author user
 */
public class AttackGui extends JFrame{
    private String[] pokemonName;
    
    public AttackGui(PokemonFarm pokemonFarm){
            super("Attack");
            Container c = getContentPane();
            c.setLayout(new BorderLayout());
            
            pokemonName = new String[pokemonFarm.getPokemonAmount()];
            for (int i = 0; i < pokemonFarm.getPokemonAmount(); i++) {
                pokemonName[i] = pokemonFarm.getPokemon(i);
            }
            
            
            
            //pokemon1
            JPanel start = new JPanel();
            start.setLayout(new FlowLayout()); 
            JLabel jName1 = new JLabel("Pokemon Name1: ");
            JComboBox pokemon1 = new JComboBox(pokemonName);
            JButton enter1 = new JButton("Enter");
            JLabel pokeball1 = new JLabel();
            pokeball1 .setHorizontalAlignment(JLabel.CENTER);
            Icon img1 = new ImageIcon(getClass().getResource("Pokeball.png"));
            pokeball1 .setIcon(img1);
            
            //pokemon2
            JPanel center = new JPanel();
            center.setLayout(new FlowLayout()); 
            JLabel jName2 = new JLabel("Pokemon Name2: ");
            JComboBox pokemon2 = new JComboBox(pokemonName);
            JButton enter2 = new JButton("Enter");
            JLabel pokeball2 = new JLabel();
            pokeball2 .setHorizontalAlignment(JLabel.CENTER);
            Icon img2 = new ImageIcon(getClass().getResource("Pokeball.png"));
            pokeball2 .setIcon(img2);
        
            //attack&&exit
            JPanel end = new JPanel();
            end.setLayout(new GridLayout(0,2));
            JLabel Name1 = new JLabel("CP of 1");
            JLabel Name2 = new JLabel("CP of 2");
            JButton attack = new JButton("Attack");
            JButton exit = new JButton("Exit");
            
            
            attack.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String name1 = (String) pokemon1.getSelectedItem();
                    String name2 = (String) pokemon2.getSelectedItem();
                    
                    Pokemon pokemon2 = pokemonFarm.getPokemonAttack(name1, name2);
                    Pokemon pokemon1= pokemonFarm.getPokemonName(name1);
                    
                    switch (name1){
                        case "Pikachu": Name1.setText("CP of Pikachu : " +pokemon1.getCp());break;
                        case "Charmander": Name1.setText("CP of Charmander : "+pokemon1.getCp());break;
                        default : Name1.setText("CP of "+ name1 + ": "+pokemon1.getCp());break;
                    }

                    switch (name2){
                        case "Pikachu": Name2.setText("CP of Pikachu : "+pokemon2.getCp());break;
                        case "Charmander": Name2.setText("CP of Charmander : "+pokemon2.getCp());break;
                        default : Name2.setText("CP of "+ name2 + ": "+pokemon2.getCp());break;
                    }
                }
            });
            
            exit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    setVisible(false);
                }
            });
            
            start.add(jName1);
            start.add(pokemon1);
            start.add(enter1);
            start.add(pokeball1);
            c.add(start,BorderLayout.PAGE_START);
            
            center.add(jName2);
            center.add(pokemon2);
            center.add(enter2);
            center.add(pokeball2);
            c.add(center,BorderLayout.CENTER);
            
            end.add(Name1);
            end.add(Name2);
            end.add(attack);
            end.add(exit);
            c.add(end, BorderLayout.PAGE_END);
          
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(600,600);
            setVisible(true);
        }
}
