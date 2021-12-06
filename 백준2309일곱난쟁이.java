package hh.coding.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


	public class baekjoon2309일곱난쟁이 {
	
		static ArrayList<Integer> ar;
		static boolean flag;
		static boolean[] vi;
		static int [] num;
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			ar = new ArrayList<Integer>();
			num = new int [9];
			vi = new boolean [9];
			flag = false;
			
			for(int i=0; i<9;i++) {
				num[i] = Integer.parseInt(br.readLine());
			}
			dfs(0,0,0);
			Collections.sort(ar);
			for(int i=0; i<ar.size();i++) {
				System.out.println(ar.get(i));
			}
			bw.flush();
			bw.close();
			br.close();
		}
		public static void dfs(int p, int cnt, int sum) {
			
			if(cnt==7) {
				if(sum==100) {
					flag = true;
				}
				return;
			}
			for(int i=p;i<9;i++) {
				if(!vi[i]) {
					vi[i]=true;
					ar.add(num[i]);
					dfs(i,cnt+1,sum+num[i]);
					if(flag==true) {
						break;
					}
					ar.remove(ar.size()-1);
					vi[i]=false;
				}
			}

		}

	}

