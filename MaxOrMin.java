import java.util.Arrays;
import java.util.List;


//returns max element in a given list

public static int getMaxEleInAList(List<Integer> list) {
    return  list
                .stream()
                .max(Integer::compare)
                .get();
}


//returns min and max elements array from a given array

public static int[] getMinAndMaxElementsInAArray(int[] array) {
    int[] minAndMax = new int[2];
    int min;
    int max;

    min = Arrays.stream(array)
            .min()
            .getAsInt();
    minAndMax[0] = min;

    max = Arrays.stream(array)
            .max()
            .getAsInt();
    minAndMax[1] = max;

    return minAndMax;
}
