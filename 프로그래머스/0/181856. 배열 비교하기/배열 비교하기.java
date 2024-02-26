class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);
        
        if (answer == 0) {
            int sum1 = 0; int sum2 = 0;
            for (int i : arr1) {
                sum1 += i;
            }
            for (int i : arr2) {
                sum2 += i;
            }
            answer = Integer.compare(sum1, sum2);
        }
        return answer;
    }
}