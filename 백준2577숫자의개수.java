package hh.coding.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


	public class baekjoon2577숫자의개수 {
	
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());
			int [] ar = new int [10];
			String t = Integer.toString(a*b*c);
			for(int i=0; i<t.length(); i++) {
				ar[t.charAt(i)-'0']++;
			}
			for(int i=0; i<10; i++) {
				System.out.println(ar[i]);
			}
			bw.flush();
			bw.close();
			br.close();
		}

	}

