 public class task4 {
 public static void main(String[] args) {
        int rows = 7;
        int cols = 7;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int value = 4 - Math.min(Math.min(i, rows - 1 - i), Math.min(j, cols - 1 - j));
                System.out.print(value);
            }
            System.out.println();
        }
    }
}