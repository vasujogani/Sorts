/**
 * Created by vasujogani on 9/27/17.
 */
public class MaximunSubarray {
    private int[] arr;
    public MaximunSubarray(int[] a){
        arr = a;
    }

    public Tracker findMaxSubArray(int low, int high){
        if(high == low){
            return new Tracker(low,high,arr[low]);
        }else{
            int mid = (high - low) / 2;
            Tracker left = findMaxSubArray(low, mid);
            Tracker right = findMaxSubArray(low, mid);
            Tracker cross = MaxCross(low, mid, high);
            if(left.sum > right.sum && left.sum > cross.sum)
                return left;
            else if(right.sum > left.sum && right.sum > cross.sum)
                return right;
            else
                return cross;
        }
    }

    public Tracker MaxCross(int low, int mid, int high){
        int left_sum = Integer.MIN_VALUE;
        int left_index = mid;
        int sum = 0;
        for(int i = mid; i >= low; i--){
            sum += arr[i];
            if(sum > left_sum){
                left_index = i;
                left_sum = sum;
            }
        }
        int righ_sum = Integer.MIN_VALUE;
        int right_index = mid;
        sum = 0;
        for (int i = mid+1; i <= high; i++) {
            sum += arr[i];
            if(sum > righ_sum){
                righ_sum = sum;
                right_index = i;
            }
        }

        return new Tracker(left_index, right_index, righ_sum+left_sum);
    }


    static class Tracker {
        public int low,high, sum;
        public Tracker(int l, int h, int s){ low = l; high = h; sum = s; }
        public String toString(){ return "low: " + low + ", high: " + high  + ", sum: " + sum; }
    }
}
