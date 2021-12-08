package hh.coding.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


	public class Baekjoon13300방배정 {
	
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st;
			st = new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int ans = 0;
			int [][] room = new int [6][2];
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine()," ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken())-1;//0~5까지니까 하나 빼줌
				if(room[b][a]==0) {
					room[b][a]++;//인원추가
					ans++;//방추가
				}else if(room[b][a]==k) {//k명 차면 방 초기화
					ans++;
					room[b][a]=1;
				}else {
					room[b][a]++;//둘다 아니면 k명 될때까지 인원추가
				}
			}
			System.out.println(ans);
			bw.flush();
			bw.close();
			br.close();
		}

	}

