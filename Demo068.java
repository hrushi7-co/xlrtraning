public class Demo068 {
        public static void main(String[] args) {
            int[] numbers = {12, 7, 8, 15, 20, 31, 40};
            int evenCount = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) { 
                    evenCount++;
                }
            }
            System.out.println("Count of even numbers in the array: " + evenCount);
        }
    }
    
    
