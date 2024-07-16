package dataStrutures_algorithms.ds.graph;

public class GraphMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph();
		System.out.println("Graph 1");
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.printGraph();
		
		g.addEdge("A","B");
		g.addEdge("A","C");
		g.addEdge("B","C");
		
		g.printGraph();
		
		g.removeEdge("A", "B");
		g.printGraph();
		
		
		Graph g2 = new Graph();
		System.out.println("Graph 2");
		g2.addVertex("A");
		g2.addVertex("B");
		g2.addVertex("C");
		g2.addVertex("D");
		
		g2.addEdge("A", "B");
		g2.addEdge("A", "C");
		g2.addEdge("A", "D");
		g2.addEdge("B", "D");
		g2.addEdge("C", "D");

		g2.printGraph();
		g2.removeVertex("D");
		g2.printGraph();
	}

}
