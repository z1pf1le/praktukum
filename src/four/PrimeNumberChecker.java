package four;

public class PrimeNumberChecker {

        public static int isPrime(int number){
            int count = 0;
//            if(number <= 1) {
//                System.out.println("zaglushka");
//            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i != 0) {
                    count++;
                }
            }
            return count;
        }

    }

