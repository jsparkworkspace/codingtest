class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
            String str = "";
            for (int j = i; j < i+ pat.length(); j++) {
                str += myString.charAt(j);
            }
            answer = str.equals(pat) ? 1 : 0;
            if (answer == 1) break;
        }
        return answer;
    }
}