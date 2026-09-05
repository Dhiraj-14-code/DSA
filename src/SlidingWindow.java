public class SlidingWindow {
    public static int maxSum(int[] arr){
        int k = 2; //window size

        //first sum
        int sum = 0;
        for(int i=0;i < k ;i++){
            sum = sum + arr[i];
        }
        //sliding window part
        int maxSum = sum;
        for(int i = k ; i < arr.length;i++){
            sum =sum - arr[i-k] + arr[i];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public static int minSum(int[] arr){
        int k = 3; //window size

        //first sum
        int sum = 0;
        for(int i=0;i < k ;i++){
            sum = sum + arr[i];
        }
        //sliding window part
        int minSum = sum;
        for(int i = k ; i < arr.length;i++){
            sum =sum - arr[i-k] + arr[i];
            minSum = Math.min(minSum,sum);
        }
        return minSum;
    }

}
