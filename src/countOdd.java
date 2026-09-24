class countOdd {
    public int countOddDigit(int n) {
        int countOdd = 0;
        while (n > 0) {
            int LastDigit = n % 10;
            if (LastDigit % 2 == 1) countOdd = countOdd + 1;
            n = n / 10;
        }
        return countOdd;

    }


    public static void main(String[] args) {
        countOdd s = new countOdd();
        int ans = s.countOddDigit(2577);
        System.out.println("answer is:" + ans);
    }
}



