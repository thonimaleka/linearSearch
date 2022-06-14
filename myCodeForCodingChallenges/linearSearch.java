import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

public class linearSearch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{
	        Scanner s = new Scanner(System.in);
	        int arraySize = s.nextInt();

	        int[] searchArray = new int[arraySize];

	        int searchNum = s.nextInt();
	        //s.close();
	        
	        
	        //nextline
	        Scanner arrNums = new Scanner(System.in);
	        ArrayList<Integer> arrayNumbers = new ArrayList<Integer>();
	        
	        for(int i=1; i<= arraySize ; i++) {
	        	arrayNumbers.add(s.nextInt());
	        }
	        
 if (arrayNumbers.lastIndexOf(searchNum) == -1) {
	        	
	        	System.out.println("test");
	        	
	        }else {
	        	System.out.println(arrayNumbers.lastIndexOf(searchNum) + 1);
	        }
	        
	        	//System.out.println(arrayNumbers.lastIndexOf(searchNum ) + 1);
	        }
	        catch(NoSuchElementException e) {
	        	System.out.println(-1);
	        	
	        }
	       
	        
        

	}

}
