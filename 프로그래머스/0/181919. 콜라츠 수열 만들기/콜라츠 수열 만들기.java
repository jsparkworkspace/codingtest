class Solution {
    public int[] solution(int n) {
        
        String str = "" + n;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                str += (" " + n);
            } else {
                n = 3 * n + 1;
                str += (" " + n);
            }
        }
        
        String[] nums = str.split(" ");
        int[] answer = new int[nums.length];
        
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(nums[i]);
        }
        
        return answer;
    }
}