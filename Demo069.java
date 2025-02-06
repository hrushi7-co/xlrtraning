public class Demo069 {
        public static void main(String[] args) {
            int[] numbers = {12, 7, 8, 15, 20, 31, 40};
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];  
            }
            System.out.println("Sum of all elements in the array: " + sum);
        }
    }
