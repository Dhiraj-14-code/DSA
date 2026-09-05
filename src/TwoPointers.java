public class TwoPointers {
    public static boolean isPalindrome(String str){

        str = str.toLowerCase();

        int left =0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left)==' '){
                left++;
            }else if(str.charAt(right) ==' '){
                right--;
            }else if (str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
            right--;
        }
        return true;

    }
}
