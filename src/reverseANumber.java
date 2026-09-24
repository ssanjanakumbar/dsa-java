public class reverseANumber {
        public int reverseNumber(int n){
            int revNum = 0;
            while(n>0){
                int LastDigit = n%10;
                revNum = (revNum*10)+LastDigit;
                n = n/10;
            }
            return revNum;
        }
        public static void main(String[] args){
            reverseANumber sol = new reverseANumber();
            System.out.println(sol.reverseNumber(456));

        }
    }
