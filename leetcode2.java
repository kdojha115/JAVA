//69. Sqrt(x)

class Solution {
    public int mySqrt(int x) {
        if(x<2)
        {
            return x;
        }
        int left = 2,right = x/2;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            long midsq = (long)mid*mid;
            if(midsq == x)
            {
                return mid;
            }
            else if(midsq > x)
            {
                right = mid-1;
            }
            else if(midsq < x)
            {
                left = mid+1;
            }
        }
        return right;
        
    }
}
