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
public class Normal extends Pokemon{
    public Normal(String name, float weight,String skill,float cp){
        super(name, weight,2.2f, cp ,skill, new String[] {"Normal"});
    }
}
