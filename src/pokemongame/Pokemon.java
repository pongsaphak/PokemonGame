package pokemongame;

abstract class Pokemon{
	
	protected float cp;
	protected String name;
	protected String[] types;
        protected String skill;
        protected float weight;
        protected float gainweight;
        protected int marry;

	public Pokemon(String name,
                       float weight,
                       float gainweight,
                       float cp,
                       String skill,
                       String[] types){
            
		this.name = name;
		this.weight = weight;
                this.cp = cp;
                this.skill = skill;
                this.types = types;
                this.gainweight = gainweight;
                marry=0;
	}

	

	public String getName(){
		return this.name;
	}
	
	public void eat(){
		weight += gainweight;
	}
        public void Addblood(){
                cp += 50;
	}
        public float getWeight() {
                return weight;
        }
	public String getTypes() {
            String ty = "";
            for(String type: types){
                ty += type+ "";
            }
            return ty;
        }
        public float getCp() {
            return cp;
        }
        public void Attack(float a) {
                cp-=a;
                weight -=2;
        }
        
        public String getSkill() {
               return this.skill;
        }
        
        public int getMarry(){
            return this.marry;
        }
        public void Marry(){
            marry += 1;
        }
        public void print(){
        System.out.println("Pokemon name: " + name);
        System.out.print("        Type: ");
        for(String type: types){
            System.out.print(type+",");
        }
        System.out.println();
        System.out.println("      Weight: " + weight);
        System.out.println(" Skill: " + skill);
        System.out.println("  CP: " + cp);
        System.out.println("------------------------------------------");
    }

	

	

        

}
