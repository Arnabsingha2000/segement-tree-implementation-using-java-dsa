package trees;

public class SegmentMain {
    public static void main(String[] args) {
        int [] arr={3,4,9,2,7};
        SegmentTree tree=new SegmentTree(arr);
        System.out.println(tree.query(0, arr.length));
    }
}
