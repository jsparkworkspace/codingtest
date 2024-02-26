class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int tmp = 1000000;
            int index = 0;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2] && arr[j] < tmp) {
                    tmp = arr[j];
                    index = j;
                }
            }
            if (index == 0) {
                answer[i] = -1;
            } else {
                answer[i] = arr[index];
            }
        }
        return answer;
    }
}