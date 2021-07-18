import java.util.ArrayList;
import java.util.Scanner;

public class AdjList {
	
	static void addEdge(int first, int second, int weight, ArrayList<Integer> adj) {
		adj.add(second);
	}
	
	static void printGraph(ArrayList<ArrayList<Integer>>  graph) {
		for(int  i =0; i<graph.size(); i++) {
			System.out.println("Vertex "+i+" "+graph.get(i));
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		System.out.println("Enter the Total Vertex");
		Scanner scanner = new Scanner(System.in);
		int totalVertex = scanner.nextInt();
		for(int i = 1; i<=totalVertex; i++) {
			ArrayList<Integer> neighbours = new ArrayList<>();
			graph.add(neighbours);
		}
		ArrayList<Integer> nbrs = graph.get(0);
		addEdge(0,1,4, nbrs);
		addEdge(0,2,5, nbrs);
		
		nbrs = graph.get(1);
		addEdge(1,0,4, nbrs);
		addEdge(1,2,6, nbrs);
		printGraph(graph);
	
		
//		//System.out.println(graph.size());
//		ArrayList<Integer> zeroneighbours = new ArrayList<>();
//		zeroneighbours.add(1);
//		zeroneighbours.add(2);
//		graph.add(zeroneighbours);
//		
//		ArrayList<Integer> One_neighbours = new ArrayList<>();
//		One_neighbours.add(0);
//		One_neighbours.add(2);
//		graph.add(One_neighbours);
//		for(int  i =0; i<graph.size(); i++) {
//			System.out.println("Vertex "+i+" "+graph.get(i));
//		}
		///System.out.println(graph);
		//System.out.println(graph.get(0));

	}

}
