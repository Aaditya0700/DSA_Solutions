class Solution {
    Set<Integer> s = new HashSet<>();
    void solve(int digits[],boolean vis[],int num){
        if(num>99){
            if(num%2==0)s.add(num);
            return;
        }
        for(int i=0;i<digits.length;i++){
            if(vis[i]==true)continue;
            num=num*10+digits[i];
            vis[i]=true;
            solve(digits,vis,num);
            vis[i]=false;
            num/=10;
        }
    }
    public int totalNumbers(int[] digits) {
        boolean vis[]=new boolean[digits.length];
        solve(digits,vis,0);
        return s.size();
    }
}