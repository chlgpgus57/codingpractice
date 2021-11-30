package hh.coding.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


	public class baekjoon9012_괄호 {
	
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			Stack<Character> stack;
			boolean flag;
			int n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++) {
				flag=true;
				String st = br.readLine();
				stack = new Stack<Character>();
				for(int j=0;j<st.length();j++) {
					if(st.charAt(j)=='(') {
						stack.add('(');
					}else if(st.charAt(j)==')') {
						if(stack.size()==0) {
							flag=false;
						}else {
							stack.pop();
						}
					}
				}
				if(!flag||stack.size()!=0) { //flag가 false이거나, stack 사이즈가 0이 아니면
					System.out.println("NO");
				}else {
					System.out.println("YES");
				}
			}
			bw.flush();
			bw.close();
			br.close();
		}

	}

