/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        return cloneGraph(node , new HashMap<>());
    }
    
    public Node cloneGraph(Node node ,  HashMap<Node, Node> map){
        System.out.println(node.val);
        if(map.containsKey(node)) return map.get(node);
        
        Node node2 = new Node();
        node2.val = node.val;
        map.put(node, node2);
        
        for(int i = 0 ; i < node.neighbors.size() ; i++){
            node2.neighbors.add(i ,cloneGraph(node.neighbors.get(i), map));
        }
        
        return node2;
    }
    
}