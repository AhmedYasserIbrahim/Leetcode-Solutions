import java.util.HashSet;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleGraph;

public class Solution {
    public static void main(String[] args) {
        
    }

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        Graph<Integer, DefaultWeightedEdge> graph = new SimpleGraph<>(DefaultWeightedEdge.class);
        for(int i=0; i<edges.length; i++) { //Create the weighted graph
            if(!graph.containsVertex(edges[i][0])) {
                graph.addVertex(edges[i][0]);
            }
            if(!graph.containsVertex(edges[i][1])) {
                graph.addVertex(edges[i][1]);
            }
            DefaultWeightedEdge edge = graph.addEdge(edges[i][0], edges[i][1]);
            graph.setEdgeWeight(edge, edges[i][2]);
        }
        HashSet <Integer> mySet = (HashSet<Integer>) graph.vertexSet();
        int[] count = new int[edges.length];
        for(int vertex: mySet) {
            for(int vertex2: mySet) {
                if(vertex!=vertex2) {
                    DijkstraShortestPath<Integer, DefaultWeightedEdge> dijkstra = new DijkstraShortestPath<>(graph);
                    GraphPath<Integer, DefaultWeightedEdge> path = dijkstra.getPath(vertex, vertex2);
                    if(path!= null && path.getWeight()<distanceThreshold) {
                        count[vertex]++;
                    }
                }
                
            }
        }
        int max = 0;
        int maxIndex = 0;
        for(int i=count.length-1; i>=0; i--) {
            if(count[i]>max) {
                maxIndex = i;
                max = count[i];
            }
        }
        return maxIndex;
    }
}
