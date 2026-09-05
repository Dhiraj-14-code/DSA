public class Arrays {
    //Problem: Sum of Negative Even Numbers
    public static int sumOfNegativeEvenNo(int [] arr){
        int sum =0;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]<0 && arr[i]%2==0){
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    public static int linearSearch(int[] arr,int target) {

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static int countOccurrences(int [] arr ,int target){
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
    public static int firstOccurrences(int[] arr , int target){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int lastOccurrences(int[] arr , int target){
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static boolean isSorterd(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static int[] reverseArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }
}

