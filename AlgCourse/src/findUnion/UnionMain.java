package findUnion;

public class UnionMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        QuickFind sample = new QuickFind(10);
        sample.union(8, 4);
        sample.union(0, 7);
        sample.union(3, 7);
        sample.union(6, 3);
        sample.union(1, 0);
        sample.union(5, 9);
        //sample.printArray();
        
        QuickUnion sample2 = new QuickUnion(10);
        sample2.union(4, 9);
        sample2.union(3, 6);
        sample2.union(3, 2);
        sample2.union(5, 7);
        sample2.union(2, 8);
        sample2.union(5, 4);
        sample2.union(3, 7);
        sample2.union(0, 2);
        sample2.union(0, 1);
        sample2.printArray();
	}

} 



