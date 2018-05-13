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
public class ListGui extends JFrame{
    private String[] pokemonName;
    
    public ListGui(PokemonFarm pokemonFarm) {
        super("LIST");
        Container c = getContentPane();
        c.setLayout(new GridLayout(0,1));
        
        pokemonName = new String[pokemonFarm.getPokemonAmount()];

        for (int i = 0; i < pokemonFarm.getPokemonAmount(); i++) {
            pokemonName[i] = pokemonFarm.getPokemon(i);
        }
       
        JLabel pokemonicon = new JLabel();
        pokemonicon.setHorizontalAlignment(JLabel.CENTER);
        Icon img1 = new ImageIcon(getClass().getResource("International_Pokémon_logo.svg.png"));
        pokemonicon.setIcon(img1);
        
        
        //center 
        JPanel center = new JPanel();
        center.setLayout(new FlowLayout());
        
        JComboBox pokemonList = new JComboBox(pokemonName);
        
        JButton status = new JButton("Status");
        JButton back = new JButton("Back");
        
        //status
        //lift list
        JPanel leftside = new JPanel();
        leftside.setLayout(new GridLayout(1,0));
        JLabel pokemonpic = new JLabel();
        pokemonpic.setHorizontalAlignment(JLabel.CENTER);
        Icon img2 = new ImageIcon(getClass().getResource("Pokeball.png"));
        pokemonpic .setIcon(img2);
        
        
        
        //right list
        JPanel rightside = new JPanel();
        rightside.setLayout(new GridLayout(0,1));
        
        JLabel name = new JLabel("");
        name.setHorizontalAlignment(JLabel.CENTER);
        JLabel type = new JLabel("");
        type.setHorizontalAlignment(JLabel.CENTER);
        JLabel weight = new JLabel("");
        weight.setHorizontalAlignment(JLabel.CENTER);
        JLabel skill = new JLabel("");
        skill.setHorizontalAlignment(JLabel.CENTER);
        JLabel cp = new JLabel("");
        cp.setHorizontalAlignment(JLabel.CENTER);

        rightside.add(name);
        rightside.add(type);
        rightside.add(weight);
        rightside.add(skill);
        rightside.add(cp);
      
        
        
        status.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String Names = (String) pokemonList.getSelectedItem();
                Pokemon pokemon = pokemonFarm.getPokemonName(Names);
                //pokemonpic.setIcon(new ImageIcon(getClass().getResource( pokemon.getClass().getSimpleName() + ".jpg")));
                name.setText("Name : " + pokemon.getName());
                type.setText("Type : " + pokemon.getTypes());
                weight.setText("Weight : " + pokemon.getWeight());
                skill.setText("Skill : " + pokemon.getSkill());
                cp.setText("CP : " + pokemon.getCp());
                
            }
        });
        
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        
        
        center.add(pokemonList);
        center.add(status);
        center.add(back);
        
        leftside.add(pokemonpic);
        leftside.add(rightside);
        
        c.add(pokemonicon);
        c.add(center);
        c.add(leftside);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,900);
        setVisible(true);
    }
    
}
