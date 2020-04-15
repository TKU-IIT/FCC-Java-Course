
interface func{
    double cal(double a, double b);
}

public class avg_show {
    static void println(Object obj){System.out.println(obj);}
    static void print(Object obj){System.out.print(obj);}
    static void printf(String s, Object... obj){System.out.printf(s, obj);}
    public static void main(String[] args) {
        func result = (var a, var b) -> (a-b);
        println(result.cal(20.3, 25));
    }
}