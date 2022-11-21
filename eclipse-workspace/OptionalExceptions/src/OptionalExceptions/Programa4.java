package OptionalExceptions;

import java.util.*;
import java.util.function.*;

public class Programa4 {
	public static void main(String[] args)
    {
  
        // create a Optional
        Optional<Integer> op
            = Optional.empty();
  
        // print supplier
        System.out.println("Optional: "
                           + op);
  
        try {
  
            // orElseGet supplier
            System.out.println("Value by orElseGet"
                               + "(Supplier) method: "
                               + op.orElseGet(
                                     () -> (int)(Math.random() * 10)));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}
