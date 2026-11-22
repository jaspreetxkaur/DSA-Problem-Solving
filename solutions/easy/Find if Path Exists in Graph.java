// Title: Find if Path Exists in Graph
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-if-path-exists-in-graph/

            graph.get(v).add(u);
        }
        // use bfs 
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
         queue.add(source);
        visited[source]= true;
        while(!queue.isEmpty()){
            int node = queue.poll();
           
            if(node == destination){
                return true;
            }
