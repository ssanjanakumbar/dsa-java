class pat14 {
    public void pattern14(int n){
        for(int i=0 ; i<n ; i++){
            for(char j='A' ; j<= 'A'+1 ;j++)
                System.out.print(j);
            System.out.println();
        }
    }
    public static void main(String[] args){
        pat14 s= new pat14();
        s.pattern14(4);
    }
}
