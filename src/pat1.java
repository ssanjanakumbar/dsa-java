class pat1 {
    public void pattern1(int n){
        for(int i =0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 4;
        pat1 s=new pat1();
        s.pattern1(n);

    }
}