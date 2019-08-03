

public class TreeBuilder{


    public static Node root;

    public TreeBuilder(){
        root=null;
    }


    public Node search(Node root,int key){
        if(root==null || root.B_number==key){
            return root;
        }
        if(key<root.B_number){
            return search(root.left,key);
        }

        return search(root.right,key);
    }




    public void insertNode(int key,String course,Node current){
        root=insertNodeRec(root,key,course,current);
    }


    public Node insertNodeRec(Node root,int key,String course,Node current){

        if(root==null){
            return current;
        }else{
            if(key<root.B_number){
                root.left=insertNodeRec(root.left,key,course,current );
            }
             else{
                root.right=insertNodeRec(root.right,key,course,current);
            }
        }
        return root;
    }



}
