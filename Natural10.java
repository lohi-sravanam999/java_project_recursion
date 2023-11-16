class Natural10 
{
	public static void main(String[] args) 
	{
		Naturalnum(10);
		
	}
	public static void Naturalnum(int n){
		if(n>=1){
		System.out.println(n);
		
		Naturalnum(n-1);
		}
	}
}
