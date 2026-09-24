class countDigit {
    public int countDigits(int n) {
        if(n==0) return 1;
        int cnt=0;
        while(n>0){
            n=n/10;
            cnt=cnt+1;
        }
        return cnt;

    }
    public static void main(String[] args){
        countDigit sol = new countDigit();
        int ans=sol.countDigits(7784);
        System.out.println("the count of the given num is:"+ ans);
        }
    }