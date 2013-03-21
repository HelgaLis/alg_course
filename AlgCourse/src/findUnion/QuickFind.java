
package findUnion;
;
public class QuickFind implements IFindUnion{
	private int[] id;
	public QuickFind(int N){
		id = new int[N];
		for(int ind = 0; ind<id.length; ind++)
			id[ind] = ind;
	}
    public void union(int p, int q){
    	for(int ind = 0; ind<id.length; ind++)
    		if(id[ind]==id[p]) id[ind]=id[q];
    }
    public boolean connected(int p, int q){
    	return id[p]==id[q];
    }
    public void printArray()
    {
    	for(int ind = 0; ind<id.length; ind++)
    			System.out.println(ind+": "+id[ind]);
    	for(int ind = 0; ind<id.length; ind++)
			System.out.print(id[ind]+" ");
    }}
