package loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Foglea on 6/17/2017.
 */
public class PrimeNumberPrinter {
    public static void main (String []args){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        String input;
        try{
        System.out.println("This program prints out the number of prime numbers you want printed ");
        System.out.println("How many prime numbers do you want to print?  ");
        input= br.readLine();
        int maxPrimeCount= Integer.parseInt(input);
        for(int count = 2, primecount = 0; primecount < maxPrimeCount; count++ ){
            if(checkPrime(count) ){
                System.out.println(count);
                primecount++;
            }
        }

    }
    catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
    }
}
private static boolean checkPrime( int number){ //returns either true or false (boolean function)*/
    boolean isPrime= true;
    if (number ==2){
        isPrime = true;
    }
    else if (number % 2 ==0){
        isPrime = false;
    }
    else {
        int maxCount = (int)Math.ceil(Math.sqrt(number));
        for (int count=3; count <= maxCount; count = count + 2){
            if (number % count == 0){
                isPrime= false;
                break;
            }
        }
    }
    return isPrime;
}

}