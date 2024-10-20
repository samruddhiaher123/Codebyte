package my3;

public class my3 {

	public static void main(String[] args) {
        int[] arr = {5, 8, 10, 15, 3};
        System.out.println(isSortedAndRotated(arr));
    }

    public static boolean isSortedAndRotated(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }

        if (arr[n - 1] > arr[0]) {
            count++;
        }

        return count == 1;
    }



	}


