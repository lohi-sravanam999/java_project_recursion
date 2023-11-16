class Factorial 
{
	public static void main(String[] args) 
	{
		int n=5,fact=1;
		fact(n)=n*fact(n-1);
		System.out.println(fact(n));
	}
	public static int fact(int n){
		if(n==0){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}
}
