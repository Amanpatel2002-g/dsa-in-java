package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class DFS {

    void dfs(int node, HashMap<Integer, ArrayList<Integer>> graph, boolean [] visited){
        visited[node] = true;
        if(graph.get(node)==null){
            return;
        }
        graph.get(node).forEach((neighbour)->{
            if(!visited[neighbour]){
                dfs(neighbour, graph, visited);
            }
        });
    }

    public static void main(String[] args) {
        
    }
}
