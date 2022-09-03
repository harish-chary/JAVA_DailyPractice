class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> levelOrderNodes=new ArrayList();
        if(root!=null)
            queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> currLevelNodes=new ArrayList();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
                currLevelNodes.add(node.val);
            }
            levelOrderNodes.add(currLevelNodes);
        }
        return levelOrderNodes;
    }
}
