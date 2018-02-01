public class QuickFind {
  private int[] id;

  public QuickFind(int N) {
    id = new int[N];

    for(int i = 0; i < id.length; i++) {
      id[i] = i;
    }
  }

  public boolean connected(int p, int q) {
    return id[p] == id[q];
  }

  public void union(int p, int q) {
    int pid = id[p];
    int qid = id[q];

    for(int i = 0; i < id.length; i++) {
      if(id[i] == pid)
        id[i] = qid;
    }
  }

  public static void main(String[] args) {
    QuickFind qf = new QuickFind(8);

    qf.union(1, 2);
    System.out.println(qf.connected(1, 2));

    qf.union(2, 7);
    System.out.println(qf.connected(1, 7));

    System.out.println(qf.connected(3, 7));
  }
}