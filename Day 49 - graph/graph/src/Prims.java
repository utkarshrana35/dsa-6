import java.util.Arrays;

public class Prims {
	
	int totalCost = 0;
	void prims(int noOfVertex){
		int graph[][] = {
				 {0,5,8,0},
				 {5,0,10,15},
				 {8,10,0,30},
				 {0,15,30,0}
		};
		int key [] = new int[noOfVertex]; // vertex part of MST
		Arrays.fill(key, Integer.MAX_VALUE); // Initalize with Max Values
		boolean mst [] = new boolean[noOfVertex]; // all are false
		int sourceVertex = 0;
		key[sourceVertex] = sourceVertex;
		for(int count = 0; count<noOfVertex; count++) {
			int u = -1; // Adajcent 
			// update the min neighbour in key array and update the total cost
			for(int i = 0 ; i<noOfVertex; i++) {
				if(!mst[i] && (u==-1 || key[i]<key[u])) {
					u = i;
				}
			}
				mst[u] = true;
				totalCost += key[u];
				// get the min neighbour
				for(int v=0; v<noOfVertex; v++) {
					if(graph[u][v]!=0 && !mst[v]) {
						key[v]= Math.min(key[v], graph[u][v]);
					}
				}
			
			
			
		}
		System.out.println("Min Weight "+totalCost);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
