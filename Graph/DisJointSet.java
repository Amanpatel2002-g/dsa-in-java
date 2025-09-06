package graph;


class DisJoint{

    private int n; // number of nodes
    // By Rank
    private int[] rank;
    private int[] parent;

    DisJoint(int n){
        this.n = n;
        this.rank = new int[n+1];
        this.parent = new int[n+1];

        for(int i = 0; i<=n; i++){
            rank[i]  = 0;
            parent[i] = i;
        }
    }

    public int findParent(int node){
        if(parent[node]==node){
            return node;
        }
        parent[node] = findParent(parent[node]);
        return parent[node];
    }

    public void union(int u, int v){
        int Uparent = findParent(u);
        int Vparent = findParent(v);

        if(rank[Uparent]>rank[Vparent]){
            parent[Vparent] = Uparent;
        }
        else if(rank[Vparent]>rank[Uparent]){
            parent[Uparent] = Vparent;
        }
        else{
            rank[Uparent]++;
            parent[Vparent] = Uparent; 
        }
    }
}

public class DisJointSet {
    
}
