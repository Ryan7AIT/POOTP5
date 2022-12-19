package lasttp;

public class TD4Excp {

	public static void main(String[] args) throws LessException {

		DivisionExcp d = new DivisionExcp(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		
		try {
			d.division();
		} catch(ArithmeticException e) {
			
			System.out.println("PLead don arg1 != 0");

			System.out.println(e.toString());

		} catch(NumberFormatException e) {
			
			System.out.println("PLease give intergers as numbers");

			System.out.println(e.toString());

			
		} catch(LessException e) {
			
			System.out.println("PLease give a > b");

			System.out.println(e.toString());
		}
		
	
		
		
		
	}	


}
