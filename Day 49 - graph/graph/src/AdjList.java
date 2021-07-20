import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
	
	static void dfsCaller(ArrayList<ArrayList<Integer>>  graph, int noOfVertex) {
		boolean isVisited [] = new boolean[noOfVertex + 1];
		dfs(graph, 1, isVisited);
		
	}
	
	static void dfs(ArrayList<ArrayList<Integer>>  graph, int sourceVertex, boolean [] isVisited) {
		// mark as a true in visited array for source vertex
		isVisited[sourceVertex] = true;
		// print it 
		System.out.print(sourceVertex+" ");
		List<Integer> neighbours = graph.get(sourceVertex);
		for(Integer neighbour : neighbours) {
			if(!isVisited[neighbour]) {
				dfs(graph,neighbour,isVisited);
			}
		}
		
	}
	
	static void bfs(ArrayList<ArrayList<Integer>>  graph, int noOfVertex) {
		// create a visited array (marking which vertex is already visited
		// visited array is just a boolean array by default all of them are false (No vertex till visited)
		// if vertex is visited , so assume vertex 0 is a name of first vertex and so on.
		// so vertex identified by index, so on that index in visited array we mark as a true
		boolean isVisited [] = new boolean[noOfVertex + 1]; // In java all of them are false
		// So on BFS (Level Order), we need to maintain a Queue
		LinkedList<Integer> queue = new LinkedList<>();
		int sourceVertex = 1; // Source Vertex;
		isVisited[sourceVertex] = true; // mark visited
		queue.add(sourceVertex);
		while(queue.size()!=0) {
			sourceVertex = queue.poll();
			System.out.print(sourceVertex +" ");
			// Find out Neighbours of Source Vertex
			// Neighbour are nested ArrayList
			for(int i = 0; i<graph.get(sourceVertex).size(); i++) {
				// reach to  neighbour by neighbour
				int neighbour  = graph.get(sourceVertex).get(i);
				// check is this neighbour already visited
				if(!isVisited[neighbour]) {
					// mark visited
					isVisited[neighbour] = true;
					// add in a queue
					queue.add(neighbour);
				}
			}
		}
		
		
	}
	
	
	static void callForDisconnected(ArrayList<ArrayList<Integer>>  graph, int noOfVertex){
		boolean  isVisited [] = new boolean [noOfVertex + 1];
		for(int i = 1; i<=noOfVertex; i++) {
			if(!isVisited[i]) {
				bfsForDisconnected(graph, i, isVisited);
			}
		}
	}
	
	static void bfsForDisconnected(ArrayList<ArrayList<Integer>>  graph, int sourceVertex, boolean []isVisited) {
		// create a visited array (marking which vertex is already visited
		// visited array is just a boolean array by default all of them are false (No vertex till visited)
		// if vertex is visited , so assume vertex 0 is a name of first vertex and so on.
		// so vertex identified by index, so on that index in visited array we mark as a true
		//boolean isVisited [] = new boolean[noOfVertex + 1]; // In java all of them are false
		// So on BFS (Level Order), we need to maintain a Queue
		LinkedList<Integer> queue = new LinkedList<>();
		//int sourceVertex = 1; // Source Vertex;
		isVisited[sourceVertex] = true; // mark visited
		queue.add(sourceVertex);
		while(queue.size()!=0) {
			sourceVertex = queue.poll();
			System.out.print(sourceVertex +" ");
			// Find out Neighbours of Source Vertex
			// Neighbour are nested ArrayList
			for(int i = 0; i<graph.get(sourceVertex).size(); i++) {
				// reach to  neighbour by neighbour
				int neighbour  = graph.get(sourceVertex).get(i);
				// check is this neighbour already visited
				if(!isVisited[neighbour]) {
					// mark visited
					isVisited[neighbour] = true;
					// add in a queue
					queue.add(neighbour);
				}
			}
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		System.out.println("Enter the Total Vertex");
		Scanner scanner = new Scanner(System.in);
		int totalVertex = scanner.nextInt();
		
		for(int i = 1; i<=(totalVertex+1); i++) {
			// Adding Blank Neighbour
			ArrayList<Integer> neighbours = new ArrayList<>();
			graph.add(neighbours);
		}
		ArrayList<Integer> nbrs = graph.get(0);
		addEdge(1,2,0, graph.get(1));
		addEdge(2,1,0, graph.get(2));
		addEdge(1,3,0, graph.get(1));
		addEdge(3,1,0, graph.get(3));
		addEdge(1,6,0, graph.get(1));
		addEdge(6,1,0, graph.get(6));
		addEdge(2,4,0, graph.get(2));
		addEdge(4,2,0, graph.get(4));
		addEdge(4,6,0, graph.get(4));
		addEdge(3,5,0, graph.get(3));
		addEdge(5,3,0, graph.get(5));
		addEdge(5,6,0, graph.get(5));
		addEdge(6,5,0, graph.get(6));
		addEdge(6,4,0, graph.get(6));
		dfsCaller(graph, totalVertex);
		// For Disconnected 
		/*addEdge(1,2,0, graph.get(1));
		addEdge(1,3,0, graph.get(1));
		addEdge(2,1,0, graph.get(2));
		addEdge(2,3,0, graph.get(2));
		addEdge(3,1,0, graph.get(3));
		addEdge(3,2,0, graph.get(3));
		
		addEdge(4,5,0, graph.get(4));
		addEdge(5,4,0, graph.get(5));
		
		addEdge(6,7,0, graph.get(6));
		addEdge(6,8,0, graph.get(6));
		addEdge(7,6,0, graph.get(7));
		addEdge(7,8,0, graph.get(7));
		addEdge(8,6,0, graph.get(8));
		addEdge(8,7,0, graph.get(8));*/
		System.out.println("**********************************");
		printGraph(graph);
		System.out.println("**********************************");
		
		bfs(graph,totalVertex);
		//callForDisconnected(graph, totalVertex);
//		nbrs = graph.get(1);
//		addEdge(1,0,4, nbrs);
//		addEdge(1,2,6, nbrs);
//		printGraph(graph);
	
		
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
