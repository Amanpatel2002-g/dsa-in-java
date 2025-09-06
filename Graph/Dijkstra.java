package graph;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.ArrayList;

class Pair<T, U>{
    public T x;
    public U y;

    public Pair(T x, U y){
        this.x = x;
        this.y = y;
    }
}

public class Dijkstra {



    int dijkstra(HashMap<Integer, ArrayList<Pair<Integer, Integer>>> graph, int u, int v, int n){
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>((a, b)->{
            return a.y - b.y;
        });
        int [] dis = new int[n];

        for(int i = 0; i<n; i++){
            dis[i] = Integer.MAX_VALUE;
        }
        dis[u] = 0; 
        pq.offer(new Pair<Integer, Integer>(u, 0));

        while(!pq.isEmpty()){

            Pair<Integer, Integer> p = pq.poll();
            if(p.x==v){
                return p.y;
            }
            int currNode = p.x;
            int currDist = p.y;
            if (currDist > dis[currNode]) continue;
            if(graph.containsKey(currNode)){
                graph.get(currNode).forEach((neigh->{
                    if(dis[neigh.x]>neigh.y + p.y){
                        dis[neigh.x] = neigh.y + p.y;
                        pq.offer(new Pair<Integer, Integer>(neigh.x, dis[neigh.x]));
                    }
                }));
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        
    }
}
