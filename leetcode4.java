class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0)
        {
            return false;
        }
        int temp = x,ans = 0;
        int i=0,p=1;
        while(x>0)
        {
            ans*=10;
            int m = x%10;
            ans += m;
            
            i++;
            x/=10;
        }
        System.out.println(ans);
        if(ans == temp)
        {
            return true;
        }
        return false;
        
    }
}