package za.co.tegres.code.challenges.testdome;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * <p>
 * Write a function that, when passed a list and a target sum, returns, efficiently with respect to time used,
 * two distinct zero-based indices of any two of the numbers, whose sum is equal to the target sum.
 * If there are no two numbers, the function should return null.
 *</p>
 *
 * <p>
 * For example, findTwoSum(new int[] {3, 1, 5, 7, 5, 9}, 10) should return a single dimensional array with
 * two elements and contain any of the following pairs of indices:
 *</p>
 *
 * <p>
 * 0 and 3 (or 3 and 0) as 3 + 7 = 10<br/>
 * 1 and 5 (or 5 and 1) as 1 + 9 = 10<br/>
 * 2 and 4 (or 4 and 2) as 5 + 5 = 10<br/>
 * </p>
 */
public class TwoSum {
    private static int target = 10;

    public static int[] findTwoSum(int[] list, int sum) {
        int[] sumArray = new int[2];
        Collection<Integer> collection = Arrays.stream(list)
                .boxed()
                .collect(Collectors.toList());

        return sumArray;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] {3, 1, 5, 7, 5, 9}, 10);
        System.out.println(indices[0] + " and " + indices[1]);
    }

}
