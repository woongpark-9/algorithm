
package studyProject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_2193 {
	public static void main(String[] args) throws IOException {
		// �ش� ������ ���� ���α׷��� ������� �ذ�
		// �޸��ϸ� �������� ���� ū �Ը��� ������ �ذ�
		// ��ģ���� �ڸ����� n�̶�� ����
		 
		
		// n(1) = 1  (1��)
		// n(2) = 10 (1��)
		// n(3) = 100,101 (2��)
		// n(4) = 1000,1001,1010 (3��)
		// n(5) = 10000,10101,10100,10010,10001 (5��)
		// n(6) = 100000,101000,101010,100100,100101,100010,100001,101001 (8��)
		
		// ��Ģ�� n = n-1 + n-2;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int n = Integer.parseInt(br.readLine());
		// int ������ �ʰ��Ҽ��� ������ long�ڷ��� ���
        long[] dp = new long[n+1];
			
		if(n==1) {
			dp[1] = 1;            					
		}else if(n==2) {
			dp[2] = 1;    				
		}else if(n > 2){
			dp[1] = 1;            					        	 
			dp[2] = 1;    				
        
			for(int i=3; i<n+1; i++) {
				dp[i] = dp[i-1] + dp[i-2];
				//dp[n] = dp[n-1] + dp[n-2]
			}   
        }
            
        
		
		
		
		System.out.println(dp[n]);
		
		
		
		
	}
}
