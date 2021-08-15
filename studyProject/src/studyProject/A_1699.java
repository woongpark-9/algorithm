package studyProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_1699 {
	public static void main(String[] args) throws NumberFormatException, IOException {


		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int dp[]=new int[n+1];
		
		for (int i=1;i<=n;i++) {
			dp[i]=i;
			for (int j=1;j*j<=i;j++)
				// i���� j*j�� �� ���� �ּ� ���� �� 1�� ���� �� �� dp[i]�� ���� �ּҰ� ���ϱ�
				if (dp[i]>dp[i-j*j]+1)
					dp[i]=dp[i-j*j]+1;
		}
		System.out.println(dp[n]);
		
		

		
		
		
		
		
		
		
		// ȥ�� Ǭ ��� N�� ���� 12��� 12���� �����鼭 ���� ū ������ 9�� ����
		// 3�� �����ִ� ���
		// dp[12] = dp[9](1) + dp[3](3) = 4
		// ������ ������ dp[12] = dp[4]+dp[4]+dp[4] = 3
		// 
		
		
		//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		long[] squareNumbers = new long[100001];
//		
//		for(int i=1; i<squareNumbers.length; i++) {
//			squareNumbers[i] = i*i;
//		}
//		
//		int n = Integer.parseInt(br.readLine());
//		int count = 0;
//		
//		if(n==1) {
//			System.out.println(1);
//			System.exit(0);
//		}else if(n==2) {
//			System.out.println(2);
//			System.exit(0);
//
//		}else if(n==3) {
//			System.out.println(3);
//			System.exit(0);
//
//		}else if(n==4) {
//			System.out.println(1);
//			System.exit(0);
//
//		}else if(n==5) {
//			System.out.println(2);
//			System.exit(0);
//
//		}
//		
//		while(true) {
//			for(int i=3; i<=n; i++) {
//				if(squareNumbers[i] > n) {
//					n = (int) (n-squareNumbers[i-1]);
//					count++;
//					break;
//				}else if(squareNumbers[i] == n) {
//					count++;
//					
//					System.out.println(count);
//					System.exit(0);
//				}
//			}
//			
//			
//			for(int i=1; i<=n; i++) {
//				if(squareNumbers[i] > n ) {
//					n = (int)(n-squareNumbers[i-1]);
//					count++;
//					break;
//				}else if(squareNumbers[i] == n) {
//					count++;
//					
//			
//					System.out.println(count);
//					System.exit(0);
//				}
//			}
//			
//			for(int i=1; i<=n; i++) {
//				if(squareNumbers[i] > n ) {
//					n = (int)(n-squareNumbers[i-1]);
//					count++;
//					break;
//				}else if(squareNumbers[i] == n) {
//					count++;
//					
//			
//					System.out.println(count);
//					System.exit(0);
//				}
//			}
//			break;
//			
//			
//		}
//					
//			System.out.println(count+n);
//		
//		
//		
	}
}
