public class Main {

	public static void main(String[] args) {
		Gumball gumballMachine = new Gumball(5);

		
		System.out.println("\n\nTesting Gumball Machine 1");
		System.out.println("\nCase1: Insert Quarter");
		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();

		
		System.out.println("\n\nTesting Gumball Machine 2");
        Type2GumballMachine M2 = new Type2GumballMachine(3);

        System.out.println("\nCase1: Only 25 cents are inserted");
		M2.insertCoin( 25 );
        M2.turnCrank();

        System.out.println("\nCase2: Remaining 25 cents are inserted");
        M2.insertCoin( 25 );
        M2.turnCrank();

        System.out.println("\nCase3: Insert any coins other than quarter are inserted");
        M2.insertCoin( 5 );
        M2.turnCrank();
  


        System.out.println("\n\nTesting Gumball Machine 3");
        Type3GumballMachine M3 = new Type3GumballMachine(2);

        System.out.println("\n\nCase1: Only 25 cents are inserted");
        M3.insertCoin( 25 );
        M3.turnCrank();

        System.out.println("\nCase2: Remaining 25 cents are inserted");
        M3.insertCoin( 25 );
        M3.turnCrank();

        System.out.println("\nCase3: 3 Nickle + 1 Dime + 1 Quarter are inserted");
        M3.insertCoin( 5 );
        M3.insertCoin( 5 );
        M3.insertCoin( 5 );
        M3.insertCoin( 10 );
        M3.insertCoin( 25 );
        M3.turnCrank();

        System.out.println("\nCase4: Amount is not correct");
        M3.insertCoin( 10 );
        M3.insertCoin( 10 );
        M3.insertCoin( 5 );
        M3.turnCrank();
        
        System.out.println("\nCase5: Gumball all are used");
        M3.insertCoin( 25 );
        M3.insertCoin( 25 );
        M3.turnCrank();



    }
}