import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strumien {

public static void main(String[]args){

        List<Integer> list = Stream.iterate(0,i-> i+1)

        .peek(i -> System.out.println("Przekształcam: " + i))
            .filter(i-> i > 100)
        .peek(i -> System.out.println("Przekształcam: " + i))
            .filter(i-> i < 1000)
        .peek(i -> System.out.println("Przekształcam: " + i))
            .filter(i-> i%5 == 0)
        .peek(i -> System.out.println("Przekształcam: " + i))
            .limit(10)
       .peek(i -> System.out.println("Przekształcam: " + i))
            .map(i -> i * 3)
            .collect(Collectors.toList());

        System.out.println(list);

        }
}

