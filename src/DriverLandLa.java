
public class DriverLandLa {
	
	/**
	 * @param args
	 */
	public static void main(String [] args){
		Listing test = new Listing();
		Listing testp = new Listing("Bob",34);
		
		System.out.println( "Blank Contructor: " + test.toString());
		System.out.println( "Parameter Constructor: " + testp.toString());
		
		test.input();
		
		System.out.println( "After Data change: " + test.toString());
		
		System.out.println("Array Test:");
		
		ListingArray lista = new ListingArray();
		
		System.out.println("DataStructure Test: ");
		DataStructure data = new DataStructure();
		for(int x = 0;x<3;x++){
			data.addListing(lista.getList(x));
		}
		
		data.showListing();
		
		System.out.println("DataStructure Test 2: ");
		DataStructure data1 = new DataStructure(3);
		for(int x = 0;x<3;x++){
			data1.addListing(lista.getList(x));
		}
		
		data1.showListing();

		
	}

}