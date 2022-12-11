package lasttp;

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
		
		try {
			int p = this.num / this.deno;	
			System.out.println(p);
			
			return p;
		}
		
		catch (ArithmeticException e){
			System.out.println("U cant divide by 0 !!!");
			
			return (float) 0.0;
		}
		}
		
		
		
		
		
		
		
		
		
		
	
	}
	
	

}
