public class demo9 {
    public static void main(String[] args) {
        // Declare variables
        int a = 5;
        int b = -10;
        boolean flag = true;

        // Unary plus and minus
        System.out.println("Original value of a: " + a);
        System.out.println("Unary plus (+a): " + (+a));
        System.out.println("Unary minus (-a): " + (-a));

        System.out.println("Original value of b: " + b);
        System.out.println("Unary plus (+b): " + (+b));
        System.out.println("Unary minus (-b): " + (-b));

        // Increment and decrement
        System.out.println("\nIncrement and Decrement:");
        System.out.println("Original value of a: " + a);
        System.out.println("Pre-increment (++a): " + (++a)); // a = 6
        System.out.println("Post-increment (a++): " + (a++)); // a = 7 (after this line)
        System.out.println("Value of a after post-increment: " + a);

        System.out.println("Pre-decrement (--a): " + (--a)); // a = 6
        System.out.println("Post-decrement (a--): " + (a--)); // a = 5 (after this line)
        System.out.println("Value of a after post-decrement: " + a);

        // Logical complement
        System.out.println("\nLogical Complement:");
        System.out.println("Original value of flag: " + flag);
        System.out.println("Logical NOT (!flag): " + (!flag));
    }
}
