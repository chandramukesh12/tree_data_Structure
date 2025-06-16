    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public class symmetric_tree {
        public boolean isSymmetric(TreeNode root){
            if(root==null) return true;
            return isMirror(root.left,root.right);
        }
        public boolean isMirror(TreeNode left,TreeNode right){
            if(left==null && right==null) return true;
            if(left==null || right==null) return false;
            return (left.val==right.val) && 
                   isMirror(left.left,right.right) && 
                   isMirror(left.right,right.left);
        }
        public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        TreeNode temp1=new TreeNode(2);
        TreeNode temp2=new TreeNode(2);
        TreeNode temp3=new TreeNode(3);
        TreeNode temp4=new TreeNode(3);
        TreeNode temp5=new TreeNode(4);
        TreeNode temp6=new TreeNode(4);
        root.left=temp1;
        root.right=temp2;
        temp1.left=temp3;
        temp1.right=temp5;
        temp2.left=temp6;
        temp2.right=temp4;
        symmetric_tree st=new symmetric_tree();
        boolean ans=st.isSymmetric(root);
        System.out.print(ans);
    }
}
