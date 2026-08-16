class Solution {
    class Pair{
        char ch;
        int freq;
        Pair(char ch, int freq){
            this.ch=ch;
            this.freq=freq;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm= new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)-> b.freq-a.freq);
        for(char ch :hm.keySet()){
            pq.offer(new Pair(ch,hm.get(ch)));
        }
        StringBuilder sb= new StringBuilder();
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            int x=p.freq;
            char ch=p.ch;
            while(x>0){
                sb.append(ch);
                x--;
            }
        }
        return sb.toString();
    }
}