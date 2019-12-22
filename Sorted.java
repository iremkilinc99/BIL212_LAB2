import java.util.PriorityQueue;
import java.util.Stack;

public class Sorted<T> {

	public boolean isSorted(Stack<Integer> s) {
		Stack<T> sortControl = new Stack<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		boolean ordered = true;

		if (s.size() == 1 || s.isEmpty())
			return true;

		Integer firstData = s.pop();
		pq.add(firstData);
		while (s.size() != 0) {
			if (firstData > s.peek()) {
				ordered = false;
			}
			firstData = s.pop();
			pq.add(firstData);
		}
		System.out.println("Queuemuz:"+pq);
		System.out.println("Baþtaki Stack:"+(sortControl = reConst(pq)));

		return ordered;
	}

	private Stack<T> reConst(PriorityQueue<Integer> pq) {
		Stack<T> sortControl = new Stack<>();
		Stack<T> returned = new Stack<>();
		while (!pq.isEmpty()) {
			sortControl.push((T) pq.poll());
		}

		while (!sortControl.isEmpty())
			returned.push(sortControl.pop());

		return returned;
	}

	public static void main(String... strings) {
		Sorted ss = new Sorted<>();
		Stack<Integer> s = new Stack<>();
		s.push(20);
		s.push(20);
		s.push(17);
		s.push(11);
		s.push(8);
		s.push(1);
		s.push(2);

		System.out.println(ss.isSorted(s));
	}
}
