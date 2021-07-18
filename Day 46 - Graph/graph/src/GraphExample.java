import java.util.HashMap;
import java.util.Map;

class Vertex{
	//String name;
	HashMap<String, Integer> neighbours = new HashMap<>();
}
class Graph{
	HashMap<String, Vertex> vertices = new HashMap<>();
	// count of all vertex in graph
	public int countVertex() {
		return vertices.size();
	}
	// Vertex Exist in Graph
	public boolean containsVertex(String vertexName) {
		return vertices.containsKey(vertexName);
	}
	// Add a New Vertex
	public void addVertex(String vertexName) {
		Vertex vertex = new Vertex();
		vertices.put(vertexName, vertex);
		
	}
	public boolean isEdgeExist(String firstVertexName, String secondVertexName) {
		Vertex first = vertices.get(firstVertexName);
		Vertex second = vertices.get(secondVertexName);
		if(first == null || second == null || !first.neighbours.containsKey(secondVertexName)) {
			return false;
		}
		return true;
	}
	public void addEdge(String firstVertexName, String secondVertexName, int weight) {
		// Check already edge is created or not
		if(isEdgeExist(firstVertexName, secondVertexName)) {
			System.out.println("Edge Already Present B/w "+firstVertexName +  " "+secondVertexName);
		}
		else {
			Vertex first = vertices.get(firstVertexName);
			Vertex second = vertices.get(secondVertexName);
			first.neighbours.put(secondVertexName, weight);
			second.neighbours.put(firstVertexName, weight);
		}
	}
	
	public void print() {
		for(Map.Entry<String, Vertex> currentVertex : vertices.entrySet()) {
			System.out.println("VName "+currentVertex.getKey() + " Neighbour "+currentVertex.getValue().neighbours);
		}
	}
	public void removeEdge(String firstVertexName, String secondVertexName) {
		if(isEdgeExist(firstVertexName, secondVertexName)) {
			Vertex first = vertices.get(firstVertexName);
			Vertex second = vertices.get(secondVertexName);
			first.neighbours.remove(secondVertexName);
			second.neighbours.remove(firstVertexName);
			System.out.println("Remove Done...");
		}
		else {
			System.out.println("No Edge Present so can't Delete ");
		}
	}
	
	public void removeVertex(String vertexName) {
		Vertex vertex = vertices.get(vertexName);
		if(vertex==null) {
			System.out.println("No Vertex Exist ");
			return ;
		}
		for(Map.Entry<String, Integer> currentVertex : vertex.neighbours.entrySet()) {
			Vertex v = vertices.get(currentVertex.getKey());
			v.neighbours.remove(vertexName);
		}
		vertices.remove(vertexName);
		System.out.println("Vertex Deleted "+vertexName);
		
	}
}
public class GraphExample {

	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addEdge("A", "B", 3);
		graph.addEdge("A", "D", 2);
		graph.addEdge("B", "C", 5);
		graph.addEdge("C", "D", 4);
		graph.print();
		graph.removeEdge("C", "D");
		System.out.println("After Remove C and D Edge");
		graph.print();
		graph.removeVertex("A");
		System.out.println("After Remove A Vertex");
		graph.print();
		
		

	}

}
