package JavaCodes.prafful;

public class StatciBlock {
    static int a=10;
    static int b;
    static{
        System.out.println("This is an Static block");
        b=a*30;
    }

    public static void main(String[] args) {
        StatciBlock a=new StatciBlock();
        System.out.println(a.a+" "+a.b);
        a.a=10;
        System.out.println(a.a+" "+a.b);
        StatciBlock b=new StatciBlock();
        System.out.println(b.a+" "+b.b);
    }
}
