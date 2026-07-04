class Solution {
    List<int[]>[] adjList;
    public int minScore(int n, int[][] roads) {
        adjList= new ArrayList[n+1];
        for(int i=0;i<=n;i++) adjList[i]=new ArrayList();
        for(int[] x:roads){
            adjList[x[0]].add(new int[]{x[1],x[2]});
            adjList[x[1]].add(new int[]{x[0],x[2]});
        }

        boolean[] visi= new boolean[n+1];
        visi[1]=true;
        Queue<Integer> q= new LinkedList<>();
        q.offer(1);
        int ans=Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int u=q.poll();
            for(int[] adj:adjList[u]){
                ans=Math.min(ans,adj[1]);
                if(!visi[adj[0]]){
                    visi[adj[0]]=true;
                    q.offer(adj[0]);
                }
            }
        }
        return ans;
    }
}