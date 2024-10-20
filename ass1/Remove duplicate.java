package my4;
import java.util.Arrays;

public class My4 {

	public static void main(String[] args) {

		        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 6, 6};
		        arr = removeDuplicates(arr);
		        
		        System.out.println("Array without duplicates: " + Arrays.toString(arr));
		    }

		    public static int[] removeDuplicates(int[] arr) {
		        return Arrays.stream(arr).distinct().toArray();
		    }
		


	}


