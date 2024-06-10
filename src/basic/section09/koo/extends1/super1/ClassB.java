package basic.section09.koo.extends1.super1;

public class ClassB extends ClassA{
    public ClassB(int a){
//        super();
        this(a, 0);
        System.out.println("ClassB 생성자 a="+a);
    }

    public ClassB(int a, int b){
        super();
        System.out.println("ClassB 생성자 a="+a+" b="+b);
    }
}
