//     https://course.acciojob.com/idle?question=99b2b8d9-d830-4b9a-a61d-25dc5bc94ab4




import java.util.*;

class Solution {
    public int setBits(int n) {
        // write code here
		int count =0;
		while(n >0)
			{
				count++;
				n=n &(n-1);
			}
		return count;
    }
}

public class Main {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution Obj = new Solution();
        sc.close();
        System.out.println(Obj.setBits(n));
    }
}
