public class snakeLadder {
         public static void main(String[] args) {
                System.out.println("Welcome to snake and ladder game");
		int startPosition = 0;
		System.out.println("player starts at position " + startPosition);
		//generating random dice number
		int rollDice = (int)(Math.random() * 6) + 1;
                System.out.println("number on dice is " + rollDice);
	}
}