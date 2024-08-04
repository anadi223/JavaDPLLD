import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class adsd {

    public static int f(int A) {
        if (A <= 2) return A - 1;

        return f(A - 1) + f(A - 2);
    }
}

class Ab{
    public static void main(String[] args) {

//
//        String promptString = """
//    Write me {genre} poetry about {theme}
//    """;
//        System.out.println(promptString);

        String[] words = {"Anadi","Mishra","Anadi","ABCD"};

        String[] newWords = Arrays.stream(words).distinct().toArray(String[]::new);

        Runnable r = () -> System.out.println("Hello");
        Thread t = new Thread( () -> System.out.println("HJello world"));
        t.start();
        new Thread(()-> System.out.println("HEllo woo")).start();

        List<Integer> list  = List.of(1,2,2,3,3,4);
        System.out.println(list.stream().reduce(0,(a,b) ->a+b));
        List<Integer> ans = list.stream().filter(num -> num>5).collect(Collectors.toList());
        System.out.println(ans);
        System.out.println("-----------------");
        int m = 5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<m;j++){
                System.out.print(" ");
            }
            m--;
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
