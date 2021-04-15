public class snakeLadder {
         public static void main(String[] args) {
                System.out.println("Welcome to snake and ladder game");
		//initializing variables
		int startPosition = 0;
		int new_Position = 0;
		int ladder = 1;
                int snake = 2;
		System.out.println("player starts at position " + startPosition);
		//generating random dice number
		int rollDice = (int)(Math.random() * 6) + 1;
                System.out.println("number on dice is " + rollDice);
		//generating option for snake ladder and no play using random
		int options = (int)(Math.random() * 3);
                System.out.println("option check is " + options);
		//using if statement to check options and adjust position accordingly
		if (options == ladder){
                        new_Position = (new_Position + rollDice);
		}
                else if (options == snake){
                        new_Position = (new_Position -  rollDice);
		}
                else{ 
                        new_Position = new_Position;
		}
		//printing new position after dice roll and option check
		System.out.println("player is at " + new_Position);
	}
}