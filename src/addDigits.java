public class addDigits {
        public int AddDigits(int num) {
            while(num>=10){
                int sum=0;
                while(num>0){
                    sum=sum+num%10;
                    num=num/10;
                }
                num=sum;
            }
            return num;
        }
        public static void main(String[] args){
            addDigits sol=new addDigits();
            System.out.println(sol.AddDigits(529));
        }
}
