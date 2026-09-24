class pat20 {
    public void pattern20(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <=i+1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=((2*n-2)-2*i); j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i = 1; i < n; i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j<=(2*i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }



    }
    public static void main(String[] args){
        pat20 m = new pat20();
        m.pattern20(4);
    }
}