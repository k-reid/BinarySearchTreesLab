public class BinarySearchTreeLab_Runner
{
    public static void main(String[] args)
    {
        BinarySearchTreeLab x = new BinarySearchTreeLab();
        int[] cases = { 90, 10, 87, 33, 24, 56, 22, 66, 221, 455, 11, -90, 3, 4, 5, 6, 7, -9, 100, 200, 300};

        //for each loop through cases
        //add each value from case to the tree
        //print the tree after each add
        for(int i : cases){
            x.add(i);
            x.inOrder();
            System.out.println();}
        System.out.println();
        System.out.println("in order");
        x.inOrder();

        System.out.println();
        System.out.println();
        System.out.println("rev in order");
        x.revInOrder();

        System.out.println();
        System.out.println();
        System.out.println("pre order");
        x.preOrder();

        System.out.println();
        System.out.println();
        System.out.println("rev pre order");
        x.revPreOrder();

        System.out.println();
        System.out.println();
        System.out.println("post order");
        x.postOrder();

        System.out.println();
        System.out.println();
        System.out.println("rev post order");
        x.revPostOrder();

        System.out.println();
        System.out.println();

        System.out.println("delete:");
        //for(int i : cases) {
        x.delete(90);
        x.preOrder();
        System.out.println();
        //}

a
        System.out.println();
        System.out.println("smallest:");
        System.out.println(x.smallest());
        System.out.println();
        System.out.println("largest:");
        System.out.println(x.largest());

        System.out.println();
        System.out.println("find:");
        System.out.println(x.find(100));
        System.out.println(x.find(-100));

        //print the tree after all adds
        //use in order
        //use pre order
        //use post order
        //use reverse order

        //for each loop through cases
        //delete each value from the tree
        //print the tree after each add

    }
}
