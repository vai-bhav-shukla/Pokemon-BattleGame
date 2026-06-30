import java.util.Scanner;
public class pokemon {
    Scanner sc=new Scanner(System.in);
    int choice;
    String poke="";
    String poke2="";
     int Ember=20;
     int Flamethrower=30;
     int FireBlast=40;
     int Slash=15;
     int WaterGun=20;
     int Bubble=25;
     int Hydro=40;
     int Bite= 15;
     int Vine=20 ;
     int Razor=30;
     int Solar=40;
     int Tackle=15;
     int hp1=100;
     int hp2=100;
     int select;
     int move;
     int moveno;
    public void Mainmenu(){
        System.out.println("\t Main menu:- ");
        System.out.println("\t Choose a pokemon for battle");
        System.out.println("\t 1: Charizard (Fire) ");
        System.out.println("\t 2: Blastoise (Water) ");
        System.out.println("\t 3: Venesaur (Grass) ");
    }
    public String choice(){
        System.out.println("Enter the choice of the pokemon: ");
        choice=sc.nextInt();
        switch(choice){
          case 1: 
            poke="Charizard";
          break;
          case 2: 
          poke="Blastoise";
          break;
          case 3: 
          poke="Venesaur";
          break;
          default:
            System.out.println("Invalid" );
            break;
        }
        System.out.println("The pokemon chosen is:"+poke);
        return poke;
    }
   public String enemy()
{
    String array[] = {"Charizard","Blastoise","Venesaur"};

    do
    {
        int random = (int)(Math.random() * 3);
        poke2 = array[random];
    }
    while(poke2.equalsIgnoreCase(poke));

    return poke2;
}
    public void info(){
     if(poke.equalsIgnoreCase("Charizard"))
     {
        System.out.println(poke);
        System.out.println("Fire type");
        System.out.println("HP: 100");
        System.out.println("Moves: ");
        System.out.println("\tFlamethrower: 30");
        System.out.println("\tFire blast: 40");
        System.out.println("\tSlash: 15");
        System.out.println("\tEmber: 20");
     }
     else if(poke.equalsIgnoreCase("Blastoise"))
     {   System.out.println(poke);
         System.out.println("Water type");
         System.out.println("HP: 100");
         System.out.println("Moves: ");
         System.out.println("\tWater Gun: 20\n"+
                            "\tBubble Beam: 25\n"+
                            "\tHydro Pump:40\n"+
                            "\tBite: 15");
     }
    else if(poke.equalsIgnoreCase("Venesaur"))
     {  System.out.println(poke);
        System.out.println("Grass type");
        System.out.println("HP: 100");
        System.out.println("Moves: ");
        System.out.println("\tVine Whip: 20\n" + "\tRazor Leaf: 30\n" + "\tSolar Beam: 40\n" +"\tTackle: 15");
     }

       else
     {
        System.out.println("Invalid");
     }
   }


    public void battle(){
        if(poke.equalsIgnoreCase("Charizard")){
            System.out.println("Moves: ");
            System.out.println("HP of the player:"+hp1);
            System.out.println("HP of the enemy:"+hp2);
            System.out.println("1. Ember          - 20 Damage\n" +
                                "2. Flamethrower   - 30 Damage\n" +
                                "3. Fire Blast     - 40 Damage\n" +
                                "4. Slash          - 15 Damage");
            select=sc.nextInt();
            System.out.println("================================");
            switch(select){
            case 1:
                 if(poke2.equalsIgnoreCase("Venesaur")){
                    hp2-=Ember*2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Ember");

                 }
                 else if(poke2.equalsIgnoreCase("Blastoise")){
                    hp2-=Ember/2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Ember");
                 }
                 else{
                    hp2-=Ember;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Ember");
                 }
            break;

            case 2:
                    if(poke2.equalsIgnoreCase("Venesaur")){
                    hp2-=Flamethrower*2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Flamethrower");
                 }
                 else if(poke2.equalsIgnoreCase("Blastoise")){
                    hp2-=Flamethrower/2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Flamethrower");
                 }
                 else{
                    hp2-=Flamethrower;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Flamethrower");
                 }
             break;
             case 3:
                    if(poke2.equalsIgnoreCase("Venesaur")){
                    hp2-=FireBlast*2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Fire Blast");
                 }
                 else if(poke2.equalsIgnoreCase("Blastoise")){
                    hp2-=FireBlast/2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Fire Blast");
                 }
                 else{
                    hp2-=FireBlast;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Fire Blast");
                 }
             break;
             case 4:
                    hp2-=Slash;
                    System.out.println("HP of the Enemy: "+hp2);
                     System.out.println("Move used: Slash");
             break;

             default: 
                 System.out.println("Re check");
             break;
                }
                if(hp2<=0){
                System.out.println("Enemy Pokemon fainted! You win!");
                hp2=0;         
            }
            }
          

            
        if(poke.equalsIgnoreCase("Venesaur")){
            System.out.println("HP :"+hp1);
            System.out.println("Moves: \n"+"1. Vine Whip: 20\n "+ "Razor Leaf: 30\n"+"Solar Beam: 40\n "+"Tackle: 15");
            System.out.println("");
            select=sc.nextInt();
            System.out.println("===============================");
            switch(select){
            case 1:
                 if(poke2.equalsIgnoreCase("Blastoise")){
                    hp2-=Vine*2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Vine Whip");
                 }
                 else if(poke2.equalsIgnoreCase("Charizard")){
                    hp2-=Vine/2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Vine Whip");
                 }
                 else{
                    hp2-=Vine;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Vine Whip");
                 }
            break;

            case 2:
                    if(poke2.equalsIgnoreCase("Blastoise")){
                    hp2-=Razor*2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Razor Leaf");
                 }
                 else if(poke2.equalsIgnoreCase("Charizard")){
                    hp2-=Razor/2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Razor Leaf");
                 }
                 else{
                    hp2-=Razor;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Razor Leaf");
                 }
             break;
             case 3:
                    if(poke2.equalsIgnoreCase("Blastoise")){
                    hp2-=Solar*2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Solar Beam");
                 }
                 else if(poke2.equalsIgnoreCase("Charizard")){
                    hp2-=Solar/2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Solar Beam");
                 }
                 else{
                    hp2-=Solar;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Solar Beam");
                 }
             break;
             case 4:
                    hp2-=Tackle;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Tackle");
             break;

             default: 
                 System.out.println("Re check");
             break;
            }
            }
        
        if(poke.equalsIgnoreCase("Blastoise")){
            System.out.println("HP :"+hp1);
            System.out.println("Moves: \n"+"1- Water Gun: 20\n"+"2- Bubble Beam: 25\n"+"3- Hydro Pump:40\n"+"4- Bite: 15");
            select=sc.nextInt();
            System.out.println("===============================");
            System.out.println("===============================");   
            switch(select){
            case 1:
                 if(poke2.equalsIgnoreCase("Charizard")){
                    hp2-=WaterGun*2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Water Gun");
                 }
                 else if(poke2.equalsIgnoreCase("Venesaur")){
                    hp2-=WaterGun/2;
                    System.out.println("HP of the Enemy: "+hp2);
                     System.out.println("Move used: Water Gun");
                 }
                 else{
                    hp2-=WaterGun;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Water Gun");
                 }
            break;

            case 2:
                    if(poke2.equalsIgnoreCase("Charizard")){
                    hp2-=Bubble*2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Bubble Beam");
                 }
                 else if(poke2.equalsIgnoreCase("Venesaur")){
                    hp2-=Bubble/2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Bubble Beam");
                 }
                 else{
                    hp2-=Bubble;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Bubble Beam");
                 }
             break;
             case 3:
                    if(poke2.equalsIgnoreCase("Charizard")){
                    hp2-=Hydro*2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Hydro Pump");
                 }
                 else if(poke2.equalsIgnoreCase("Venesaur")){
                    hp2-=Hydro/2;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Hydro Pump");
                 }
                 else{
                    hp2-=Hydro;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Hydro Pump");
                 }
             break;
             case 4:
                    hp2-=Bite;
                    System.out.println("HP of the Enemy: "+hp2);
                    System.out.println("Move used: Bite");
             break;

             default: 
                 System.out.println("Re check"); 
             break;
            }
            }
   
        }
    
    public void enemybattle(){
        if(poke2.equalsIgnoreCase("Charizard")){
         System.out.println("HP of the player: "+hp1);
         System.out.println("HP of the enemy: "+hp2);
         System.out.println("===============================");
         System.out.println("===============================");
            move=(int)(Math.random()*4)+1;            
            switch(move){
            case 1:
                 if(poke.equalsIgnoreCase("Venusaur")){
                    hp1-=Ember*2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Ember");
                 }
                 else if(poke.equalsIgnoreCase("Blastoise")){
                    hp1-=Ember/2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Ember");
                 }
                 else{
                    hp1-=Ember;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Ember");
                 }
            break;

            case 2:
                    if(poke.equalsIgnoreCase("Venusaur")){
                    hp1-=Flamethrower*2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Flamethrower");
                 }
                 else if(poke.equalsIgnoreCase("Blastoise")){
                    hp1-=Flamethrower/2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Flamethrower");
                 }
                 else{
                    hp1-=Flamethrower;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Flamethrower");
                 }
             break;
             case 3:
                    if(poke.equalsIgnoreCase("Venusaur")){
                    hp1-=FireBlast*2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Fire Blast");
                 }
                 else if(poke.equalsIgnoreCase("Blastoise")){
                    hp1-=FireBlast/2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Fire Blast");
                 }
                 else{
                    hp1-=FireBlast;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Fire Blast");
               }
             break;
             case 4:
                    hp1-=Slash;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Slash");
             break;

             default: 
                 System.out.println("Re check");
             break;
            }
         }

            
        if(poke2.equalsIgnoreCase("Venusaur"))
         {  System.out.println("===============================");
            System.out.println("HP of the player: "+hp1);
            System.out.println("HP of the enemy: "+hp2);
            System.out.println("===============================");
            
               move=(int)(Math.random()*4)+1;
            switch(move){
            case 1:
                 if(poke.equalsIgnoreCase("Blastoise")){
                    hp1-=Vine*2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Vine Whip");
                 }
                 else if(poke.equalsIgnoreCase("Charizard")){
                    hp1-=Vine/2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Vine Whip");
                 }
                 else{
                    hp1-=Vine;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Vine Whip");
                 }
            break;

            case 2:
                    if(poke.equalsIgnoreCase("Blastoise")){
                    hp1-=Razor*2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Razor Leaf");
                 }
                 else if(poke.equalsIgnoreCase("Charizard")){
                    hp1-=Razor/2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Razor Leaf");
                 }
                 else{
                    hp1-=Razor;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Razor Leaf");
                 }
             break;
             case 3:
                    if(poke.equalsIgnoreCase("Blastoise")){
                    hp1-=Solar*2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Solar Beam");
                 }
                 else if(poke.equalsIgnoreCase("Charizard")){
                    hp1-=Solar/2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Solar Beam");
                 }
                 else{
                    hp1-=Solar;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Solar Beam");
                 }
             break;
             case 4:
                    hp1-=Tackle;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Tackle");
             break;

             default: 
                 System.out.println("Re check");
             break;
            }
             if(hp1<=0){
            System.out.println("Your Pokemon fainted! You lose!");
           }
         }
        if(poke2.equalsIgnoreCase("Blastoise")){
           System.out.println("HP of the player: "+hp1);
         System.out.println("HP of the enemy: "+hp2);
         System.out.println("===============================");
         System.out.println("===============================");
            move=(int)(Math.random()*4)+1;
            switch(move){
            case 1:
                 if(poke.equalsIgnoreCase("Charizard")){
                    hp1-=WaterGun*2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Water Gun");
                 }
                 else if(poke.equalsIgnoreCase("Venusaur")){
                    hp1-=WaterGun/2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Water Gun");
                 }
                 else{
                    hp1-=WaterGun;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Water Gun");
                 }
            break;

            case 2:
                    if(poke.equalsIgnoreCase("Charizard")){
                    hp1-=Bubble*2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Bubble");
                 }
                 else if(poke.equalsIgnoreCase("Venusaur")){
                    hp1-=Bubble/2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Bubble");
                 }
                 else{
                    hp1-=Bubble;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Bubble");
                 }
             break;
             case 3:
                    if(poke.equalsIgnoreCase("Charizard")){
                    hp1-=Hydro*2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Hydro Pump");
                 }
                 else if(poke.equalsIgnoreCase("Venusaur")){
                    hp1-=Hydro/2;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Hydro Pump");
                 }
                 else{
                    hp1-=Hydro;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Hydro Pump");
                 }
             break;
             case 4:
                    hp1-=Bite;
                    System.out.println("HP of the player: "+hp1);
                    System.out.println("Move used: Bite");
             break;

             default: 
                 System.out.println("Re check");
             break;
            }
            }
            }
    public void loop(){
         
          while(hp1 > 0 && hp2 > 0){  
            moveno++;
         System.out.println("================================");  
     System.out.println(poke+" "+hp1+" vs "+poke2+" "+hp2); 
        System.out.println("================================");   
        System.out.println("Move no."+moveno);

    battle(); 
    if(hp2<=0)break;
    enemybattle();   
}
    if(hp1<=0){
      System.out.println("===============================");
      System.out.println("Your pokemon fainted! You loose ");
      System.out.println("===============================");
      }
      else { 
      System.out.println("===============================");
      System.out.println("Enemy pokemon fainted! You win ");
      System.out.println("===============================");
   
      }
   }
   public static void main(String[] args) {
       pokemon obj=new pokemon();
         obj.Mainmenu();
        obj.choice();
       obj.enemy();
      obj.info();
      obj.loop();
         
   }
}






