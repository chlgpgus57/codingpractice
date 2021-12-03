package hh.coding.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


	public class baekjoon10799쇠막대기 {
	
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			Stack<Character> stack = new Stack<Character>();
			String a = br.readLine();
			int count =0;
			
			for(int i=0; i<a.length();i++) {
				if(a.charAt(i)=='(') {
					stack.push('(');
				}else {
					stack.pop();
					if(a.charAt(i-1)=='(') {
						count+=stack.size();
					}else {
						count++;
					}
				}
			}
			System.out.println(count);
			bw.flush();
			bw.close();
			br.close();
		}

	}

