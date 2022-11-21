package Stream;

import java.util.*;
import static java.util.stream.Collectors.*;

public class FlatMap {
	public static List<String> transform(List<List<String>> collection) {
		List<String> newCollection = new ArrayList<>();
		for (List<String> subCollection : collection) {
			for (String value : subCollection) {
				newCollection.add(value);
			}
		}
		return newCollection;
	}

}
