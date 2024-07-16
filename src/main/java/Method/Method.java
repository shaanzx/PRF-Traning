package Method;

/*
       __________METHOD OVERLOAD____________

       Method Overloading has two types.
       (Same Method name different parameter list)=Informal definition
       (Same Method name & override equivalent signature !=) = formal definition

       Method signature = Method name & parameters වේ.

       Type Eraser = Diamond bracket ඇතුලේ තියෙන type parameters erase කරනවා.

       Sub signature =  Method name දෙකත් එකම වගේ තිබිලා parameters දෙකත් එකම වේ තිබිම වේ.



        */
public class Method {
    public static void main(String[] args) {
        myMethod(1, 2, 3);
    }

    private static void myMethod(int a, int b, int c) {
        System.out.println(a + " " + b + " " + c);
    }

    private static void myMethod(double a, double b, int c) {
        System.out.println(a + " " + b + " " + c);
    }

    private static void myMethod(float a, short b, int c) {
        System.out.println(a + " " + b + " " + c);
    }
    private static void myMethod(String a, char b, int c) {
        System.out.println(a + " " + b + " " + c);
    }
}
