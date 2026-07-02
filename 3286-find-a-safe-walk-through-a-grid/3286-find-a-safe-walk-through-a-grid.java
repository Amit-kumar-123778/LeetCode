class Solution {
    int[] dr={-1,1,0,0};
    int[] dc={0,0,-1,1};
    int row, col;
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        row=grid.size();
        col=grid.get(0).size();
        // return dfs(grid,health,0,0);
        boolean visi[][] = new boolean[row][col];
        PriorityQueue<int[]> q= new PriorityQueue<>((a,b)->Integer.compare(b[2],a[2]));
        if(grid.get(0).get(0)==1)
            q.offer(new int[]{0,0,health-1});
        else
            q.offer(new int[]{0,0,health});
        visi[0][0]=true;
        while(!q.isEmpty()){
           int[] curr= q.poll();
           int r=curr[0],c=curr[1],h=curr[2];
           for(int x=0;x<4;x++){
               int nr=r+dr[x];
               int nc=c+dc[x];
               if(nr>=0 && nr<row && nc>=0 && nc<col && !visi[nr][nc]){
                  if((nr==row-1 && nc==col-1)) { 
                    if(grid.get(nr).get(nc)==1 ){
                        if(h-1>0)return true;
                    } 
                    else if(h>0) return true;
                  }
                  visi[nr][nc]=true;
                  if(grid.get(nr).get(nc)==1){
                    q.offer(new int[]{nr, nc,h-1});
                  }
                  else{
                    q.offer(new int[]{nr, nc,h});
                  }
               }
           }
        }
        return false;

    }

    public boolean dfs(List<List<Integer>> grid, int h,int i, int j){
        if(i>=row || j>=col || i<0 || j<0 ) return false;
        if(grid.get(i).get(j)==-1) return false;
        if(h==0) return false;
        if((i==row-1 && j==col-1) &&((grid.get(i).get(j)==1 && (h-1)>=1) || (grid.get(i).get(j)==0 && h>=1 ))) return true;
        int t=grid.get(i).get(j); 
        grid.get(i).set(j,-1);
        boolean f=false;
        for(int x=0;x<4;x++){
            if(t==1){
               f=f||dfs(grid,h-1,i+dr[x],j+dc[x]);
            }
            else
               f=f||dfs(grid,h,i+dr[x],j+dc[x]);
        }
        grid.get(i).set(j,t);
        return f;
        
    }
}