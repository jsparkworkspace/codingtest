class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] arr = my_string.split("");
        for (String str : arr) {
            if (str.equals(alp)) {
                answer += str.toUpperCase();
            } else {
                answer += str;
            }
        }
        return answer;
    }
}