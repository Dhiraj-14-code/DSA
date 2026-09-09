public class SlidingWindow {
    public static int maxSum(int[] arr) {
        int k = 2; //window size

        //first sum
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        //sliding window part
        int maxSum = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static int minSum(int[] arr) {
        int k = 3; //window size

        //first sum
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        //sliding window part
        int minSum = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            minSum = Math.min(minSum, sum);
        }
        return minSum;
    }

    public static int maxCounts(int[] arr) {
        int k = 3;
        int count = 0;
        //first window 
        for (int i = 0; i < k; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        //now sliding window part 
        int maxCount = count;
        for (int i = k; i < arr.length; i++) {
            if (arr[i - k] == 1) {
                count--;
            }
            if (arr[i] == 1) {
                count++;
            }
            maxCount = Math.max(maxCount, count);
        }
        return count;
    }

    //Variable size sliding window
    //find the minimum length of contigous window sum >= 7
    public static int minLength(int[] arr, int target) {

        // Left pointer: window ka starting point
        int left = 0;

        // Current window ka sum
        int sum = 0;

        // Abhi tak ki minimum window length
        // Initially bahut large value rakhi hai
        int minLength = Integer.MAX_VALUE;

        // Right pointer se array ko traverse karenge
        for (int right = 0; right < arr.length; right++) {

            // Current element ko window mein add karo
            sum = sum + arr[right];

            // Jab tak window ka sum target ke equal ya greater hai
            while (sum >= target) {

                // Current window ki length calculate karo
                int length = right - left + 1;

                // Minimum length update karo
                minLength = Math.min(minLength, length);

                // Window ko left se shrink karne ke liye
                // left wala element sum se remove karo
                sum = sum - arr[left];

                // Left pointer ko ek step aage move karo
                left++;
            }
        }

        // Final minimum window length return karo
        return minLength;
    }

    //Q : Find the longest contiguous subarray whose sum is ≤ 4.
    public static int maxLength(int[] arr, int target) {
        int left = 0;
        int rigth = 0;
        int sum = 0;
        int maxLength = Integer.MIN_VALUE;


        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            // Window invalid hai → shrink
            while (sum > target) {
                sum -= arr[left];
                left++;
            }

            // Ab window valid hai → maximum length update
            int length = right - left + 1;
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
    //Q->  Maximum number of even numbers in k consecutive elements  Date : 9 Sep 2026
    public static int evenMaxCount(int[] arr){
        int k = 3 ;
        int count = 0;
        //count first window
        for (int i = 0; i < k; i++) {
            if (arr[i]%2==0){
                count++;
            }
        }
        int maxCount = count;
        for (int i = k  ; i <arr.length ; i++) {
            if (arr[i-k]%2==0){//Remove element from window
                count--;
            }
            if (arr[i]%2==0){//add next element in window
                count++;
            }
            maxCount =Math.max(maxCount,count);
        }
        return  maxCount;
    }
                                //VARIABLE SIZE SLIDING WINDOW
        //Q->Find the minimum length of a contiguous subarray whose sum is >= 7.
    public static int minLen(int [] arr,int target){
        int left = 0 ;
        int sum = 0;
        int minlength =Integer.MAX_VALUE;
        // first find the length
        for (int right = 0;right< arr.length;right++){
            sum = sum + arr[right]; //current element to sum me add kiya

            while (sum >= target){
                int length = sum -left+right;//current window ki length nikali
                minlength=Math.min(minlength,length);//minimum length find kiya
                sum = sum - left;//left element ko remove kiya
                left++;
            }
        }
        return minlength;
    }
}
