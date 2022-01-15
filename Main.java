import week_1.Union_find.QuickFindUF;

public class Main {
    public static void main(String[] args) {
        QuickFindUF findUF = new QuickFindUF(10);
        findUF.union(4, 3);
        findUF.union(3, 8);
        findUF.printResult();
    }
}
