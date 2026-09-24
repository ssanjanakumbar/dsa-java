class pat11 {
    public void pattern11(int n){
        for(int i =1;i<=n;i++){
            int start =1;
            if(i%2==0) start=0;
            for(int j=1;j<=i;j++){
                System.out.print(start);
                System.out.print(" ");
                start=1-start;
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        pat11 sol=new pat11();
        sol.pattern11(4);
    }
}