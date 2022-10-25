public class Main {
    public static void main(String[] args) {
        System.out.println(contains(5, 1, 2, 3, 4, 5));

    }

    public static boolean contains(int a, int... varargs) {
        boolean trueOrfalse = false;
        for (int vararg : varargs) {
            if (vararg == a) {
                trueOrfalse = true;
            }
        }
        return trueOrfalse;

    }
}
