package hh.coding.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


	public class baekjoon3273두수의합 {
	
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st;
			int n = Integer.parseInt(br.readLine());
			int [] ar = new int [n];
			st = new StringTokenizer(br.readLine()," ");
			for(int i=0; i<n; i++) {
				ar[i]=Integer.parseInt(st.nextToken());
			}
			int x = Integer.parseInt(br.readLine());
			Arrays.sort(ar);
			int start = 0; //0부터
			int end = n-1; //n-1까지 돌면서
			int ans = 0;
			while(true) {
				if(start==end) break; //시작과 끝이 같아지면 종료
				if(ar[start]+ar[end]==x) ans++; //두 수의 합이 x면 정답+1
				if(ar[start]+ar[end]<=x) start++; //두 수의 합이 x랑 같거나 작으면 시작 인덱스 1추가
				else end--;	//두수의 합이 x보다 크면 end --; 이걸 해줘야 break문으로 갈 수 있음. 
			}
			System.out.println(ans);
			bw.flush();
			bw.close();
			br.close();
		}

	}

