package OptionalExceptions;

import java.util.*;

public class Programa3 {
	public static void main(String[] args)
    {
  
        
        Optional<Integer> op
            = Optional.of(9455);
  
        
        System.out.println("Optional: "
                           + op);
  
      
        System.out.println("Value by orElse"
                           + "(100) method: "
                           + op.orElse(100));
    }
}
