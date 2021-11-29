package hh.coding.practice;

import java.util.*;
import java.awt.Point;
import java.io.*;

public class mirro {

	static boolean [][] vi;
	static Queue<Point> q;
	static int [][] map;
	static int [] dx= {1,-1,0,0};
	static int [] dy= {0,0,1,-1};
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String [] st = br.readLine().split(" ");
		int n = Integer.parseInt(st[0]);
		int m = Integer.parseInt(st[1]);
		map = new int [n][m];
		vi = new boolean [n][m];
		q = new LinkedList<Point>();
		//괴물은 0  길은 1
		
		for(int i=0; i<n;i++) {
			String [] str = br.readLine().split("");
			for(int j=0;j<m;j++) {
				map[i][j]=Integer.parseInt(str[j]);
				vi[i][j]=false;
			}
		}
		
			
		for(int i=0; i<n;i++) {
			for(int j=0;j<m;j++) {
					
				if(map[i][j]==1&&!vi[i][j]) {
					vi[i][j]=true;
					q.add(new Point(i,j));
					while(!q.isEmpty()) {
						
						Point x = q.poll();
						
						for(int w=0; w<4; w++) {
							
							int nx = dx[w]+x.x;
							int ny = dy[w]+x.y;
							
							if(nx<0||nx>=n||ny<0||ny>=m) {
								continue;
							}
							if(map[nx][ny]!=0&&!vi[nx][ny]) {
								vi[nx][ny]=true;
								map[nx][ny]=map[x.x][x.y]+1;
								Point p = new Point(nx,ny);
								q.add(p);
							}	
						}
					}
				}
			}
		}
		
		System.out.println(map[n-1][m-1]);
		
	}
}