package hh.coding.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


	public class baekjoon10808알파벳개수 {
	
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			String s = br.readLine().toLowerCase();
			int [] ar = new int [26];
			for(int i=0; i<s.length();i++) {
				ar[s.charAt(i)-'a']++;
			}
			for(int i=0; i<26;i++) {
				System.out.print(ar[i]+" ");
			}
			bw.flush();
			bw.close();
			br.close();
		}

	}

