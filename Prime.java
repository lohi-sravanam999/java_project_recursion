class Prime 
{
	public static void main(String[] args) 
	{
		if (primeNum(5,2)){

		System.out.println("is a prime");
		}
		else{
			System.out.println("not a prime");
		}
	}
	public static boolean primeNum(int n,int i){
		if(n<=1){
			return false;
		}
		if(i>n/2){
			return true;
		}
		if(n%i==0){
			return false;
		}
	
		
		return(n,i+1);
	
	}
}
