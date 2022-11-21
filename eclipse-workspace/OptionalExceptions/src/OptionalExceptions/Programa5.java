package OptionalExceptions;

import java.util.*;
import java.util.function.*;

public class Programa5 {

	public static void main(String[] args)
    {
  
        // create a Optional
        Optional<Integer> op
            = Optional.of(9455);
  
        // print supplier
        System.out.println("Optional: "
                           + op);
  
        // orElseThrow supplier
        System.out.println(
            "Value by orElseThrow("
            + "ArithmeticException::new) method: "
            + op.orElseThrow(
                  ArithmeticException::new));
    }
}
