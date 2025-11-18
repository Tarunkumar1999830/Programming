public class triangle {

	public static void main(String[] args) {
        int number = 7;
        int count = number - 1;
        for (int k = 1; k <= number; k++) {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            count--;
            for (int i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
            System.out.println();
 
        }
    }
}
