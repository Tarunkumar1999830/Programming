public class NumberPatternExact {
    public static void main(String[] args) {
        int num = 1;

        for (int i = 3; i >= 1; i--) {   // rows: 3, 2, 1
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
