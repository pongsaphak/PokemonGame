package pokemongame;

public class PokemonSkill{
	private String name;
	private float damage;

	public PokemonSkill(String name){
		this.name = name;
		this.damage = damage;
	}

	public String getName(){
		return this.name;
	}

	public float getDamage(String name){
		switch(name){
			case "Flame burst":
				damage = 90;
				break;
			case "thunderbolt":
				damage = 120;
				break;
			case "tail whip":
				damage = 80;
				break;
			case "Water Pulse":
				damage = 100;
				break;
                        case "Tackle":
                                damage =  50;
				break;
		}
		
                return this.damage;
	}

	
}
