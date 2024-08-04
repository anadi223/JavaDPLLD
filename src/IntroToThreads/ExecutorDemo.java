package IntroToThreads;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ABC abc = new ABC();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(abc);
        System.out.println(future.get());
        executorService.shutdown();

    }
}

class ABC implements Callable<Integer> {
    List<Integer> count = List.of(1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6,1,2,3,4,5,6,7,2,3,5,1,5,5,6,7,8,6);


    @Override
    public Integer call() throws Exception {
        long startTime = System.currentTimeMillis();
        for(int i : count){
            System.out.print(i+" ");
        }
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println("Time taken: " + (endTime - startTime));
        return (int) (endTime - startTime);
    }
}
