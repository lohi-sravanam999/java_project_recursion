class Palindromerec{
	public static void main(String[] args){
           int n=1675747;
           int rev=0;
           System.out.println(reverse(n,rev));
		   }	
    public static int reverse(int n, int rev){
        if(n==0){
        return rev;
        }
      else{
         int r=n%10;
         rev=rev*10+r;
       }
         return reverse(n/10,rev);
      }
}