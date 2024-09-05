
public class SimpleTest {

	public static void main(String[] args) {

		SimpleTest	test = new SimpleTest();
		test.run(args);
	}
	
	private void run(String[] args) {
		
		if (args.length == 0) {
			
			System.out.println("No input arguments specified");
		}
		else {
			
			System.out.print("Input Arguments:");
			for (String curArg : args) {
				
				System.out.print(" " + curArg);
			}
			System.out.println();
		}
		
		System.out.println("This Simple Test Worked");
	}

}
