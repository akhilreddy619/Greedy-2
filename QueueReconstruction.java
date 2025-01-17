import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
//Time Complexity : O(N^2)
//Space Complexity : O(N)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

/**
 * Sort the list in descending order of heights and ascending order of k values.
 * then start putting the people arrays in the kth position of the respective
 * people array.
 *
 */
class Solution {
	public int[][] reconstructQueue(int[][] people) {
		Arrays.sort(people, (a, b) -> {
			if (a[0] == b[0])
				return a[1] - b[1];
			return b[0] - a[0];
		});
		List<int[]> list = new LinkedList<>();
		for (int[] p : people) {
			list.add(p[1], p);
		}
		return list.toArray(new int[people.length][2]);
	}
}

public class QueueReconstruction {

}
