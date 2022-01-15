package week_1.Union_find;

public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    //lazy approach

    private int root(int i) {
        while(id[i] != i) i = id[i];
        return i;
    }

    public boolean connected(int p,int q) {
        return root(p) == root(q);
    }

    public void union(int p,int q){
        int rootOfQ = root(q);
        int rootOfP = root(p);

        id[rootOfP] = rootOfQ; 
    }

    //worst algorithm implementation

    // public boolean connected(int p, int q) {
    //     return id[p] == id[q];
    // }

    // public void union(int p, int q) {
    //     int pId = id[p];
    //     int qId = id[q];

    //     for (int i = 0; i < id.length; i++) {
    //         if (id[i] == pId) {
    //             id[i] = qId;
    //         }
    //     }
    // }

    



    public void printResult() {
        String leftAlignFormat = "| %-15s | %-4d |%n";
        System.out.format("+-----------------+------+%n");
        System.out.format("| ID name     | INDEX   |%n");
        System.out.format("+-----------------+------+%n");
        for (int i = 0; i < id.length; i++) {
            System.out.format(leftAlignFormat, "id:  " + id[i], i);
        }
        System.out.format("+-----------------+------+%n");

    }
}
