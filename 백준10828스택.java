package hh.coding.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;


	public class beakjoon10828_스택 {
	
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st ;
			Stack<Integer> stack = new Stack<Integer>();
			for(int i=0;i<n;i++) {
				st = new StringTokenizer(br.readLine()," ");
				switch (st.nextToken()) {
				case "push":
					stack.push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					if(stack.size()==0) {
						System.out.println(-1);
					}else {
						System.out.println(stack.pop());
					}
					break;
				case "size":
					System.out.println(stack.size());
					break;
				case "empty":
					if(stack.size()==0) {
						System.out.println(1);
					}else {
						System.out.println(0);
					}
					break;
				case "top":
					if(stack.size()==0) {
						System.out.println(-1);
					}else {
						System.out.println(stack.peek());
					}
					break;
				default:
					break;
				}
			}
			bw.flush();
			bw.close();
			br.close();
		}

	}

