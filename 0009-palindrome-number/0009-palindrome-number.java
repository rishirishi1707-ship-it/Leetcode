class Solution {
    public boolean isPalindrome(int x) {
        Scanner sc=new Scanner (System.in);
        int original=x;
        int rev=0;
        
        if(x<0){
            System.out.println(false);
        }
      while(x>0){
        int digit=x%10;
        rev=rev*10+digit;
        x=x/10;
      }
        
 return original==rev;
        
    }
}
    
