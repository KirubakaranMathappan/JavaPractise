package org.test;

public class PrimeNumber {
		public static void main(String[] args) {
			
			        int n = 20;

			        for (int i = 2; i <= n; i++) {
			            boolean isPrime = true;

			            for (int j = 2; j <= Math.sqrt(i); j++) {
			                if (i % j == 0) {
			                    isPrime = false;
			                    break;
			                }
			            }

						if (isPrime) {
			                System.out.print(i + " ");
			            }
					    }
	    
		                 System.out.println();
		                 
			                int num = 28;
			                boolean isPrime = true;

			                // Step 1: Handle edge cases
			                if (num <= 1) {
			                    isPrime = false;
			                } 
			                // Step 2: Check divisibility from 2 to √numS
			                else {
			                    for (int i = 2; i <= Math.sqrt(num); i++) {
			                        if (num % i == 0) {
			                            isPrime = false;
			                            break;
			                        }
			                    }
			                }

			                // Step 3: Print result
			                if (isPrime) {
			                    System.out.println(num + " is a Prime number");
			                } else {
			                    System.out.println(num + " is NOT a Prime number");
			                }
			       

		
		}
			
}

