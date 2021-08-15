package studyProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class A_14002 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// �Է��� �ޱ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		//  ���� �迭
		long[] seq = new long[length];
		// �Է��� �޾� long �迭�� ����ȯ
		seq = Arrays.asList(br.readLine().split(" ")).stream().mapToLong(Long::parseLong).toArray();
		// ���� �迭
		int[] lengths = new int[length];
		
		Stack<String> result = new Stack<String>();
		
		lengths[0] = 1;
		int max = 0;
		// ���� ���ڿ��� ����� ����
		StringBuilder answer = new StringBuilder();
		// ������ �ϱ����� �ӽ� �迭
		int[] temp = new int[length];
		for(int i=0; i<seq.length; i++) {
			lengths[i] = 1;
			temp[i] = -1;
			for(int j=0; j<i; j++) {
				// i��° ���� j��° ������ ũ�鼭 i��° ���̺��� j��° ���̿� 1���� �� ���� ũ��
				if(seq[i]>seq[j] && lengths[i] < lengths[j]+1) {
					// i��°�� j��° ������ +1 �Ѱ��� �־���
					lengths[i] = lengths[j]+1;
					temp[i]  = j;
					// index   0  1  2  3  4  5
					// seq     10 20 10 30 20 50
					// lengths 1  2  1  3  2  4
					
				}
			}
		}
		//				0	1	2	3	4	5					
		// seq[i]      10	20	10	30	20	50
		// lengths[i]	1	2	1	3	2	4
		// temp[i]	   -1	0  -1	1	0	3
		
		// ������ ���� ū �� ���� �ְ� �� ���� temp[index] ���� stack�� ����
		// ��ӿ�����
		
		
		
		
		
		int index = 0;
		for(int i=0; i<lengths.length; i++) {
			if(max<lengths[i]) {
				max = lengths[i];
				index = i;
			
			}
		}
		
//		for(int i=0; i<=index; i++) {
//			
//			if(!result.contains(seq[i]+"")) {
//				result.add(seq[i]+"");
//			}
//		}
		
		answer.append(max).append("\n");
		while(index != -1) {
			result.push(seq[index]+"");
			index = temp[index];
		}
//		0	1	2	3	4	5					
// seq[i]      10	20	10	30	20	50
// lengths[i]	1	2	1	3	2	4
// temp[i]	   -1	0  -1	1	0	3
		

//		for(int i=result.size()-1; i>=0; i--) {
//			System.out.print(result.get(i)+" ");
//			
//			
//		}
		
		// STACK
		// FILO
		// �۽�Ʈ�� ��Ʈ �ƿ� ������ ������ ���� ������ �̾� �����ϸ鼭 ���ڿ��� �̾����
		
	
		// 10
		// 20
		// 30
		// 50
		
		// answer
		// 4
		// 10 20 30 50
		while(!result.isEmpty()) {
			answer.append(result.pop()).append(" ");
		}
		
		System.out.println(answer);
		
	}
}
