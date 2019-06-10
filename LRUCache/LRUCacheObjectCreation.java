
public class LRUCache {

	private int size;
	public LRUCache(int size) {
		this.size = size;

	}
}

class LRUCacheObjectCreation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cacheSize = sc.nextInt();
		if (cacheSize > 0) {
			LRUCache cacheObj = new LRUCache(cacheSize);
			cacheObj.start();
		}
		else {
			System.out.println("Invalid size");
		}
	}
}