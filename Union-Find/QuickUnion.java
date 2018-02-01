public class QuickUnion {
  private int[] id;

  public QuickUnion(int N) {
    id = new int[N];

    for(int i = 0; i < id.length; i++) {
      id[i] = i;
    }
  }

  public int root(int i) {
    while(i != id[i])
      i = id[i];
    return i;
  }

  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }

  public void union(int p, int q) {
    int i = root(p);
    int j = root(q);

    id[i] = j;
  }

  public static void main(String[] args) {
    QuickUnion qu = new QuickUnion(8);


    qu.union(1, 2);
    System.out.println(qu.connected(1, 2));

    qu.union(2, 7);
    System.out.println(qu.connected(1, 7));

    System.out.println(qu.connected(3, 7));
  }
  
}