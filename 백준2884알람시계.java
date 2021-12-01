package hh.coding.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


	public class baekjoon2884_알람시계 {
	
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			String [] st = br.readLine().split(" ");
			int h = Integer.parseInt(st[0]);
			int m = Integer.parseInt(st[1]);
			if(m>=45) {
				m=m-45;
			}else {
				if(h==0) {
					h=23;
				}else {					
					h=h-1;
				}
				m=m+15;
			}
			System.out.print(h+" "+m);
			bw.flush();
			bw.close();
			br.close();
		}

	}

