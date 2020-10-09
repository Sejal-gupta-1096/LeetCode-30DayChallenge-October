/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    int i = 0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        if(root == null){
            return "X,";
        }
        
        String str = root.val + ",";
      
            str = str + serialize(root.left);
       
            str = str + serialize(root.right);
        return str;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        System.out.println(data);
        String[] arr = data.split(",");
        return deserialize(arr);
    }
    
    public TreeNode deserialize(String[] arr){
        
        if(i >= arr.length){
            return null;
        }

        
        if(arr[i].equals("X") || arr[i].equals("")){
            return null;
        }
        
        
        
        TreeNode root = new TreeNode(Integer.parseInt(arr[i]));
        i++;
        TreeNode res = deserialize(arr);
        
        if(res != null){
             System.out.println(res);
            root.left = res;
        }
        i++;
        res = deserialize(arr);
        
        if(res != null){
             System.out.println(res);
            root.right = res;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;