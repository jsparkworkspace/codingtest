class Solution {
    public String solution(String myString) {
        char[] arr = myString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) (arr[i] - ('a' - 'A'));
            }
        }
        
        String answer = String.valueOf(arr);
        return answer;
    }
}