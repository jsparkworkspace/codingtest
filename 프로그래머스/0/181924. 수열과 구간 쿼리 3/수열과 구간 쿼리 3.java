class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int f = queries[i][1];
            
            int tmp = arr[s];
            arr[s] = arr[f];
            arr[f] = tmp;
            
        }
        return answer;
    }
}