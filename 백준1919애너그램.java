package hh.coding.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

	public class Baekjoon1919애너그램 {
	
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int [] ar=new int[26];
			String n1=br.readLine();
			String n2=br.readLine();
			for(int i=0; i<n1.length();i++) {
				ar[n1.charAt(i)-'a']++;
			}
			for(int i=0; i<n2.length();i++) {
				ar[n2.charAt(i)-'a']--;
			}
			int ans = 0;
			for(int i=0;i<26;i++) {
				int cnt = Math.abs(ar[i]);
				ans+=cnt;
			}
			System.out.println(ans);
			bw.flush();
			bw.close();
			br.close();
		}

	}

