class pat19 {
    public void pattern19(int n) {

        //upeer half
        for (int i = 0; i < n; i++) {
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
        //lower half
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
    }
    public static void main(String[] Args){
        pat19 sol = new pat19();
        sol.pattern19(4);
    }
}