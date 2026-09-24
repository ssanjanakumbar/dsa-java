public class largestDigitInANum {
        public int largestDigit(int n) {
            int largest =0;
            while(n>0){
                int lastDigit = n%10;
                if(lastDigit>largest) largest=lastDigit;
                n=n/10;
            }
            return largest;

        }
        public static void main(String[] args){
            largestDigitInANum sol= new largestDigitInANum();
            System.out.println(sol.largestDigit(25));
        }
    }

