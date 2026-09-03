class Solution {
    public double myPow(double x, int n) {
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        double pow = 1;
        while(n != 0){
            if((n & 1) != 0){ // equivalent to if((n % 2) != 0)
                pow *= x;
            }
            x *= x;
            n >>>= 1; // equivalent to n = n / 2
        }
        return pow;
    }
}