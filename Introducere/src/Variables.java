
public class Variables {

	public static void main(String[] args) {
		//Variables practice
		
		int number = 5;
		String course = "testing";
		char letter = 'A';
		double dec = 0.8;
		boolean test = true;
		
		if(dec >= 0) { 
			System.out.println("This is my first " + course + " course!");
		}
		else {
			System.out.println(letter);
		}

		//Arrays
		
		int[] arr = new int[6];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 6;
		arr[3] = 9;
		arr[4] = 5;
		arr[5] = 8;
		
		int [] arr2 = {1,2,3,4};
		System.out.println(arr2[0]);
		System.out.println(arr2[2]);
		System.out.println(arr2[1]);
		System.out.println(arr2[3]);		
	}

}
