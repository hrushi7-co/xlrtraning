public class Demo054 {
        public static int add(int a, int b) {
            return a + b;
        }
        public static int add(int a, int b, int c) {
            return a + b + c;
        }
        public static double add(double a, double b) {
            return a + b;
        }
    
        public static void main(String[] args) {
            int sum1 = add(10, 20);  
            int sum2 = add(10, 20, 30);  
            double sum3 = add(10.5, 20.5);  
            System.out.println("Sum of two integers: " + sum1);
            System.out.println("Sum of three integers: " + sum2);
            System.out.println("Sum of two doubles: " + sum3);
        }
    }

