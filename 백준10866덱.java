package hh.coding.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;


	public class baekjoon10866_덱 {
	
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			Deque<Integer> deq = new LinkedList<Integer>();
			StringTokenizer st;
			int n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++) {
				st = new StringTokenizer(br.readLine()," ");
				switch (st.nextToken()) {
				case "push_front":
					deq.addFirst(Integer.parseInt(st.nextToken()));
					break;
				case "push_back":
					deq.addLast(Integer.parseInt(st.nextToken()));
					break;
				case "pop_front":
					if(deq.size()==0) {
						System.out.println(-1);
					}else {
						System.out.println(deq.pollFirst());
					}
					break;
				case "pop_back":
					if(deq.size()==0) {
						System.out.println(-1);
					}else {
						System.out.println(deq.pollLast());
					}
					break;
				case "size":
					System.out.println(deq.size());
					break;
				case "empty":
					if(deq.size()==0) {
						System.out.println(1);
					}else {
						System.out.println(0);
					}
					break;
				case "front":
					if(deq.size()==0) {
						System.out.println(-1);
					}else {
						System.out.println(deq.getFirst());
					}
					break;
				case "back":
					if(deq.size()==0) {
						System.out.println(-1);
					}else {
						System.out.println(deq.getLast());
					}
					break;

				default:
					break;
				}
			}
			
			bw.flush();
			bw.close();
			br.close();
		}

	}

