
public class func_call{
    public static int f(int x){
        int a = 100;
        a-=x;
        if(a>0)
            a=g(x+1);
        else
            a=g(20);
        return a;
    }

    public static int g(int y){
        if(y>0)
            return f(10);
        else
            return f((-1)*y);
    }
    public static void main(String[] args) {
        int test =10;
        System.out.println(g(test));
    }
}