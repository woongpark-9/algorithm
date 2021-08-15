package studyProject;

import java.util.Scanner;

public class A_2225 {

	public static void main(String[] args) {
		
		/* (��)(����)      
		 * 	n	k ����Ǽ�   n	k ����Ǽ�
		 *  1	1	1	 2	1	1
		 *  1   2   2	 2	2	3
		 *  1   3   3    2	3	6
		 *  1	4	4	 2	4	10
		 *  
		 *  		
		 *  dp[n][k] = dp[n-1][k] + dp[n][k-1]
		 *  
		 *  ���� n�� 2�̰� k�� 4���
		 *  dp[2][4] = dp[1][4] + dp[2][3]
		 *  
		 *  dp[n-1][k]���� + 1 
		 *  dp[n][k-1]���� �������� + 0 
		 *  
		 *  dp[1][4]	dp[2][3] 
		 *  0+0+0+1		2+0+0
		 *  0+0+1+0		0+2+0
		 *  0+1+0+0		1+1+0
		 *  1+0+0+0		0+0+2
		 *  			0+1+1
		 *  			0+0+2
		 *
		 * 
		 * dp[2][4] 
		 * 
		 * 0+0+0+2		2+0+0+0
		 * 0+0+1+1		0+2+0+0
		 * 0+1+0+1		1+1+0+0
		 * 1+0+0+1		0+0+2+0
		 * 				0+1+1+0
		 * 				0+0+2+0
		 */ 			
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int k = sc.nextInt(); 
		
		// n�� k�� 200���� �̹Ƿ� 201 �� �ʱ�ȭ
		int[][] dp = new int[201][201]; 
		
		
		for(int i=1;i<=k;i++) {
			dp[i][0]=1;
		}
		for(int i=1;i<=k;i++) {
			for(int j=1;j<=n;j++) {
				dp[i][j] = (dp[i][j-1] + dp[i-1][j])%1000000000; // 1000000000���� ������ �� ����� �� �ָ� Ʋ�ȴٰ� ��.
			}
		}
		System.out.println(dp[k][n]);
	}

}
