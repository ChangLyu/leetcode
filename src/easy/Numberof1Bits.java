package easy;

public class Numberof1Bits {
	/**
	 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has 
	 * (also known as the Hamming weight).For example, the 32-bit integer ’11' has 
	 * binary representation 00000000000000000000000000001011, so the function should return 3.
	 **/

	//using recursive method, the number of 1 bits equals to(all the binary bits of n move to right for one, add
	// the number of 1 in the missing place, which can get through n&1)
    public int hammingWeight1(int n) {
        if(n==0){
            return 0;
        }else{
    return hammingWeight1(n>>>1)+(n&1);
        }
}
    // a logical AND between any number and the mask 11 gives us the least
    //significant bit of this number.
    //To check the next bit, we shift the mask to the left by one.
    public int hammingWeight2(int n){
    	int mask=1;
    	int bits=0;
    	for(int i=0; i <32; i++){
    		if ((n &mask)!=0){
    			bits++;
    		}
    	}
    	mask <<=1;
    	return bits;
    }
    //In the binary representation, the least significant 11-bit in nn always corresponds to a 00-bit in n - 1n−1. Therefore, anding the two numbers nn and n - 1n−1 always 
    //flips the least significant 11-bit in nn to 00, and keeps all other bits the same
    public int hammingWeight3(int n){
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    	
    }
}
