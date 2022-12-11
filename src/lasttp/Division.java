package lasttp;

public class Division {
	
	private int num;
	private int deno;

	public Division(int num, int deno) {
		this.num = num;
		this.deno = deno;
	}
	
	public float division() {
		System.out.println(this.num);
		System.out.println(this.deno);
		System.out.println(this.num / this.deno);
		return this.num / this.deno;
		
		
		
	
	}

}
