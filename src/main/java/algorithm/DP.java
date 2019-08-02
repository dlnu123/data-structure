package algorithm;

/**
 * @Description：动态规划解决背包问题
 * @Author wangliang
 * @Created 2019-08-01 10:34
 * @Version 1.0
 */
public class DP {

    public static void main(String[] args) {
        int[] prices = {6, 10, 12};
        int[] weights = {1, 2, 4};

        int bag = 5;
        int num = 3;
        int[][] result = new int[num + 1][bag + 1];

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= bag; j++) {
                if (weights[i - 1] <= j) {
                    result[i][j] = Math.max(
                            prices[i - 1] + result[i - 1][j - weights[i - 1]],
                            result[i - 1][j]
                    );
                } else {
                    result[i][j] = result[i - 1][j];
                }
            }
        }

        System.out.println(result[num][bag]);
    }
}
