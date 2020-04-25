
public class Overloading1 {
    static class Test{
    int x,y;
     Test(int x, int y){
        initialize(x,y);
    }
     void initialize(int x, int y){
        this.x = x*x;
        this.y =y*y;
    }
}
    public static void main(String[] args) {
        int x = 3, y = 5;
        Test obj = new Test(x,y);
        System.out.println(obj.x+" "+obj.y);
    }
}
