public class diameter_tree {
    int dia=0;

    public int height(TreeNode root) {
        if(root==null) {
            return 0;
        }

        int lh=height(root.left);
        int rh=height(root.right);

        dia=Math.max((lh+rh),dia);

        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int H=height(root);
        return dia;
    }
}

