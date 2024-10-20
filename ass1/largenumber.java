package my1;
import java.util.Scanner;
public class My1 {
 static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
    int[] arr=new int[5];
		//int[] strv= {1,4,6,3,7,5};
		//String[] strv=new String[5];
   // System.out.println(strv[4]);
		for(int i = 0 ; i < arr.length ;i++)
		{
			arr[i]= in.nextInt();
		}
		for(int i = 0;i < arr.length ; i++)
		{
          System.out.println(arr[i]+"");		
          }
	}

}
