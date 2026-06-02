// Average Salary Excluding the Minimum and Maximum Salary - LeetCode 1491

class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = 0;

        for (int s : salary) {
            sum += s;
            min = Math.min(min, s);
            max = Math.max(max, s);
        }

        return (double)(sum - min - max) / (salary.length - 2);
    }
}
