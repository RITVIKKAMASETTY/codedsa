public class trees
{
    static class info
    {
        int a;
        int height;
        public info(int a,int height)
        {
            this.a=a;
            this.height=height;
        }
    }
   static public class Node
  {
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
  }  
  static class Binarytree
  {
    static int  idx=-1;
    public static Node BBinarytree(int nodes[])
    {
        if(idx==14)
        {
            idx=-1;
        }
        idx=idx+1;
        if(nodes[idx]==-1)
        {
            return(null);
        }
        Node newNode=new Node(nodes[idx]);
        newNode.left=BBinarytree(nodes);
        newNode.right=BBinarytree(nodes);
        return newNode;
    }
    public static int height(Node root)
    {
        if(root==null)
        {
            return(0);
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        return(Math.max(leftheight,rightheight)+1);
    }
    public static int a(Node root)
    {
        if(root==null)
        {
            return(0);
        }
        int la=a(root.left);
        int lh=height(root.left);
        int ra=a(root.right);
        int rh=height(root.right);
        int b=la+ra+1;
        return(Math.max(b,Math.max(lh,rh)));
    }
    public static void  print(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
    public static info b(Node root)
    {
        if(root==null)
        {
            return(new info(0,0));
        }
        info left=b(root.left);
        info right=b(root.right);
        int a=Math.max(left.a+right.a+1,Math.max(left.a,right.a));
        int height=Math.max(left.height,right.height)+1;
        return(new info(a,height));
    }
    public static boolean issubtree(Node root,Node subroot)
    {
        if(root==null)
        {
            return(false);
        }
        if(root.data==subroot.data)
        {
            if(isidentical(root,subroot))
            {
                return(true);
            }
        }
        boolean left=issubtree(root.left,subroot);
        boolean right=issubtree(root.right,subroot);
        return(left||right);
    }
    public static boolean isidentical(Node root,Node subroot)
    {
        if(root==null&&subroot==null)
        {
            return(true);
        }
        if(root==null||subroot==null||root.data!=subroot.data)
        {
            return(false);
        }
        if(!isidentical(root.left,subroot.left))
        {
            return(false);
        }
        if(!isidentical(root.right,subroot.right))
        {
            return(false);
        }
        return(true);
    }
}
  public static void main(String args[])
  {
    int nodes1[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
    int nodes2[]={2,4,-1,-1,5,-1,-1};
    Binarytree a = new Binarytree();
    Node root=a.BBinarytree(nodes1);
    System.out.println(a.a(root));
    System.out.println(a.b(root).a);
    System.out.println(a.b(root).height);
    Binarytree b=new Binarytree();
    Node subroot=b.BBinarytree(nodes2);
    System.out.println(a.issubtree(root,subroot));
  }
}