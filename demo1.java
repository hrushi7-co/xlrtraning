public class demo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        // Compare three variables
        if (a > b && a > c) {
            System.out.println("a is the largest.");
        } else if (b > a && b > c) {
            System.out.println("b is the largest.");
        } else if (c > a && c > b) {
            System.out.println("c is the largest.");
        } else {
            System.out.println("There is a tie between the largest values.");
        }
  }
}