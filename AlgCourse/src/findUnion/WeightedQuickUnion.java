package findUnion;

public class WeightedQuickUnion implements IFindUnion{
    private int[] countTree;
    private int[] id;
    private int  root(int i)
    {
        while(i!=id[i]){
        	i=id[i];
        	
        }
        
        return i;
    }
	public WeightedQuickUnion(int N)
	{
		id = new int[N];
		for(int ind = 0; ind<id.length; ind++)
			id[ind] = ind;
	}
	public void union(int p, int q) {
		int rootP = root(p);
		int rootQ = root(q);
		if(countTree[p]<countTree[q])
		{}
		else
		{}
		
	}

	public boolean connected(int p, int q) {
		return root(p)==root(q);
	}
	public void printArray()
    {

    	for(int ind = 0; ind<id.length; ind++)
			System.out.print(id[ind]+" ");
    }
	

}
