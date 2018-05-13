/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;
import java.util.*;
import java.io.*;
/**
 *
 * @author user
 */
public class CommandParser {
    private PokemonFarm pokemonFarm;
	private Scanner commandScanner;
	private boolean isRunning;

	public CommandParser(PokemonFarm pokemonFarm){
		this.pokemonFarm = pokemonFarm;
		commandScanner = new Scanner(System.in);
		isRunning = false;
	}

	public void run(){
		isRunning = true;
		String command;

		System.out.println("Hello Pokemon Game");
		while(isRunning){
			System.out.print("\nWhat do you want? Type: ");
			command = commandScanner.next();
			// System.out.println("You type \'"+command+"\'");
			if(command.equals("quit")){
				isRunning = false;
				System.out.println("Good bye, See you next time.");
			}
//			else if(command.equals("add"))
//				this.addPokemon();
//			else if(command.equals("list"))
//				this.listPokemons();
//			else if(command.equals("feed"))
//				this.feedPokemons();
		}

	}

	private void addPokemon(){
		commandScanner.nextLine();
		// input name weight length
		String pokemonType = "Eevee";
		String name = "name";
		float weight = 10f;
		float stepLength = 5f;

//		if(pokemonType.equals("Eevee")){
//			Eevee eevee = new Eevee(name, weight, stepLength);
//			pokemonFarm.addPokemon(eevee);
//		}

	}

//	private void listPokemons(){
//		System.out.println("==========================================");
//		System.out.println("Pokemon List");
//		System.out.println("==========================================");
//		this.pokemonFarm.list();
//		System.out.println("==========================================");
//	}

	private void feedPokemons(){
		System.out.print("Which pokemon do you want to feed? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.feed("all");
		}
	}

}
