package OptionalExceptions;

import java.util.*;

public class Programa1 {
	public static void main(String[] args)
    {
  
        // create a Optional
        Optional<Integer> op1
            = Optional.ofNullable(9455);
  
        // print value
        System.out.println("Optional 1: "
                           + op1);
    }
	

}
