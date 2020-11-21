package online.pratice.code;

class Aaa{
    int i = 10;
    static void show(){
        System.out.println("Aaa中定义的show()");
    }
}

class Bbb extends Aaa{
    int i = 20;
    static void show(){
        System.out.println("Bbb中定义的show()");
    }
    public static void main(String[] args){
        Aaa a = new Aaa();
        Bbb b = new Bbb();
        Aaa c = new Bbb();
        a.show();
        b.show();
        c.show();
        ((Bbb)c).show();
        System.out.println(c.i);   //考虑此处
        System.out.println(((Bbb)c).i);   //考虑此处
    }
}
