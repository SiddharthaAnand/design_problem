
import java.util.Scanner;
import java.util.HashMap;

class LRUCache {

	private int size;
	// holds the node to be removed
	private Node head;
	// holds the node which was accessed most recently.
	private Node tail;
	int currentSize;
	private HashMap<Integer, Node> map;
	class Node {
		Node prev;
		Node next;
		int data;
		
		Node (int d) {
			data = d;
			prev = null;
			next = null;
		}
	}

	public LRUCache(int size) {
		this.size = size;
		head = null;
		tail = null;
		currentSize = 0;
		map = new HashMap<Integer, Node>();
	}

	private Node createNewNode(int d) {

		Node node = new Node(d);
		if (node != null) {
			currentSize += 1;
		}
		else {
			return null;
		}
		return node;
	}

	public boolean isFull() {
		return (currentSize == size);
	}

	public boolean addNodeAtEnd(Node node) {
		if (node == null) {
			return false;
		}
		// Add node if no nodes are present
		else if (tail == null) {
			head = node;
			tail = node;

		}
		// Add node if a single node present
		else {
			tail.next = node;
			node.prev = tail;
			tail = tail.next;
		}
		currentSize += 1;
		map.put(node.data, node);
		return true;
	}

	private void printNodes() {
		Node tmp = head;
		while (tmp != null) {
			System.out.println(tmp.data + " ");
			tmp = tmp.next;
		}
		System.out.println();
	}

	private void updateInCache(int access) {
		Node pointerToBlock = map.get(access);
		if (currentSize == 1) {
			// do nothing
		}
		// if the access is at the head then swap that.
		if (tail.data != access && currentSize == 2) {
			Node tmp = head;
			tail.next = head;
			tail.prev = null;
			head.prev = tail;
			head.next = null;
			head = tail;
			tail = tmp;
		}
		else {
			if (pointerToBlock.next != null) {
				pointerToBlock.next.prev = pointerToBlock.prev;
				pointerToBlock.next = null;
			}
			if (pointerToBlock.prev != null) {
				pointerToBlock.prev.next = pointerToBlock.next;
				pointerToBlock.prev = tail;
			}
			else {
				head = head.next;
			}
			tail.next = pointerToBlock;
			tail = pointerToBlock;
		}
	}

	private void insertIntoCache(int access) {
		Node newNode = new Node(access);
		addNodeAtEnd(newNode);

	}

	private void checkIfPresentInCache(int access) {
		if (map.containsKey(access)) {
			System.out.println("Updated position in cache");
			updateInCache(access);
		}
		else {
			//fetch From memoery
			System.out.println("Not present in Cache, Inserted");
			insertIntoCache(access);

		}
	}

	public void start(int access) {
		this.checkIfPresentInCache(access);
		this.printNodes();
	}

}

class LRUCacheObjectCreation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cacheSize = sc.nextInt();
		if (cacheSize > 0) {
			LRUCache cacheObj = new LRUCache(cacheSize);
			while (true) {
				System.out.println("Enter access block number : ");
				int access = sc.nextInt();
				cacheObj.start(access);
			}
		}
		else {
			System.out.println("Invalid size");
		}
	}
}