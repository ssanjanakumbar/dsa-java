public class fibnocci {
        public int fib(int n) {
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            int a = 0;
            int b = 1;
            int i = 2;
            while (i <= n) {
                int c = a + b;
                a = b;
                b = c;
                i++;
            }
            return b;
        }
        public static void main(String[] args){
            fibnocci fibo=new fibnocci();
            System.out.println(fibo.fib(6));

        }
    }
