public class pat6 {
        public void pattern6(int n){
            for(int i=0;i<n;i++){
                for(int j=0; j<n-i; j++){
                    System.out.print(j+1);
                }
            System.out.println();
        }}
        public void main(String[] args){
            pat6 s = new pat6();
            s.pattern6(4);
        }
    }

