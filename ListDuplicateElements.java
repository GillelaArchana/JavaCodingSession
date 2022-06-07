import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


//returns the duplicates in a given List.

public static Set<Integer> findDupsInAList(List<Integer> list) {
    Set<Integer> dups = new HashSet<>();
    return  list
                .stream()
                .filter(num -> !dups.add(num))
                .collect(Collectors.toSet());
}



//returns a list after removing duplicates

public static List<Integer> removeDupsInAList(List<Integer> list) {
    return  list
                .stream()
                .distinct()
                .collect(Collectors.toList());
}
