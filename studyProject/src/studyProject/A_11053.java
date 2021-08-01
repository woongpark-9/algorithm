package studyProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_11053 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int seqSize = Integer.parseInt(br.readLine());
	
		int[] seq = new int[seqSize];
		// ���� �迭  String �迭 int �迭�� ����ȯ
		seq = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		// ���� �迭
		int[] result = new int[seqSize];
		
		int answer = 0;
	
		
		for(int i=0; i<seq.length; i++) {
			// �ʱⰪ ����
			result[i] = 1;

			for(int j=0; j<i; j++) {
				// i��° ���� j��° ������ ũ�鼭 i��° ���̰� j��° + 1 ���̺��� �������
				if(seq[i]>seq[j] && result[i] < result[j] + 1) {		
					result[i] = result[j]+1;
				}
			}
			
		}
		
		// �ִ� ���� Ž��
	        for (int i = 0; i < result.length; i++){
	        		
	        	
	        	if (result[i] > answer){
	                answer = result[i];
	            }
	        }
	        
		// �ִ� �� ���
	        System.out.println(answer);
		
	
	}
	
}
