package graph;

import java.util.HashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class BFS {
    void bfs(HashMap<Integer, ArrayList<Integer>> graph, int n){
        int startNode = 0;
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(startNode);
        boolean [] visited = new boolean[n];
        visited[startNode] = true;
        while(!dq.isEmpty()){
            int node = dq.poll();
            if(graph.containsKey(node)){
                graph.get(node).forEach((neighbour)->{
                    if(!visited[neighbour]){
                        visited[neighbour]  = true;
                        dq.offer(neighbour);
                    }
                });
            }
        }
        
    }

    public static void main(String[] args) {
        
    }
}
