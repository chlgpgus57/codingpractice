package hh.coding.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;


	public class Baekjoon5397키로거 {
	
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st = new StringTokenizer(br.readLine(),"");
			int n = Integer.parseInt(st.nextToken());
			//< : 커서 왼쪽으로
			//> : 커서 오른쪽으로
			//- : - 가 있을때 커서 앞에 글자가 있으면 지우기
			//커서 위치가 줄의 마지막이 아니면 커서 오른쪽에 있는 문자를 오른쪽으로 이동.
			char [] pw;
			Stack<Character> left = new Stack<Character>();
			Stack<Character> right = new Stack<Character>();
			StringBuilder res = new StringBuilder();
			
			for(int i=0; i<n; i++) {
				st= new StringTokenizer(br.readLine(),"");
				String s = st.nextToken();
				pw = s.toCharArray();

				for(int j=0; j<pw.length;j++) {
					
					switch (pw[j]) {
						case '<':
							if(!left.isEmpty()) {
								right.push(left.pop());
							}
							break;
						case '>':
							if(!right.isEmpty()) {
								left.push(right.pop());
							}
							break;
						case '-':
							if(!left.isEmpty()) left.pop();
							break;
						default:
							left.push(pw[j]);
							break;
					}
				}
			}
			for(Character chara : left){
				res.append(chara);
			}
			while(!right.isEmpty()) {
				res.append(right.pop());
			}
			System.out.println(res.toString());
			System.out.println();
			bw.flush();
			bw.close();
			br.close();
		}

	}

