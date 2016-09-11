
public class DataStructure<E> {
	private Object[] data;
	private int size = 100;
	private int next = 0;
	
	public DataStructure(){
		data = new Object[size];
	}
	
	public DataStructure(int NumberofListings){
		data = new Object[NumberofListings];
	}
	
	public void addListing(E newListing){
		data[next] = newListing;
		next = next + 1;
	}
	
	public void showListing(){
		for(int x = next-1; x>=0; x--){
			System.out.println(data[x].toString());
		}
	}
	
}
