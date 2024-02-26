class Solution {
    public int[] solution(int[] arr) {
        
        int total_len = 0;
        for (int i : arr) {
            total_len += i;
        }
        
        int[] answer = new int[total_len];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[cnt++] = arr[i];
            }
        }
        return answer;
    }
}