import week_1.Union_find.QuickFindUF;
import week_1.Union_find.QuickUnionUF;

public class Main {
    public static void main(String[] args) {
        QuickUnionUF findUF = new QuickUnionUF(10);
        findUF.union(4, 3);
        findUF.union(3, 8);
        findUF.union(6, 5);
        findUF.union(9, 4);
        findUF.union(6, 4);
        findUF.printResult();
    }
}
