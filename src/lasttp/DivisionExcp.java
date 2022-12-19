package lasttp;

import java.util.InputMismatchException;

public class DivisionExcp {
	
	private int num;
	private int deno;
	
	

	public DivisionExcp(int num, int deno) {
		
		this.num = num;
		this.deno = deno;	}
	
	public float division() throws LessException {
		System.out.println(this.num);
		System.out.println(this.deno);
		
		if(this.num < this.deno ) {
			throw new LessException();
			
		}else {
			int p = this.num / this.deno;	
			System.out.println(p);
			return p;

		}
		
		
		
		
		
		
		
		
		
		
	
	}
	
	

}
