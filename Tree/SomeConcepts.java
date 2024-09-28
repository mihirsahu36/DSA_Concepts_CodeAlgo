public static int height(Node root) {
       if(root == null) {
           return 0;
       }
       int leftHeight = height(root.left);
       int rightHeight = height(root.right);
       return Math.max(leftHeight, rightHeight) + 1;


public static int countOfNodes(Node root) {
       if(root == null) {
           return 0;
       }
       int leftNodes = countOfNodes(root.left);
       int rightNodes = countOfNodes(root.right);
       return leftNodes + rightNodes + 1;
   }


public static int sumOfNodes(Node root) {
       if(root == null) {
           return 0;
       }
       int leftSum = sumOfNodes(root.left);
       int rightSum = sumOfNodes(root.right);
       return leftSum + rightSum + root.data;
   }


public static int diameter(Node root) {
       if(root == null) {
           return 0;
       }
       int diam1 = height(root.left) + height(root.right) + 1;
       int diam2 = diameter(root.left);
       int diam3 = diameter(root.right);
       return Math.max(diam1, Math.max(diam2, diam3));
   }



public static TreeInfo diameter(Node root) {
       if(root == null) {
           return new TreeInfo(0, 0);
       }
       TreeInfo leftTI = diameter(root.left);
       TreeInfo rightTI = diameter(root.right);
       int myHeight = Math.max(leftTI.height, rightTI.height) + 1;
       int diam1 = leftTI.height + rightTI.height + 1;
       int diam2 = leftTI.diam;
       int diam3 = rightTI.diam;
       int myDiam = Math.max(diam1, Math.max(diam2, diam3));
       return new TreeInfo(myHeight, myDiam);
   }



public boolean isIdentical(TreeNode root,TreeNode subRoot){
       if(subRoot == null && root == null){
           return true;
       }
       if(root == null || subRoot == null){
           return false;
       }
       if(root.val == subRoot.val){
           return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
       }
       return false;
   }
  
   public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       if(subRoot == null){
           return true;
       }
       if(root == null){
           return false;
}
       if(isIdentical(root, subRoot)){
           return true;
       }
       return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
   }
