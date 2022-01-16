package week_1.Union_find;

public class QuickUnionUF {
    private int[] id;
    private int[] size;

    public QuickUnionUF(int N) {
        size = new int[N];
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    // lazy approach

    private int root(int i) {
        while (id[i] != i)
            i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(q);
        int j = root(p);
        if (i == j) {
            return;
        }

        if (size[i] < size[j]) {
            id[i] = j;
            size[j] += size[i];
        }else{
            id[j] = i;
            size[i] += size[j];
        }
    }

    public void printResult() {
        String leftAlignFormat = "| %-15s | %-4d | %-4d |%n";
        System.out.format("+-----------------+------+%n");
        System.out.format("| ID name     | INDEX   | size|%n");
        System.out.format("+-----------------+------+%n");
        for (int i = 0; i < id.length; i++) {
            System.out.format(leftAlignFormat, "id:  " + id[i], i,size[i]);
        }
        System.out.format("+-----------------+------+%n");

    }
}


/*
 



*/