import java.util.LinkedList;
import java.util.Queue;

class SortArrayByParity {
	public int[] sortArrayByParityII(int[] A) {
		Queue<Integer> oddQueue = new LinkedList<>();
		Queue<Integer> evenQueue = new LinkedList<>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				evenQueue.add(A[i]);
			} else {
				oddQueue.add(A[i]);
			}
		}
		for (int i = 0; i < A.length; i++) {
			if (i % 2 == 0) {
				A[i] = evenQueue.remove();
			} else {
				A[i] = oddQueue.remove();
			}
		}
		return A;

	}

}