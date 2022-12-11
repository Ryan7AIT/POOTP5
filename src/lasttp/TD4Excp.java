package lasttp;

public class TD4Excp {

	public static void main(String[] args) throws LessException {

		DivisionExcp d = new DivisionExcp(14,0);
		
		try {
			d.division();
		} catch(LessException e) {
			System.out.println(e.toString());

		}
		
		
	}	


}
