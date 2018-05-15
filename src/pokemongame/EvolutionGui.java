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
public class EvolutionGui extends JFrame{
    private PokemonFarm pokemonFarm;
    private String[] pokemonName;
    
    public EvolutionGui(PokemonFarm pokemonFarm){
        super("Evolution");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        this.pokemonFarm = pokemonFarm;
        
        pokemonName = new String[pokemonFarm.getPokemonAmount()];

        for (int i = 0; i < pokemonFarm.getPokemonAmount(); i++) {
            pokemonName[i] = pokemonFarm.getPokemon(i);
        }
           
        JLabel pokemonicon = new JLabel();
        pokemonicon.setHorizontalAlignment(JLabel.CENTER);
        Icon img1 = new ImageIcon(getClass().getResource("evolution.jpg"));
        pokemonicon.setIcon(img1);
        
        JPanel Center = new JPanel();
        Center.setLayout(new GridLayout(1,0));
        
        JLabel pokemonpic = new JLabel();
        pokemonpic .setHorizontalAlignment(JLabel.CENTER);
        Icon img2 = new ImageIcon(getClass().getResource("Pokeball.png"));
        pokemonpic .setIcon(img2);
        
        
        JPanel rightside = new JPanel();
        rightside.setLayout(new GridLayout(0,1));
        
        //check exp pokemon
        JComboBox pokemonList = new JComboBox(pokemonName);
        JButton check = new JButton("Check EXP.");
        
        JLabel name = new JLabel("");
        name.setHorizontalAlignment(JLabel.CENTER);
        JButton evolution = new JButton("Evolution");
        
        rightside.add(pokemonList);
        rightside.add(check);
        rightside.add(name);
        rightside.add(evolution);
       
        check.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
            new addGui(pokemonFarm);
          }
        });
        
        
        c.add(pokemonicon, BorderLayout.PAGE_START);
        Center.add(pokemonpic);
        Center.add(rightside);
        c.add(Center,BorderLayout.CENTER);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setVisible(true);
    } 
    
}
