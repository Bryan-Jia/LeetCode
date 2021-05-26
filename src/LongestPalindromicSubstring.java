public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        String solution = ""+s.charAt(0);
        int longestLength = 1;

        for (int i = 0; i < s.length(); i++){
            for (int j = s.length()-1; j >= i+1; j--){
                if(j-i+1 <= longestLength)
                    break;
                if (s.charAt(j) == s.charAt(i) && isPalindrome(s.substring(i, j+1))){
                    if (j-i+1 > longestLength){
                        longestLength = j-i+1;
                        solution = s.substring(i,j+1);
                    }
                    break;
                }
            }
        }

        return solution;
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        while (i < s.length()-1-i && s.charAt(i) == s.charAt(s.length()-1-i)){
            i++;
        }
        boolean a = i == s.length()/2;
        return a;
    }
}