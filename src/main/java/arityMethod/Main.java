package arityMethod;

/*
 Method එකක parameters 02ක් තියෙනවානම් Arity method වේ. මෙය කොටස් දෙකකි.

 Fixed Arity method = parameter list එකෙ අවසාන parameter එක fix values එකක්නම්(වෙනස් නොවන values)

 Variable Arity:- අවසාන parameter එකට එන value එක fix values නොවෙනම්.
 */
public class Main {
    public static void main(String[] args) {
        int x = 5;
        myMethod(x);
        myMethod(5,10,15,20);
    }

    private static void myMethod(int x) {
        //Fixed Arity Method
    }
    private static void myMethod(int... num) {
        //Variable Arity
    }
}
