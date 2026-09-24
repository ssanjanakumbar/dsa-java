public class pat3 {
    public void patteren3(int n){
        for(int i=1 ; i <=n ; i++){
            for(int j=1 ; j<=i ;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=4;
        pat3 s = new pat3();
        s.patteren3(n);
    }
}
