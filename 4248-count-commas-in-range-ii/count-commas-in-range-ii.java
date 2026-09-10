class Solution {
    public long countCommas(long n) {
        long totalCommas = 0;
        long start = 1000;
        long commasPerNum = 1;

        while(n >= start){
            long end = start * 1000 - 1;
            long numbersInRange = Math.min(n, end) - start + 1;

            totalCommas += numbersInRange * commasPerNum;

            start *= 1000;
            commasPerNum++;
        }
        return totalCommas;
    }
}