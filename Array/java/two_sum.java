import java.util.HashMap;

class two_sum{
    //Brute Force //O(n*n) O(1)
    static int[] bruteTwoSum(int n , int[] arr , int target){
        int[] idx_arr = new int[2];
        idx_arr[0] = idx_arr[1] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target){
                    idx_arr[0] = i;
                    idx_arr[1] = j;
                }
            }
        }
        return idx_arr;
    }
    //better Approach //O(n log n) O(n)
    static int[] betterTwoSum(int n , int[] arr , int target){
        HashMap<Integer , Integer> map = new HashMap<>();
        int[] idx_arr = new int[2];
        idx_arr[0] = idx_arr[1] = -1;
        for(int i = 0 ; i < n ; i++){
            int sub = target - arr[i];
            if(map.containsKey(sub)){
                idx_arr[0] = map.get(sub);
                idx_arr[1] = i;
            }
            map.put(arr[i] , i);
        }
        return idx_arr;
    }
    //Optimal Approach //O(n) O(1)
    static String OptimalTwoSum(int n , int[] arr , int target){
        int low = 0;
        int high = n - 1;
        while(low < high){
            if(arr[low] + arr[high] == target){
                return "YES";
            }
            else if(arr[low] + arr[high] < target) low++;
            else high--;
        }
        
        return "NO";
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        // int[] ans = bruteTwoSum(n, arr, target);
        int[] ans1 = betterTwoSum(n, arr, target);
        String ans2 = OptimalTwoSum(n, arr, target);
        for(int a : ans1){
            System.out.println(a);
        }
        System.out.println(ans2);
    }
}
