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

public class Gui extends JFrame{
    private PokemonFarm pokemonFarm;
    
    public Gui(PokemonFarm pokemonFarm){
        super("POKEMON");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        this.pokemonFarm = pokemonFarm;

        JLabel pokemonicon = new JLabel();
        pokemonicon.setHorizontalAlignment(JLabel.CENTER);
        Icon img1 = new ImageIcon(getClass().getResource("International_Pokémon_logo.svg.png"));
        pokemonicon.setIcon(img1);
        
        
        JPanel Center = new JPanel();
        Center.setLayout(new GridLayout(0,2));
        
        JLabel pokeball = new JLabel();
        pokeball .setHorizontalAlignment(JLabel.CENTER);
        Icon img2 = new ImageIcon(getClass().getResource("Pokeball.png"));
        pokeball .setIcon(img2);
        
        
        JPanel rightside = new JPanel();
        rightside.setLayout(new GridLayout(0,1));
        
        JButton add = new JButton("Add");
        JButton feed = new JButton("Feed");
        JButton attack = new JButton("Attack");
        JButton list = new JButton("List");
        JButton evolution = new JButton("Evolution");
        
        rightside.add(feed);
        rightside.add(add);
        rightside.add(list);
        rightside.add(attack);
        rightside.add(evolution);
        

        add.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
            new addGui(pokemonFarm);
          }
        });
        list.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
            new ListGui(pokemonFarm);
          }
            
        });
        
        feed.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
            new feedGui(pokemonFarm);
          }
        });
        
        attack.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
            new AttackGui(pokemonFarm);
          }
        });
        
        evolution.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new EvolutionGui(pokemonFarm);
            }
        });

        c.add(pokemonicon, BorderLayout.PAGE_START);
        
        Center.add(pokeball);
        Center.add(rightside);
        c.add(Center, BorderLayout.CENTER);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setVisible(true);
    }
}
