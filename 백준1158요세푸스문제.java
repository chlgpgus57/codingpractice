package hh.coding.practice;

	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Scanner;

	public class Baekjoon1158요세푸스문제 {
        
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			ArrayList<Integer> arrayList = new ArrayList<>();
			Queue<Integer> queue = new LinkedList<Integer>();
			int n = sc.nextInt(), k = sc.nextInt();
			int idx = -1;
			
			for(int i = 1; i<=n; i++) {
				arrayList.add(i);
			}
			do {
				for(int i = 0; i<k; i++) {
					idx++;
					if(idx == arrayList.size()) {
						idx = 0;
					}
				}
				queue.add(arrayList.get(idx));
				arrayList.remove(idx);
				idx -= 1;
			}while(!arrayList.isEmpty());
			
			if(n == 1) {
				System.out.println("<"+queue.poll()+">");
				return;
			}
			System.out.print("<"+queue.poll()+",");
			for(int i = 0; i<n-2; i++) {
				System.out.print(" " + queue.poll() + ",");
			}
			System.out.print(" " + queue.poll()+">");
		}
	}
