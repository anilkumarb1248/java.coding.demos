package coding.demos.collections;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseLinkedList {
	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
		LinkedList<Integer> reverseList = new LinkedList<>();

		list.descendingIterator().forEachRemaining(reverseList::add);

		System.out.println("Given list: " + list);
		System.out.println("Reverse list:" + reverseList);

	}
}
