public class snakeLadder {
         public static void main(String[] args) {
                System.out.println("Welcome to snake and ladder game");
		//initializing variables
		int startPosition = 0;
		int new_Position = 0;
		int winning_Position = 100;
		int ladder = 1;
                int snake = 2;
		System.out.println("player starts at position " + startPosition);
		//using while loop to loop till condition for winning is reached
		while (new_Position != winning_Position){
		//generating random dice number
		int rollDice = (int)(Math.random() * 6) + 1;
                System.out.println("number on dice is " + rollDice);
		//generating option for snake ladder and no play using random
		int options = (int)(Math.random() * 3);
                System.out.println("option check is " + options);
		//using if statement to check options and adjust position accordingly
		if (options == ladder){
                        new_Position = (new_Position + rollDice);
			if (new_Position > winning_Position)  //ensures if position goes above 100 then stay in previous position
                                new_Position = (new_Position - rollDice);
				System.out.println("player is at " + new_Position);
					if (new_Position == winning_Position)
                                        	break;      //used break to get out of loop if condition is met
		}
                else if (options == snake){
                        new_Position = (new_Position -  rollDice);
				if (new_Position < startPosition) //ensures if position goes below 0 then starts from 0
                                        new_Position = startPosition;
					System.out.println("player is at " + new_Position);
						if (new_Position == winning_Position)
                                        		break;
		}
                else{ 
                        new_Position = new_Position;
			System.out.println("player is at " + new_Position);
				if (new_Position == winning_Position)
                                        break;
		}
		}
	}
}