package numbers;

public class CountPrimes {
    public static int countPrimes(int n) {
        int count=0;
        for(int i=1; i<n;i++){
            if(isPrime(i)){
                count++;
            };
        }
        return count;
        
    }
    public static boolean isPrime(int n){
        if(n==1)  return false;
        for(int i=2; i<=Math.sqrt(n) ;i++){
            if(isPrime(i)){
                if(n%i==0){
                    return false;
                }
            };
        }
        return true;
    }
   public static void main(String[] args){
	   System.out.println(countPrimes(499979));
   }
}
