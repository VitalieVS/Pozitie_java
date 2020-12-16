import org.junit.Test;

public class Main {
    int N = 40;
    int P = 49;

    @Test
    public void pozitie() {
       System.out.println(solve());
    }

    public String solve() {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            s.append(i);
        }
        System.out.println(s);
        return Character.toString(s.charAt(P-1));
    }
}
