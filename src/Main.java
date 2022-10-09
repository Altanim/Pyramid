public class Main {
    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (y < 10 - (x + 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}