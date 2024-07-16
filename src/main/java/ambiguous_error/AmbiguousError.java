package ambiguous_error;
/*

 */
public class AmbiguousError {

    void print(int a, double b) {
        System.out.println("int, double");
    }

    void print(double a, int b) {
        System.out.println("double, int");
    }

    public static void main(String[] args) {
        AmbiguousError obj = new AmbiguousError();
        //obj.print(5, 10);  // Ambiguous error
    }
}
