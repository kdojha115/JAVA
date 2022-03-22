// 374. Guess Number Higher or Lower

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int left = 1,right = n;
        while(left<=right)
        {
            int randNum = left + (right-left)/2;
            if(guess(randNum) == 0)
            {
                return randNum;
            }
            else if(guess(randNum) == 1)
            {
                left = randNum+1;
            }
            else{
                right = randNum-1;
            }
        }
        return -1;
        
    }
}