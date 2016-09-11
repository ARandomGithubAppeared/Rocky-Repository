
public class DataStructure {
	private Listing[] data;
	private int size = 100;
	private int next = 0;
	
	public DataStructure(){
		data = new Listing[size];
	}
	
	public DataStructure(int NumberofListings){
		data = new Listing[NumberofListings];
	}
	
	public void addListing(Listing newListing){
		data[next] = newListing;
		next = next + 1;
	}
	
	public void showListing(){
		for(int x = next-1; x>=0; x--){
			System.out.println(data[x].toString());
		}
	}
	
}
