package basic.section09.koo.Child;

import basic.section09.koo.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        protectedValue = 1;
//        defaultValue = 1;
//        privateValue = 1;

        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();

        printParent();
    }
}
