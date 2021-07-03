package studyProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Zero_10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int commandCount = Integer.parseInt(br.readLine());
		ArrayList<Integer> zero = new ArrayList<Integer>();
		int result = 0;
		for(int i=0; i<commandCount; i++) {
			int inputValue = br.read()-48;
			br.read();br.read();
			if(inputValue == 0) {
			
					zero.remove(zero.size()-1);
					
			
				
			}else {
				zero.add(inputValue);
			}
		}
		
		for(int num : zero) {
			result += num;
		}
		System.out.println(result);

			
		
	
	}
}
