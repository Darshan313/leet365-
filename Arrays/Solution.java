class Solution {

   public static void main(String[] args) {
        String s = "bbb";
        System.out.println(checkString(s));
    }
  
    private static boolean checkString(String s) {
        boolean seen = false;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'b') {
                seen = true;
            }
            if(s.charAt(i) == 'a' && seen == true) {
                return false;
            }
        }
        return true;
    }
}
