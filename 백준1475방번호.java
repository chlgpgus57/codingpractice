package hh.coding.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


	public class baekjoon1475방번호 {
	
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			String s = br.readLine();
			s = s.replace("6", "9"); //6을 9로 치환
			int [] ar = new int [10];
			for(int i=0; i<s.length();i++) {
				int num = s.charAt(i)-'0';
				ar[num]++;
			}
		 
			ar[9]=(int)Math.ceil((double)ar[9]/2);//9나누기 2를 해서 올려줌.
			
			int max = 0;
			for(int i=0; i<ar.length;i++) {
				if(ar[i]>max) {
					max = ar[i];
				}
			}
			System.out.println(max);
			bw.flush();
			bw.close();
			br.close();
		}
	}