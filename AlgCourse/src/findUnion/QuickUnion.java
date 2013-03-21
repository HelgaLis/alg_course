package findUnion;

public class QuickUnion implements IFindUnion {
    private int[] id;
    public QuickUnion(int N)
    {
    	id = new int[N];
		for(int ind = 0; ind<id.length; ind++)
			id[ind] = ind;
    }
    private int  root(int i)
    {
        while(i!=id[i]){
        	i=id[i];
        	
        }
        
        return i;
    }
	@Override
	public void union(int p, int q) {
		int rP=root(p);
		int rQ = root(q);
		id[rP]=rQ;
		printArray();
		System.out.println();
	}

	@Override
	public boolean connected(int p, int q) {
		return root(p)==root(q);
	}
	public void printArray()
    {

    	for(int ind = 0; ind<id.length; ind++)
			System.out.print(id[ind]+" ");
    }
}
