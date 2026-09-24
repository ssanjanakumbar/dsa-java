static class reverseNum {
    public int rn(int n){
        int revNum = 0;
        while(n>0){
            int LastDigit = n%10;
            revNum = (revNum*10)+LastDigit;
            n = n/10;
        }
        return revNum;
    }
}
    public static void main(String[] args){
        reverseNum s = new reverseNum();
        int ans = s.rn(158);
        System.out.println("rev num is:"+ ans);
    }

