package hh.coding.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;


	public class Baekjoon10773제로 {
	
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st = new StringTokenizer(br.readLine(),"");
			int k = Integer.parseInt(st.nextToken());
			Stack<Integer> stack = new Stack<Integer>();
			
			for(int i=0;i<k;i++) {
				int a = Integer.parseInt(br.readLine());
				if(a!=0) {
					stack.add(a);
				}else {
					stack.pop();
				}
			}
			int sum =0;
			while(!stack.empty()) {
				sum+=stack.peek();
				stack.pop();
			}
			System.out.println(sum);
			bw.flush();
			bw.close();
			br.close();
		}

	}

