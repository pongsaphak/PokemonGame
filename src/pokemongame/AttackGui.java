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
            JLabel pokemonpic1 = new JLabel();
            pokemonpic1 .setHorizontalAlignment(JLabel.CENTER);
            Icon img1 = new ImageIcon(getClass().getResource("Pokeball.png"));
            pokemonpic1 .setIcon(img1);
            
            //pokemon2
            JPanel center = new JPanel();
            center.setLayout(new FlowLayout()); 
            JLabel jName2 = new JLabel("Pokemon Name2: ");
            JComboBox pokemon2 = new JComboBox(pokemonName);
            JButton enter2 = new JButton("Enter");
            JLabel pokemonpic2 = new JLabel();
            pokemonpic2 .setHorizontalAlignment(JLabel.CENTER);
            Icon img2 = new ImageIcon(getClass().getResource("Pokeball.png"));
            pokemonpic2 .setIcon(img2);
        
            //attack&&exit
            JPanel end = new JPanel();
            end.setLayout(new GridLayout(0,2));
            JLabel Cp1 = new JLabel("CP of 1");
            JLabel Cp2 = new JLabel("CP of 2");
            JLabel weight1 = new JLabel("Weight of 1");
            JLabel weight2 = new JLabel("Weight of 2");
            JButton attack = new JButton("Battle");
            JButton exit = new JButton("Exit");
            
            
            attack.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String name1 = (String) pokemon1.getSelectedItem();
                    String name2 = (String) pokemon2.getSelectedItem();
                    
                    Pokemon pokemon2 = pokemonFarm.getPokemonAttack(name1, name2);
                    Pokemon pokemon1= pokemonFarm.getPokemonName(name1);
                    
                    switch (name1){
                        case "Pikachu": Cp1.setText("CP of Pikachu : " +pokemon1.getCp());
                                        weight1.setText("Weight of Pikachu : " + pokemon1.getWeight());
                                        break;
                        case "Charmander": Cp1.setText("CP of Charmander : "+pokemon1.getCp());
                                           weight1.setText("Weight of Charmander : " + pokemon1.getWeight());
                                           break;
                        default : Cp1.setText("CP of "+ name1 + " : "+pokemon1.getCp());
                                  weight1.setText("Weight of "+ name1 + " : " + pokemon1.getWeight());
                                  break;
                    }

                    switch (name2){
                        case "Pikachu": Cp2.setText("CP of Pikachu : "+pokemon2.getCp());
                                        weight2.setText("Weight of Pikachu : " + pokemon2.getWeight());
                                        break;
                        case "Charmander": Cp2.setText("CP of Charmander : "+pokemon2.getCp());
                                           weight2.setText("Weight of Charmander : " + pokemon2.getWeight());
                                           break;
                        default : Cp2.setText("CP of "+ name2 + ": "+pokemon2.getCp());
                                  weight2.setText("Weight of "+ name2 + " : " + pokemon2.getWeight());
                                  break;
                    }
                }
            });
            
            enter1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String name = (String) pokemon1.getSelectedItem();
                    Pokemon pokemon= pokemonFarm.getPokemonName(name);
                    
                    switch (name){
                        case "Pikachu": Cp1.setText("CP of Pikachu : " +pokemon.getCp());
                                        weight1.setText("Weight of Pikachu : " + pokemon.getWeight());
                                        pokemonpic1.setIcon(new ImageIcon(getClass().getResource( "./imagefiles/Pikachu.png")));
                                        break;
                        case "Charmander": Cp1.setText("CP of Charmander : "+pokemon.getCp());
                                           weight1.setText("Weight of Charmander : " + pokemon.getWeight());
                                           pokemonpic1.setIcon(new ImageIcon(getClass().getResource( "./imagefiles/Charmander.png")));
                                           break;
                        default : Cp1.setText("CP of "+ name + " : "+pokemon.getCp());
                                  weight1.setText("Weight of "+ name + " : " + pokemon.getWeight());
                                  pokemonpic1.setIcon(new ImageIcon(getClass().getResource( "./imagefiles/" + name +".png")));
                                  break;
                    }
                }
            });
            
            
            enter2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                    String name = (String) pokemon2.getSelectedItem();
                    Pokemon pokemon= pokemonFarm.getPokemonName(name);
                    
                     switch (name){
                        case "Pikachu": Cp2.setText("CP of Pikachu : "+pokemon.getCp());
                                        weight2.setText("Weight of Pikachu : " + pokemon.getWeight());
                                        pokemonpic2.setIcon(new ImageIcon(getClass().getResource( "./imagefiles/Pikachu.png")));
                                        break;
                        case "Charmander": Cp2.setText("CP of Charmander : "+pokemon.getCp());
                                           weight2.setText("Weight of Charmander : " + pokemon.getWeight());
                                           pokemonpic2.setIcon(new ImageIcon(getClass().getResource( "./imagefiles/Charmander.png")));
                                           break;
                        default : Cp2.setText("CP of "+ name + ": "+pokemon.getCp());
                                  weight2.setText("Weight of "+ name + " : " + pokemon.getWeight());
                                  pokemonpic2.setIcon(new ImageIcon(getClass().getResource( "./imagefiles/" + name +".png")));
                                  break;
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
            start.add(pokemonpic1);
            c.add(start,BorderLayout.PAGE_START);
            
            center.add(jName2);
            center.add(pokemon2);
            center.add(enter2);
            center.add(pokemonpic2);
            c.add(center,BorderLayout.CENTER);
            
            end.add(Cp1);
            end.add(Cp2);
            end.add(weight1);
            end.add(weight2);
            
            end.add(attack);
            end.add(exit);
            c.add(end, BorderLayout.PAGE_END);
          
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(600,600);
            setVisible(true);
        }
}
