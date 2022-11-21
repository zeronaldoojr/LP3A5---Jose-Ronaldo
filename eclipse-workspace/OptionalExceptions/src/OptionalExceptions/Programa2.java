package OptionalExceptions;
import java.io.*;
import java.util.List;
public class Programa2 {
	public static void main(String[] args)
    {
  
        
        List.of(12, 34, 67, 19, 32, 4, 54, 33)
            .stream()
            .filter(element -> element % 2 == 0)
            .forEach(
                element -> System.out.println(element));
    }

}
