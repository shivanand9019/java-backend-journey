public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        for(int i=0;i<n;i++){
            StringBuilder subString = new StringBuilder();
        for(int j=i;j<n;j++){
            if(subString.indexOf(String.valueOf(s.charAt(j))) != -1){
                subString.append(s.charAt(j));
                break;
        }
        subString.append(s.charAt(j));
        max = Math.max(max,subString.length());
        
    }
        }
        
        return max;
        
    }

    public static void main(String[] args) {
        LongestSubstring obj = new LongestSubstring();
        String s = "abcabcbb";
        int subString = obj.lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + subString);
        
    }
}
    

