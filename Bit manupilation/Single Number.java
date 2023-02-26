// https://course.acciojob.com/idle?question=63605eda-4a6b-438f-826d-9e8225d706c3






import java.util.*;

class Solution {
    public void singleElement(int[]A,int n) {
        //Write code here and print output
		int result =0;
		for(int num:A)
			{
				result ^=num;
			}
		System.out.print(result);
         
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
                A[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.singleElement(A,n);
        sc.close();
    }
}

