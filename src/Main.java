public class Main {
    public static void main(String[] args) {
        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < 7; y++) {
                if (y < 7 - (x + 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("00");
                }
            }
            System.out.println();
        }
    }
}