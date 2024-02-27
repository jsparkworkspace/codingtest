class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for (int i = 0; i < queries.length; i++) {
            
            for (int j = 0; j < (queries[i][1] - queries[i][0] + 1) / 2; j++) {
                char tmp = arr[queries[i][0] + j];
                arr[queries[i][0] + j] = arr[queries[i][1] - j];
                arr[queries[i][1] - j] = tmp;
            }
            
        }
        answer = String.valueOf(arr);
        return answer;
    }
}