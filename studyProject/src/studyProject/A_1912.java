package studyProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_1912 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		
		int[] seq = new int[length];
		 
		int[] sum = new int[length];
		// �Է��� �޾� int�迭�� ����ȯ
		seq = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		
		//		seq 10 -4 3  1  5  6 -35 12 21 -1
		//		sum 10  6 9 10 15 21 -14 12 33 32
		//      
		
		//      ���������� �հ� ���� ���� ���� �ִ밪�� ã��
		//      �� �ִ밪�� ���� �ִ밪�� ���� �ִ밪�� ã��
		//      ex) 10 + (-4) �� -4�� ���ϸ� 
		//			10 + (-4) �� ũ�Ƿ� max�� ����
		//
		
		sum[0] = seq[0];
		
		int max = seq[0];
		for(int i=1; i<seq.length; i++) {
				// ���������� �հ� ���� ���� ���� �ִ밪�� ã�� �ش� index �� �迭�� �־���
				sum[i] = Math.max(sum[i-1] + seq[i], seq[i]);
				// �ִ밪�� ���� �ִ밪�� ���� �ִ밪�� ���� �ִ밪�� ã�� max�� �־���
				max = Math.max(max,sum[i]);
		}
		
		System.out.println(max);
		
	}
}
