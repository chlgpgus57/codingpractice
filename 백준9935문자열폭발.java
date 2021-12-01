package hh.coding.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;


	public class baekjoon9935_문자열폭발 {
	
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			boolean flag = true;
			String[] str = br.readLine().split("");
			String bomb = br.readLine();
			ArrayList<String> ar = new ArrayList<String>();			
			
			for(int i=0; i<str.length; i++) {
				ar.add(str[i]);
			}
			
			while(flag) {
				for(int i=0; i<ar.size();i++) {
					if(ar.contains(bomb)) {
						ar.remove(bomb);				
					}
					if(!ar.get(i).equals(bomb)) {
						flag = false;
					}
				}
			}
			if(ar.size()==0) {
				System.out.println("FRULA");
			}else {
				for(int i=0; i<ar.size(); i++) {
					System.out.print(ar.get(i));
				}
			}
			bw.flush();
			bw.close();
			br.close();
		}

	}

