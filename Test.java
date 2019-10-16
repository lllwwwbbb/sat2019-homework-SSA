public class Test {

    int x;

    public int test(int a) {
        int y = 7;
        x = 7;
        if (a > 10) {
            x = 6;
        } else {
            y = 6;
        }
        return x - y;
    }
}