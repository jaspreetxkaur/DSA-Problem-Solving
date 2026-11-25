// Title: Search in a Binary Search Tree
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/search-in-a-binary-search-tree/

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        if(val< root.val){
           return searchBST(root.left,val);
        }
        return searchBST(root.right,val);
    }
}
