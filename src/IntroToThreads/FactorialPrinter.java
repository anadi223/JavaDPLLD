package IntroToThreads;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactorialPrinter extends Thread {
    private long number;
    private BigInteger result;
    private boolean isFinished;
    FactorialPrinter(long number){
        this.number = number;
        result = BigInteger.valueOf(0); //Or BigInteger.ZERO;
        isFinished = false;
    }
    @Override
    public void run() {
//Business Logic
        result = factorial(number);
        isFinished = true;
    }
    BigInteger factorial(long n){
        BigInteger ans = BigInteger.ONE;
        for(long i=2; i<=n; i++){
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
    BigInteger getResult(){
        return result;
    }
    boolean isFinished(){
        return isFinished;
    }
}
 class Main {
    // Task calculate Factorial of List of Numbers
    public static void main(String[] args) throws InterruptedException {
        List<Long> inputNumbers = Arrays.asList(100000000L, 3435L, 35435L, 2324L,
                4656L, 23L, 5556L);
        List<FactorialPrinter> threads = new ArrayList<>();
        for(long number:inputNumbers){
            FactorialPrinter t = new FactorialPrinter(number);
//System.out.println(t.getState());
            threads.add(t);

        }
        for(Thread t:threads){
            t.start();
        }
        for(Thread t:threads){
            t.join(2000);
        }
//--------------------//
        for(int i=0;i<inputNumbers.size();i++){
            FactorialPrinter t = threads.get(i); //ith Thread Object
            if(t.isFinished()){
                System.out.println(t.getResult());
            }
            else{
                System.out.println("Couldn't complete calc in 2s");
            }
        }
        System.out.println("Main is completed!");
    }
}