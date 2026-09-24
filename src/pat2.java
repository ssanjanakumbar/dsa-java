public class pat2 {
    public void pattern(int n){
        for(int i = 0 ; i<n ; i++){
            for(int j = 0; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        pat2 p = new pat2();
        p.pattern(8);

    }
}
