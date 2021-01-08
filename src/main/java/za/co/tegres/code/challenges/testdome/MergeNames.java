package za.co.tegres.code.challenges.testdome;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        String[] concat = Stream.concat(Arrays.stream(names1), Arrays.stream(names2))
                .toArray(String[]::new);
        Set<String> unique = new HashSet<>();
        Arrays.stream(concat).forEach(name -> unique.add(name));
        return unique.toArray(new String[unique.size()]);
    }
}
