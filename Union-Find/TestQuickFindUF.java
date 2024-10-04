public class TestQuickFindUF {
    public static void main(String[] args)
    {
        QuickFindUF newFind = new QuickFindUF(10);
        System.out.println(newFind.connected(2, 3));
        newFind.union(2, 3);
        System.out.println(newFind.connected(2, 3));
    }
}
