public class pat4 {
    public void pattern4(int n){
        for(int i= 1 ; i<=n ;i++){
            for(int j =1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pat4 s=new pat4();
        s.pattern4(4);
    }
}
