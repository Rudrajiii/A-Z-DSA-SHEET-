import java.util.ArrayList;
import java.util.Collections;

public class leaders_inthe_array {
    
    public static ArrayList<Integer> printLeaders(int[] arr , int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int maxi = -1;
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            if(arr[i] > maxi){
                ans.add(arr[i]);
            }
            maxi = Math.max(maxi, arr[i]);
        }
        return ans;
    }

    public static void main(String args[]) 
{
  // Array Initialization.
  int n = 6;
  int arr[]=  {10, 22, 12, 3, 0, 6};


  ArrayList<Integer> ans= printLeaders(arr,n);
  
  Collections.sort(ans, Collections.reverseOrder());
  
  for (int i = 0; i < ans.size(); i++) {
    System.out.print(ans.get(i)+" ");
  }

}
}