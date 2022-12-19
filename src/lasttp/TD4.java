package lasttp;

public class TD4 {

	public static void main(String[] args) {

		Division d = new Division(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		
		System.out.println(d.division());
		
	}	

}
// problems : 
// 1. division par 0  => ArithmeticException
// 2. 