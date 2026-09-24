class pat17 {
    public void pattern17(int n){
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<=n-i ; j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++) {
                System.out.print(j);
            }
            for(int j=0 ; j<=n-i ; j++){
                System.out.print("  ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        pat17 s = new pat17();
        s.pattern17(4);
    }
}
