public class pat16 {
    public void pattern16(int n){
        for(int i=0 ; i<n ; i++){
            for(int j=0; j<=i ; j++){
                System.out.print((char)('A'+i));
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pat16 s = new pat16();
        s.pattern16(4);
    }
}
