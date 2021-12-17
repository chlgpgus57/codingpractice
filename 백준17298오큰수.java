package hh.coding.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


	public class Baekjoon17298오큰수 {
	
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        StringBuilder sb = new StringBuilder();
	        Stack<Integer> st = new Stack<>();
	        int N = sc.nextInt();
	        int[] nge = new int[N];
	        for (int i = 0; i < N; i++){ // 값 입력
	            nge[i]=sc.nextInt();
	        }

	        for (int i = 0; i < N; i++){
	            while(!st.isEmpty()&&nge[st.peek()]<nge[i]){ //인덱스끼리 비교하여 높은 값 발견 
	                nge[st.pop()]=nge[i]; // 만난 높은값을 해당 배열에 채움
	            }
	            st.push(i); // 스택에 채우기
	        }
	        while(!st.isEmpty()){
	            nge[st.pop()]=-1;
	        }
	        for(int v :nge){
	            sb.append(v).append(' '); // pintln으로 바로 출력시 시간초과 발생
	        }
	        System.out.println(sb);
	    }


	}

