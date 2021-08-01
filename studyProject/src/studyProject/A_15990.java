package studyProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_15990 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// �����÷ο� ���ܰ� �߻��� �� �����Ƿ� long �ڷ��� ���
		long result;
		// [n][����� ��]
		long[][] dp = new long[100001][4];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ����� ���� 1�� �̹Ƿ� 1�� �ʱ�ȭ
		dp[1][1] = dp[2][2] = dp[3][3] = 1;
		
		for(int i=1; i<dp.length; i++) {
			if(i>1) dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % 1000000009;
			if(i>2) dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % 1000000009;
			if(i>3) dp[i][3] = (dp[=i-3][1] + dp[i-3][2]) % 1000000009;
		}
		// �׽�Ʈ ���̽� ��
		int count = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<count; i++) {
			int num = Integer.parseInt(br.readLine());
			// ������ ������ ������ 1�� ������ ����� �� + 2 ����Ǽ� + 3����Ǽ� �� 1000000009 �� ���� ������ ��
			result = (dp[num][1] + dp[num][2] + dp[num][3]) % 1000000009;
			System.out.println(result);
		}
	}
}
